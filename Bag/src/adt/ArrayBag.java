package adt;
import java.util.Arrays;
public class ArrayBag<T> implements BagInterface<T> {

	private T[] bag;
	private int numEntries = 0; // points to the index of the next entry to add
	private static final int DEFAULT_CAPACITY = 10;
	
	public ArrayBag() {
		//bag = (T[]) new Object[DEFAULT_CAPACITY];
		this(DEFAULT_CAPACITY);
	}	
	@SuppressWarnings("unchecked")
	public ArrayBag(int capacity) {
		bag = (T[]) new Object[capacity];
	}
	@Override
	public int getCurrentSize() {
		return numEntries;
	}
	@Override
	public boolean isEmpty() {
		return numEntries==0;
	}
	@Override
	public boolean add(T newEntry) {	
		if (!isArrayFull()) {
			bag[numEntries] = newEntry;
			numEntries++;
			return true;
		}	
		return false;
	}
	private boolean isArrayFull() {
		return numEntries >= bag.length;
	}
	@Override
	public T remove() {
		numEntries--; // numEntries -= 1 OR numEntries = numEntries - 1
		T temp = bag[numEntries];
		bag[numEntries] = null;
		return temp;
	}
	@Override
	public boolean remove(T anEntry) {
		// loop through the bag
		for (int i = 0; i < numEntries; i++) {
			// compare item to anEntry
			if (bag[i].equals(anEntry)) {
				// remove it
				bag[i] = bag[numEntries-1];
				numEntries--;
				bag[numEntries] = null; //optional
				return true;
			}
		}
		return false;
	}
	@Override
	public void clear() {
		while (!isEmpty())
			remove();
	}
	@Override
	public int getFrequencyOf(T anEntry) {
		int counter = 0;
		for (int index = 0; index < numEntries; index++) {
			if (anEntry.equals(bag[index])) {
				counter ++;
			}
		}
		return counter;
	}
	@Override
	public boolean contains(T anEntry) {
		boolean found = false;
		int index = 0;
		while (!found&&(index<numEntries)) {
			if (anEntry.equals(bag[index])){
				found = true;
			}
			index ++;
		}
		return found;
	}
	@Override
	public T[] toArray() {
		//T[] r = new T[numEntries]; // Java won't let us do this
//		T[] result = (T[])new Object[numEntries];
//		for (int i = 0; i < numEntries; i++)
//			result[i] = bag[i];
		//return result;
		//return (T[]) bag.clone(); // throws null pointer exception when called in for each
		return Arrays.copyOf(bag, numEntries);
	}
	public String toString() {
		String s = "";
		for (T item : this.toArray())
			s += item.toString() + " ";
		return s;
	}
	// Client to test our implementation
	public static void main(String[] args) {
		BagInterface<String> b = new ArrayBag<String>();
		b.add("orange");
		for (int i = 0; i < 10; i++) {
			if (!b.add("apple"))
				System.err.println("Oops, bag full! " + i);
		}
		System.out.println(b);
		b.remove("orange");
		System.out.println(b);
		/*for ( Object entry : b.toArray() )
			System.out.println((String)entry);*/
	}

}
