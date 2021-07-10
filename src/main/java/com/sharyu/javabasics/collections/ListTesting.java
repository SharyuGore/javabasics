package com.sharyu.javabasics.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListTesting {

	public static void main(String[] args) {
		// This is immutable list of strings because you cannot do words.add. Anything
		// we create using .of is always immutable list
		List<String> words = List.of("Apple", "Mango", "Strawberry");

		System.out.println(words.size()); // size is always used on collections. length is used on arrays

		System.out.println(words.contains("Apple")); // returns true if the list contains

		System.out.println(words.indexOf("Mango")); // returns the position of this string in the words

		// If you want a mutable List of Strings , you should create a ArrayList,
		// LinkedList or Vector
		List<String> wordsArrayList = new ArrayList<String>(words);
		wordsArrayList.add("Litchi"); // this means that wordsArrayList is mutable

		List<String> wordsLinkedList = new LinkedList<String>(words);
		wordsLinkedList.add("Litchi"); // this means that wordsLinkedList is mutable

		List<String> wordsVector = new Vector<String>(words);
		wordsVector.add("Litchi"); // this means that wordsVector is mutable

		// Which type to use when?

		// ArrayList and Vector use Array in the background. For array insertion and
		// deletion of objects is very costly . Accessing the element is very cheap

		// LinkedList uses LinkedList in the background. For array insertion and
		// deletion of objects is very cheap . Accessing the element is very costly,
		// because system has to traverse through each element in linkedlist
		
		// So does this mean i can use even vector instead of arraylist?
		// No, so Vector is the first implementation in java, it has synchronized keyword in all its methods.
		// so vector is used only in thread safe environments.
		// If you use vector in not threaded environment you will impact performance.
		// so arraylist and vector are not interchangeable.
		// Use Arraylist always for better performance. Only in thread safe environment use Vector
		
		wordsArrayList.add(2, "Aneja");
		
		wordsArrayList.add("Aneja");
		System.out.println(wordsArrayList);
		
		// This explains that you can add duplicated in Arraylist
		
		// How do you add newlist into existing list
		
		List<String> newList = List.of("Yak", "Donkey");
		wordsArrayList.addAll(newList);
		System.out.println(wordsArrayList);
		
		// delete element at a specific position in arraylist
		wordsArrayList.remove("Apple");
		System.out.println(wordsArrayList);
		
		for(String word: wordsArrayList) {
			System.out.println(word);
		}
		
		// List also provide an iterator, all arraylist, linkedlist and vector
		Iterator wordsiterating = wordsArrayList.iterator();
		while(wordsiterating.hasNext()) {
			System.out.println(wordsiterating.next());
		}
		
		// How should you print and delete items in the arraylist. Ill use new arraylist noe
		List<String> toys = new ArrayList<>(List.of("Bat", "Ball", "monopoly"));
		for(String toy : toys) {
			if (toy.startsWith("B")) {
				//toys.remove(toy); // you cannot remove something from list in for
				System.out.println(toy);
			}
		}
		
		// if you want to change the list use iterator only like this.
		Iterator toysit = toys.iterator();
		while(toysit.hasNext()) {
			String toy = (String) toysit.next();
			if(toy.startsWith("B")) {
				toysit.remove(); 
			}
		}
		System.out.println(toys);
		
		System.out.println("Hey do you know you can save different types of objects in a List? See below");
		List containsAnything = List.of("A", // This is String wrapper class
										'A', // This is Character wrapper class
										1, // This is Integer wrapper class
										1.1); // This is Double wrapper class
		// so remember inside a list you cannot save primitives, everything gets autobozed
		if(containsAnything.get(1) instanceof Character) {
			System.out.println("You are storing character in the list");
		}
		if(containsAnything.get(3) instanceof Double) {
			System.out.println("You are storing double also in the list. Multiple type are stored is proved");
		}
		
		//If you want ability to just store string use generics while defining list like below
		List<String> onlyString = List.of("A", "B");
		
		System.out.println("An interesting concept of List of integers is here. Remove does not work on it. How?");
		List<Integer> listOfIntegers = new ArrayList<>(List.of(101,102, 103));
		/*listOfIntegers.remove(101); */// this will not work, because remove method in List class thinks you are calling remove (index) based on autounboxing it converts 101 to int.
		listOfIntegers.remove(Integer.valueOf(101));
		System.out.println(listOfIntegers);
		
		
		

	}

}
