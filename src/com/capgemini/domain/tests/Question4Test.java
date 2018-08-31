package com.capgemini.domain.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;
import java.util.Iterator;



import org.junit.jupiter.api.Test;

class Question4Test {
	
	
	@Test
	public void testOrder()
	{
		TreeSet<String> array = new TreeSet<>((s1, s2) -> {
			return s1.compareTo(s2) ;
		});
		array.add("Aman") ;
		array.add("Arpit") ;
		array.add("Aastha") ;
		array.add("Anupam") ;
		array.add("Neeraj") ;
		array.add("Chutki");
		array.add("chandramukhi");
		Iterator<String> itr = array.iterator();
		assertEquals("Aastha",itr.next()) ;
		assertEquals("Aman",itr.next()) ;
		//itr.next() ;
		assertEquals("Anupam",itr.next()) ;
		assertEquals("Arpit",itr.next()) ;
		
		
	}

}
