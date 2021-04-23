package LinkedList;

public class Element {
	private Element pointerToPreviousElement = null;
	private Element pointerToNextElement = null;
	private Object storage = null;
	
	public Element(Object toStore) {
		this.storage = toStore;
	}
	
	public void store(Object toStore) {
		this.storage = toStore;
	}
	
	public void setPrevious(Element prev) {
		this.pointerToPreviousElement=prev;
	}
	
	public void setNext(Element next) {
		this.pointerToNextElement = next;
	}
	
	public Object get() {
		return this.storage;
	}
	
	public Element getPrevious() {
		return this.pointerToPreviousElement;
	}
	
	public Element getNext() {
		return this.pointerToNextElement;
	}
}