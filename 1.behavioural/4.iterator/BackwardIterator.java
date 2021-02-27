public class BackwardIterator<T> implements Iterator<T> {

	private IterableCollection<T> collection;
	private int position;

	public BackwardIterator(IterableCollection<T> collection) {
		this.collection = collection;
		this.position = collection.size() - 1;
	}

	@Override
	public T getNext() {
		if (hasMore()) {
			return collection.get(position--);
		} else {
			return null;
		}
	}

	@Override
	public boolean hasMore() {
		return position >= 0;
	}

}