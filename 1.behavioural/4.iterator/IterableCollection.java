public interface IterableCollection<T> {

	public Iterator<T> createForwardIterator();

	public Iterator<T> createBackwardIterator();

	public void add(T element);

	public T get(int position);

	public int size();

}