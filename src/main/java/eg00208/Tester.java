package eg00208;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Tester {

	public static void main(String[] args) throws IOException {

		Singleton singleton1 = Singleton.getInstance();
		Singleton singleton2 = null;
		ObjectOutputStream oos = null;
		FileOutputStream fos = null;

		try {
			fos = new FileOutputStream("singleton.ser");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(singleton1);
			oos.flush();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (oos != null) {
				oos.close();
			}
		}

		ObjectInputStream ois = null;
		FileInputStream fis = null;

		try {
			fis = new FileInputStream("singleton.ser");
			ois = new ObjectInputStream(fis);
			singleton2 = (Singleton) ois.readObject();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (ois != null)
				try {
					{
						ois.close();
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
		}

		System.out.println(singleton1.hashCode());
		System.out.println(singleton2.hashCode());
	}

}


