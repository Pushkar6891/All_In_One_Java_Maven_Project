package eg00226;

public class CollectionImpl implements Collection {

	String arr[] = { "Pushkar", "KK", "PK", "Mark", "Sean" };

	@Override
	public Iterator getIterator() {
		return new IteratorImpl();
	}

	private class IteratorImpl implements Iterator {

		int index = 0;

		@Override
		public boolean hasNext() {
			if (index < arr.length)
				return true;
			return false;
		}

		@Override
		public Object next() {
			if (this.hasNext())
				return arr[index++];
			return null;
		}

	}

}
