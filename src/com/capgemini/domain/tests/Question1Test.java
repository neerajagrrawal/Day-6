package com.capgemini.domain.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.capgemini.domain.Car;
import com.capgemini.domain.CellPhone;
import com.capgemini.domain.Laptop;
import com.capgemini.domain.School;
import com.capgemini.domain.Television;

class Question1Test {
	
	ArrayList array ;
	Laptop l1,l2,l3;
	Car c1,c2,c3 ;
	Television tv1,tv2,tv3 ;
	CellPhone m1,m2,m3 ;
	School s1,s2,s3 ;
	
	@Test
	void testLaptopDetails() {
		ArrayList<Laptop> array = new ArrayList<>();
		l1=new Laptop("Hp","sv1","windows7","I5") ;
		l2=new Laptop("Dell","sv2","windows7","I7") ;
		l3=new Laptop("Lenovo","sv3","windows7","I6") ;
		array.add(l1) ;
		array.add(l2) ;
		array.add(l3) ;
		assertEquals(new Laptop("Hp","sv1","windows7","I5"),array.get(0)) ;
		assertEquals(new Laptop("Dell","sv2","windows7","I7"),array.get(1)) ;
		assertEquals(new Laptop("Lenovo","sv3","windows7","I6"),array.get(2)) ;
		
	}
	
	@Test
	void testCarDetails() {
		ArrayList<Car> array = new ArrayList<>();
		c1=new Car("Honda","city1",2000,10000000) ;
		c2=new Car("Chevrolet","model2",2005,200000) ;
		c3=new Car("Honda","Brio",2018,700000) ;
		
		array.add(c1) ;
		array.add(c2) ;
		array.add(c3) ;
		assertEquals(new Car("Honda","city1",2000,10000000),array.get(0)) ;
		assertEquals(new Car("Chevrolet","model2",2005,200000),array.get(1)) ;
		assertEquals(new Car("Honda","Brio",2018,700000),array.get(2)) ;
		
	}
	
	@Test
	void testTelevisionDetails() {
		ArrayList<Television> array = new ArrayList<>();
		tv1=new Television("Samsung","LCD",true,50000) ;
		tv2=new Television("Sony","LED",false,30000) ;
		tv3=new Television("Onida","LCD",false,10000) ;
		array.add(tv1) ;
		array.add(tv2) ;
		array.add(tv3) ;
		assertEquals(new Television("Samsung","LCD",true,50000),array.get(0)) ;
		assertEquals(new Television("Sony","LED",false,30000),array.get(1)) ;
		assertEquals(new Television("Onida","LCD",false,10000),array.get(2)) ;
		
	}
	
	@Test
	void testCellPhoneDetails() {
		ArrayList<CellPhone> array = new ArrayList<>();
		m1=new CellPhone("Motorola","m2","smartphone","android",10000) ;
		m2=new CellPhone("Motorola","m1","smart phone","android",20000) ;
		m3=new CellPhone("Apple","5s","smart phone","ios",70000) ;
		array.add(m1) ;
		array.add(m2) ;
		array.add(m3) ;
		assertEquals(new CellPhone("Motorola","m2","smartphone","android",10000),array.get(0)) ;
		assertEquals(new CellPhone("Motorola","m1","smart phone","android",20000),array.get(1)) ;
		assertEquals(new CellPhone("Apple","5s","smart phone","ios",70000),array.get(2)) ;
		
	}
	
	@Test
	void testSchoolDetails() {
		ArrayList<School> array = new ArrayList<>();
		s1=new School("seedling","Jaipur","Jaipur",3) ;
		s2=new School("bvbv","Jaipur","Jaipur",1) ;
		s3=new School("xaviers","Jaipur","Jaipur",5) ;
		array.add(s1) ;
		array.add(s2) ;
		array.add(s3) ;
		assertEquals(new School("seedling","Jaipur","Jaipur",3),array.get(0)) ;
		assertEquals(new School("bvbv","Jaipur","Jaipur",1),array.get(1)) ;
		assertEquals(new School("xaviers","Jaipur","Jaipur",5),array.get(2)) ;
		
	}

}
