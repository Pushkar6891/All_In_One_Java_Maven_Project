package eg00093;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class SerializationDemo {

	public static void main(String[] args) throws IOException {

		System.out.println("Serialization Started...");
		String filepath = "person93.ser";
		File file = new File(filepath);
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		List<Person> list = new ArrayList<>();
		list.add(new Person(101, "Pushkar"));
		list.add(new Person(102, "Amit"));
		oos.writeObject(list);
		System.out.println("Serialized list : " + list);
		oos.close();
		fos.close();
		System.out.println("Serialization Completed...");
	}
}
