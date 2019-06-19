package com.karuturirs.nutsandbolts.algo;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class MergeSortTest{

  int actual[] = {36,20,33,1000,250,46,99,234,66,36,9999};
  int expected[] = {20,33,36,36,46,66,99,234,250,1000,9999};

  MergeSort mr = new MergeSort();

  @Test
  public void checkOnMergeSort(){
     mr.merge_sort(actual, 1 ,11);
     for(int i=0; i<actual.length;i++){
    	 assertEquals(actual[i],expected[i]);
     }
  }



}
