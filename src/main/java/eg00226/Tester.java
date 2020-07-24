package eg00226;

public class Tester {

	public static void main(String[] args) {
		CollectionImpl collectionImpl = new CollectionImpl();
		Iterator iterator = collectionImpl.getIterator();
		while (iterator.hasNext()) {
			Object object = iterator.next();
			String name = (String) object;
			System.out.println("Name : " + name);
		}
	}

}
