package eg00093;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class DeserializationDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		System.out.println("Deserialization Started...");
		String filepath = "person93.ser";
		File file = new File(filepath);
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);
		List<Person> readObject = (List<Person>) ois.readObject();
		List<Person> list = readObject;
		System.out.println("Deserialized list : " + list);
		ois.close();
		fis.close();
		System.out.println("Deserialization Completed...");
	}
}
