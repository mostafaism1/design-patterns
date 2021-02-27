
import java.util.List;
import java.util.ArrayList;

public class ConcreteIterableCollection<T> implements IterableCollection<T> {

	private List<T> collection;

	public ConcreteIterableCollection() {
		this.collection = new ArrayList<>();
	}

	@Override
	public Iterator<T> createForwardIterator() {
		return new ForwardIterator(this);
	}

	@Override
	public Iterator<T> createBackwardIterator() {
		return new BackwardIterator(this);
	}

	@Override
	public void add(T element) {
		this.collection.add(element);

	}

	@Override
	public T get(int position) {
		return this.collection.get(position);
	}

	@Override
	public int size() {
		return collection.size();
	}

}