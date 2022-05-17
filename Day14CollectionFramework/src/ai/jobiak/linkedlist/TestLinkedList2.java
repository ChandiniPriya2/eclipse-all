package ai.jobiak.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class TestLinkedList2 {

	public static void main(String[] args) {
		LinkedList<String> l=new LinkedList<>();
		l.add("ravi");
		l.add("John");
		l.add("James");
		l.add("Angel");
		l.add("Bumra");
	/*	Iterator<String> iter=l.descendingIterator();
		while(iter.hasNext()) {
		System.out.println(iter.next());
		}*/
		l.addFirst("Singh");
		l.addLast("Shyam");
		l.add("Singh");
		System.out.println(l);
		l.add("Singh");
		l.removeFirstOccurrence("Singh");
	System.out.println(	l.getFirst());
	System.out.println(l.peek());
	System.out.println(l.poll()); //retrieves and removes the first element
		System.out.println(l.pop()); //deletes first element
		System.out.println(l.remove()); //removes first element
		
	}

}
