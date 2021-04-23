package LinkedList;

public class MyLinkedListImplementation {
	private Element first = null;
	private int count = 0;
	
	public void add(Object anObject) {
		if (first==null) {
			first= new Element(anObject);
			count++;
		}
		else {
			Element last = first;
			while (last.getNext() != null) {
					last = last.getNext();				
			}
			Element newLast = new Element(anObject);
			newLast.setPrevious(last);
			last.setNext(newLast);
			count++;
		}
	}
	
	public Object getFirst() {
		return first.get();
	}
	
	public Object getLast() {
		if (first == null) {return null; }
		Element last = first;
		while (last.getNext() != null) {
			last = last.getNext();				
		}
		return last.get();
	}
	
	public int size() {
		return count;
	}
}
