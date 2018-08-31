package com.capgemini.domain.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.junit.jupiter.api.Test;

class Question6Test {

	@Test
	void testStudentFavouriteFruits() {
		HashMap<String,List<String>> students=new HashMap<>() ;
		students.put("Neeraj",Arrays.asList("Mango","Apple","Guava")) ;
		students.put("Spandhana", Arrays.asList("Grapes","Watermelon","Guava")) ;
		assertEquals(Arrays.asList("Mango","Apple","Guava"),students.get("Neeraj"));
		List<String> l = Arrays.asList("2");
		System.out.println(l.getClass().getName());
		
			}

}
