package com.karuturirs.nutsandbolts.algo;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BinarySearchTest {
	
	int[] actual = {20,33,36,36,46,66,99,234,250,1000,9999};

	@BeforeMethod
	public void setUp(){
		
		
	}
	
	@Test
	public void binarySearchTest(){
		BinarySearch bs = new BinarySearch(50, actual);
		Assert.assertEquals(bs.getPosition(), -1, "Not in the array");
		BinarySearch bs2 = new BinarySearch(20, actual);
		Assert.assertEquals(bs2.getPosition(), 0, "First element in the array");
		BinarySearch bs3 = new BinarySearch(9999, actual);
		Assert.assertEquals(bs3.getPosition(), 10, "Last element in the array");
		BinarySearch bs4 = new BinarySearch(36, actual);
		Assert.assertEquals(bs4.getPosition(), 2, "duplicate element in the array");
		BinarySearch bs5 = new BinarySearch(0,actual);
		Assert.assertEquals(bs5.getPosition(), -1, "is zero  in the array");
		BinarySearch bs6 = new BinarySearch(10000,actual);
		Assert.assertEquals(bs5.getPosition(), -1, "Lagert number plus one is zero  in the array");
	}

}
