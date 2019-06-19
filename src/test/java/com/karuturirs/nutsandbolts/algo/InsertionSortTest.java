package com.karuturirs.nutsandbolts.algo;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;


public class InsertionSortTest{
	
	int actual[] = {36,20,33,1000,250,46,99,234,66,36,9999};
	int expected[] = {20,33,36,36,46,66,99,234,250,1000,9999};
	InsertionSort in = new InsertionSort();
	
	@Test
    public void testSorting(){
		in.insertionSort(actual);
		for(int i=0; i<actual.length;i++){
	    	 assertEquals(actual[i],expected[i]);
	     }
		  
	}


}
