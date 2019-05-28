package com.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

import com.example.model.Person;
import com.example.model.PersonNameCompare;

public class collection {
	
	void method1(int x) {
		System.out.println(x);
	}
	
	public List<Long> methodName(long l){
		System.out.println(l);
		method1((int)l);
		
		return l;
	}
	
	
	static int s = 5;
	int i;
	collection(){
		int i=4;
		this.i=4;
	}
	collection(int n){
		this.i=n;
	}
	
	public static void main(String[] args) {
		/*
		 * A list keeps track of the order of the elements
		 * 		This lets you know where you're elements are and allows
		 * 		you to access them in order
		 * 	An arrayList is inefficient when it comes to adding, removing and finding elements
		 * 		however, it is forgiving and easily used
		 * 	A linkedList is efficient in adding, removing, but not finding elements
		 * 		Don't write in pen
		 * 		A Linked list allows for very easy access of the first and last element
		 * 		but not finding anything else
		 * 		Linked List also implements queue as well as the list interfaces
		 * 	
		 * 
		 * 		
		 */
		
		List<String> strList = new ArrayList<>();
		strList.add("collapse");
		strList.add("enterprises");
		strList.add("awesome");
		strList.add("Baseballs");
//		System.out.println(strList);
//		collection coll = new collection() ;
//		System.out.println(coll.i);
//		collection coll1 = new collection(65);
//		System.out.println(coll1.i);
//		System.out.println(collection.s);
		Collections.sort(strList);
//		System.out.println(strList);
		
		
		
		/*
		 * The iterator will have a spot in between each element
		 * 		the first element will be the zero'th element in the 
		 * 		sequence.
		 */
		
		
		
		ListIterator<String> iter = strList.listIterator();
		
		
		
		/*
		 * The craziness below will give a NoSuchElementException
		 * 		this is because it is trying to find the next element but cannot find one
		 */
		
		
		
		
		
//		System.out.println(iter.nextIndex());
//		System.out.println(iter.next());		System.out.println(iter.next());
//		System.out.println(iter.next());
//		System.out.println(iter.next());
//		System.out.println(iter.next());
//		System.out.println(iter.next());
//		System.out.println(iter.next());
//		System.out.println(iter.next());
//		System.out.println(iter.next());
//		System.out.println(iter.next());
//		System.out.println(iter.next());
//		System.out.println(iter.next());
//		System.out.println(iter.next());
//		System.out.println(iter.next());
//		System.out.println(iter.next());
//		System.out.println(iter.next());
//		System.out.println(iter.next());
//		System.out.println(iter.next());
//		System.out.println(iter.next());
//		System.out.println(iter.next());
//		System.out.println(iter.next());
//		System.out.println(iter.next());
//		System.out.println(iter.next());
//		System.out.println(iter.next());
//		System.out.println(iter.next());
//		System.out.println(iter.next());

		
		
		
		/*
		 * dont try to go back or forward if you dont know the position
		 * Also do not try to remove something twice. If you try, you will get an IllegalStateException
		 */
		
		
		
		
//		if(iter.hasNext()) {
//			System.out.println(iter.next());
//		}else {
//			System.out.println(iter.previous());
//		}
//		
//		while(iter.hasNext()) {
//			System.out.println(iter.next());
//		}
//		while(!iter.hasNext()) {
//			System.out.println(iter.next());
//		}
	//	System.out.println(strList);
		
//		System.out.println(iter.next());
//		iter.next();
//		iter.previous();
//		iter.next();
//		iter.remove();
//		System.out.println(strList);
//		iter.previous();
//		iter.remove();
//		System.out.println(strList);
		
		
		/*
		 * The enhanced for loop or for each loop will use the iterator behind the scenes
		 * 	to move to the next element and do whatever logic is inside the body.
		 */
		
		
//		for(String dogBreath:strList) {
//			System.out.println(dogBreath);
//		}
		
		//System.out.println(iter.nextIndex());
		//iter.previous();
		
		//System.out.println(iter.nextIndex());
		
//		char c = 78;
//		System.out.println(c);
		
		/*
		 *  A set does not keep the order of the elements
		 *  	Depending on the type of set, it will organize itself however it needs
		 *  	to make itself more efficient for adding, removing and finding elements
		 *  
		 */
		
		
		/*
		 * HashSet implements Hash Table and organizes as need be
		 * 		It needs to be able see if objects are equal
		 * 		So the class will need to give an implementation 
		 * 		for hashcode() and equals() methods.
		 * 
		 * A TreeSet implements Binary Search Tree, it organizes by size, or however the 
		 * 		class is set up to be compared
		 * 		so the class needs to implement the comparable interface
		 */
		
		Set<String> strSet = new TreeSet<>();
		strSet.add("however we want");
		strSet.add("adding and removing elements from a set is a drag.");
		strSet.add("This needs to be better managed");
		strSet.add("Where is your manager");
//		System.out.println(strSet);
		Integer n = new Integer(5);
		n.equals(5);
		String str = new String("compare");
		str.equals(":this");
		String str2 = "compare";
//		System.out.println(str == str2);
//		System.out.println(str.equals(str2));
		int x =6;
		int y = 5;
//		System.out.println(x==y);
		
		int i =4;
		int j = i;
		i =5;
//		System.out.println(j);
		
		Set<Person> per = new TreeSet<>();
		per.add(new Person("Billy", 40, true, 'm'));
		per.add(new Person("George", 0, false, 'm'));
		per.add(new Person("Sally", 81, true, 'f'));
//		System.out.println(per);		
		Iterator<String> it = strSet.iterator();
//		it.
//		iter.
		
		/*
		 * The iterator is different for lists than it is for\
		 * 		the main iterator. Mainly, ListIsterator is different than iterator.
		 * List iterator will add methods for adding, echecking back so forth and so on
		 * 
		 */
		
		
		
		
		Map<Integer, String> strMap = new HashMap<>();
		strMap.put(5, "thats the way we need it");
		strMap.put(8, "no it isnt");
		strMap.put(4, "QC");
		strMap.put(2, "jhfbvwr");
//		System.out.println(strMap);
//		Collections.sort(strList);
		Set<Integer> keySet = strMap.keySet();
//		for(Integer iunt: keySet)
		for(Integer tempSet:strMap.keySet()) {
//			System.out.println(tempSet);
//			System.out.println(strMap.get(tempSet));
		}
		
		/*
		 * In conclusion Maps are very fast, like faster than the others in that silly collection
		 * 		stuff ahahahahahaahahahah
		 */
		
		Queue<String> maybe = new PriorityQueue<String>();
		maybe.add("compare");
		maybe.add("This is another string");
		maybe.add("this is msipelled");
		System.out.println(maybe.remove());
		Queue<Integer> that = new PriorityQueue<Integer>();
		that.add(5);
		that.add(1);
		that.add(16);
//		System.out.println(that.remove());
		
		Queue<Person> personq = new PriorityQueue<Person>();
		personq.add(new Person("Billy", 40, true, 'm'));
		personq.add(new Person("George", 0, false, 'm'));
		personq.add(new Person("Sally", 81, true, 'f'));
//		System.out.println(personq.remove());
		
		
		List<Person> persList = new ArrayList<>();
		persList.add(new Person("Billy", 40, true, 'm'));
		persList.add(new Person("George", 0, false, 'm'));
		persList.add(new Person("Sally", 81, true, 'f'));
		System.out.println(persList);
		Collections.sort(persList);
		System.out.println(persList);
		
		Collections.sort(persList, new PersonNameCompare());
		System.out.println(persList);
		
		/*
		 * the lovely comments
		 * 		who here is here for the comments?
		 * 
		 * Collections.sort is a static method inside the collections class
		 * 		this class is different than the collection interface
		 * 		it will sort the objects according to the classes compareTo()
		 * 		method.
		 * 
		 * The comparable interface gives our classes a natural sorting order 
		 * 		the class gives implementation for the compareTo() method
		 * 
		 * The comparator interface gives an unnatural sorting order for our classes
		 * 		the class gives implementation for the compare() method
		 * 
		 * 
		 */
	}

}
