public class ForwardIterator<T> implements Iterator<T> {

	private IterableCollection<T> collection;
	private int position;

	public ForwardIterator(IterableCollection<T> collection) {
		this.collection = collection;
		this.position = 0;
	}

	@Override
	public T getNext() {
		if (hasMore()) {
			return collection.get(position++);
		} else {
			return null;
		}
	}

	@Override
	public boolean hasMore() {
		return position < collection.size();
	}

}