package eg00230;

import java.util.Date;
import java.util.Map;
import java.util.Map.Entry;

public class MyObserver extends ObserverRead {

	SubjectRead sub;

	public MyObserver(SubjectRead sub) {
		super();
		this.sub = sub;
		this.sub.attach(this);
	}

	@Override
	public void update() {
		Map<String, URLConfig> map = sub.getCache();
		System.out.println(new Date(System.currentTimeMillis()));
		for (Entry<String, URLConfig> e : map.entrySet()) {
			if (e.getValue().getStatus() > 0)
				System.out.println("Key:" + e.getKey() + "     " + "value:" + e.getValue().toString());
		}

	}

}
