package com.capgemini.domain.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.Test;


public class Question3Test {
	ArrayList<String> array = new ArrayList<>();
	
	@Test
	public void testOrder()
	{
		array.add("Aman") ;
		array.add("Arpit") ;
		array.add("Aastha") ;
		array.add("Anupam") ;
		array.add("Neeraj") ;
		array.add("Chutki");
		array.add("chandramukhi");
		array.add("phulanDevi");
		assertEquals("Arpit", array.get(1));
		assertEquals("Neeraj",array.get(4)) ;
		
	}
	

}
