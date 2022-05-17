package ai.jobiak.arraylist;

import java.util.*;


public class TestArrayList {

	public static void main(String[] args) {
	ArrayList list=new ArrayList();
	System.out.println(list.size());
	list.add("Thinking in java");
	list.add("java unleashed");
	list.add("java for dummies in 21 days");
	list.add("Head First java");
	list.add("java in Action");
	System.out.println(list.size());
	System.out.println(list);
	list.add("Head first Design patterns");
	list.add("The java EE server programming");
	System.out.println(list.size());       //to know the size of the array list
	System.out.println(list.get(5));     //retrieving particular obj from arraylist
	System.out.println(list.contains("thinking in java")); //checking particular obj
	List list1=list;
	System.out.println(list1);
	Collection collection=list1;
	System.out.println(collection);
	Iterator iter=collection.iterator();
	while(iter.hasNext()) {
		System.out.println(iter.next());
	}
	for(Object obj:collection) {
		System.out.println(obj);
	}
	Collections.sort(list1);           //sorting of elements
	System.out.println(collection);
	int found=Collections.binarySearch(list1,"Thinking in java");//Searching
	System.out.println(found);
	Object books[]=collection.toArray();
	System.out.println(books.length);
	List listOfBooks=Arrays.asList(books);
	System.out.println(listOfBooks);
	
	}

}
