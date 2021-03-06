package com.thecodingzoo.lessons.patterns.creational;

import java.util.UUID;

import com.thecodingzoo.lessons.patterns.creational.constructor.Person;

public class ConstructorExample {
	public static void main(String[] args) {
		/* Object is immutable */
		Person person = new Person(UUID.randomUUID(), "Anthony", "Crouch");
		System.out.println(person.getFirstName());
		System.out.println(person.getLastName());
		System.out.println(person.getId());
		
		/* Object creation ensure it is whole, this ensure fail fast */
		try {
			Person incompletePerson = new Person(UUID.randomUUID(), "Anthony", null);
		}catch(Exception e) {
			System.out.println(e.toString());
		}
		
		/* I can add constructor params that are not required for immutability reasons, middle name missing does not throw error */
		person = new Person(UUID.randomUUID(), "Anthony", "Crouch", "Shane");
		System.out.println(person.getMiddleName());
		person = new Person(UUID.randomUUID(), "Anthony", "Crouch", null);
		
		/* I can add helper type constructor to support different data types being used for creation */
		String idFromRestService = "b5af00f0-71ec-44cf-b360-1a82a394c9ab";			
		person = new Person(idFromRestService,"Anthony", "Crouch");

		/* but what if I wanted to support helper types but also allow other params, various combinations 
		 * Well it is becoming a complication object creation. Time to move to a different pattern. 
		 */
	}
}
