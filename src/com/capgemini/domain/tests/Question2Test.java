package com.capgemini.domain.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.HashSet;

import org.junit.jupiter.api.Test;

import com.capgemini.domain.Car;
import com.capgemini.domain.Car1;
import com.capgemini.domain.CellPhone;
import com.capgemini.domain.CellPhone1;
import com.capgemini.domain.Laptop;
import com.capgemini.domain.Laptop1;
import com.capgemini.domain.School;
import com.capgemini.domain.School1;
import com.capgemini.domain.Television;
import com.capgemini.domain.Television1;

class Question2Test {
	
	Laptop1 l1,l2,l3,l4 ;
	Car1 c1,c2,c3,c4 ;
	Television1 tv1,tv2,tv3 ;
	CellPhone1 m1,m2,m3,m4 ;
	School1 s1,s2,s3 ;

	@Test
	void testDuplicacyForLaptop() {
		HashSet<Laptop1> products = new HashSet<>();
		l1=new Laptop1("Hp","sv1","windows7","I5") ;
		l2=new Laptop1("Dell","sv2","windows7","I7") ;
		l3=new Laptop1("Lenovo","sv3","windows7","I6") ;
		l4=new Laptop1("Hp","sv1","windows8","I7") ;
		products.add(l1) ;
		products.add(l2) ;
		products.add(l3) ;
		products.add(l4) ;
		assertEquals(3, products.size());
		}
	
	@Test
	void testDuplicacyForCar() {
		HashSet<Car1> products = new HashSet<>();
		c1=new Car1("Honda","city1",2000,10000000) ;
		c2=new Car1("Chevrolet","model2",2005,200000) ;
		c3=new Car1("Honda","Brio",2018,700000) ;
		c4=new Car1("Honda","city1",2018,700000) ;
		products.add(c1) ;
		products.add(c2) ;
		products.add(c3) ;
		products.add(c4) ;
		assertEquals(3, products.size());
		}
	
	@Test
	void testDuplicacyForTelevision() {
		HashSet<Television1> products = new HashSet<>();
		tv1=new Television1("Samsung","LCD",true,50000) ;
		tv2=new Television1("Sony","LED",false,30000) ;
		tv3=new Television1("Samsung","LCD",false,50000) ;
		products.add(tv1) ;
		products.add(tv2) ;
		products.add(tv3) ;
		assertEquals(2, products.size());
		}
	
	@Test
	void testDuplicacyForCellPhone() {
		HashSet<CellPhone1> products = new HashSet<>();
		m1=new CellPhone1("Motorola","m2","smartphone","android",10000) ;
		m2=new CellPhone1("Motorola","m1","smart phone","android",20000) ;
		m3=new CellPhone1("Apple","5s","smart phone","ios",70000) ;
		m4=new CellPhone1("Apple","5s","smart phone","ios",70005) ;
		products.add(m1) ;
		products.add(m2) ;
		products.add(m3) ;
		products.add(m4) ;
		assertEquals(3, products.size());
		}
	
	
	@Test
	void testDuplicacyForSchool() {
		HashSet<School1> products = new HashSet<>();
		s1=new School1("seedling","Jaipur","Jaipur",3) ;
		s2=new School1("seedling","Jaipur","Jaipur",1) ;
		s3=new School1("xaviers","Jaipur","Jaipur",5) ;
	
		products.add(s1) ;
		products.add(s2) ;
		products.add(s3) ;
		assertEquals(2, products.size());
		}

}
