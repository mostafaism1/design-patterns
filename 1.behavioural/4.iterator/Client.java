public class Client {

	public static void main(String[] args) {

		IterableCollection<Integer> collection = new ConcreteIterableCollection<>();

		for (int i = 0; i < 10; i++) {
			collection.add(i);
		}

		Iterator<Integer> forwardIter = collection.createForwardIterator();
		Iterator<Integer> backwardIter = collection.createBackwardIterator();

		System.out.println("Iterating forward: ");
		while (forwardIter.hasMore()) {
			System.out.println(forwardIter.getNext());
		}

		System.out.println("Iterating backward: ");
		while (backwardIter.hasMore()) {
			System.out.println(backwardIter.getNext());
		}

	}
}