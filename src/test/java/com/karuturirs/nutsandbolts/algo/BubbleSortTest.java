package com.karuturirs.nutsandbolts.algo;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.Assert;

public class BubbleSortTest{

  int actual[] = {36,20,33,1000,250,46,99,234,66,36,9999};

  @BeforeMethod
  public void setUp(){

  }

  @Test
  public void sortMeTest(){
      boolean flag = false;
      BubbleSort bs = new BubbleSort();
      bs.sortMe(actual);
      for(int i=0; i<(actual.length-1); i++){
        if(actual[i] > actual[i+1]){
          flag = true;
        }
      }
      Assert.assertEquals(flag, false, "not in sorted order");
  }


}
