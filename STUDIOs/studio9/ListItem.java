package studio9;

/**
 * This is a "worker class" that helps us implement a Linked List. Each element
 * of the linklist is a ListItem A ListItem has-a integer value that it
 * contains, and it has-a reference to yet another ListItem, which may be null.
 * 
 * We are going to explore 3 different kinds of linked lists. Two of them are
 * singly linked: each item has a reference to just one other item. One is
 * doubly linked: it has two references to items.
 * 
 * This class represents the bubbles (nodes) you see in 23.pdf page 2
 * 
 * We will one instance of this class for everything that is in a list.
 * 
 * @author cytron
 *
 */
public class ListItem {

	final private int value; // the contained value in this item
	ListItem next; // the next item in this list
	ListItem prev; // the previous item in this list

	public ListItem(int value, ListItem next) {
		this.value = value;
		this.next = next;
		this.prev = null;
	}

	/**
	 * I've looked ahead and know this will be useful...
	 * 
	 * @param newNext
	 *            the "new next" of this item
	 */
	public void setNext(ListItem newNext) {
		this.next = newNext;
	}

	// a getter, or accessor
	//
	public void setPrev(ListItem newPrev) {
		this.prev = newPrev;
	}

	public ListItem getNext() {
		return next;
	}

	public ListItem getPrev() {
		return prev;
	}

	public int getValue() {
		return value;
	}

}
