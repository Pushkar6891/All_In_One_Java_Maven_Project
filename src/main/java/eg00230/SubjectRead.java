package eg00230;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class SubjectRead {

	private List<ObserverRead> observer = new ArrayList<ObserverRead>();

	public void attach(ObserverRead obs) {
		observer.add(obs);
	}

	private Map<String, URLConfig> cache = new HashMap<String, URLConfig>();

	public Map<String, URLConfig> getCache() {
		return cache;
	}

	public void setCache(Map<String, URLConfig> cache) {
		this.cache.putAll(cache);
	}

	public Map<String, URLConfig> readfile() {
		Map<String, URLConfig> map = new HashMap<String, URLConfig>();
		try {
			File f = new File("config.txt");
			Scanner sc = new Scanner(f);
			while (sc.hasNextLine()) {
				URLConfig urlConfig = new URLConfig();
				String line = sc.nextLine();
				String[] details = line.split(" ");
				String rowno = details[0];
				String url = details[1];
				String freq = details[2];
				urlConfig.setRowId(rowno);
				urlConfig.setUrl(url);
				urlConfig.setFreq(freq);
				map.put(url, urlConfig);
				// cache.putAll(map);
			}
		} catch (IndexOutOfBoundsException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return map;
	}

	public void filereader() throws InterruptedException {
		while (true) {
			Map<String, URLConfig> map = readfile();
			// is cache has any data
			if (cache.size() == 0) {
				for (Entry<String, URLConfig> entry : map.entrySet()) {
					entry.getValue().setStatus(URLConfig.STATUS_ADDED);
				}
				setCache(map);
			} else {

				for (Entry<String, URLConfig> entry : map.entrySet()) {
					if (cache.containsKey(entry.getKey())) {
						URLConfig configEntry = cache.get(entry.getKey());
						if (!configEntry.equals(entry.getValue())) {
							// find newly updated rows
							entry.getValue().setStatus(URLConfig.STATUS_UPDATED);
						}
					} else {
						// find newly added rows
						entry.getValue().setStatus(URLConfig.STATUS_ADDED);
					}

					cache.put(entry.getKey(), entry.getValue());
				}
			}
			// for(Entry<String, List<String>> e=map.entrySet()){

			/*
			 * if (map.equals(cache)) { System.out.println("file not updated till now"); }
			 * else { System.out.println("file updated"); notifyAllObserver(); }
			 * 
			 */
			notifyAllObserver();
			Thread.sleep(5000);
		}
	}

	// cache.putAll(map);
	/*
	 * for(java.util.Map.Entry<String, List<String>> e: map.entrySet()) {
	 * if(cache.equals(e.getKey())) { System.out.println("hiiii"); } else{
	 * System.out.println(" byeeee"); notifyAllObserver(); }
	 */

	public void notifyAllObserver() {
		for (ObserverRead obs : observer) {
			obs.update();
		}

	}
}
