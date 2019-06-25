package com.karuturirs.nutsandbolts.algo;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.Assert;

public class SumOfnumbersInSetTest{

  int actual[] = {-5,0,21,1000,25,46,17,2,66,36,3};

  @BeforeMethod
  public void setup(){

  }

  @Test
  public void testSumOfnumbersInSet(){
      SumOfnumbersInSet sonis = new SumOfnumbersInSet();
      Assert.assertTrue(sonis.checkIfSetPresesnt(actual,20));
      Assert.assertFalse(sonis.checkIfSetPresesnt(actual,0));
      Assert.assertFalse(sonis.checkIfSetPresesnt(actual,-46));
      Assert.assertTrue(sonis.checkIfSetPresesnt(actual,-3));
      Assert.assertFalse(sonis.checkIfSetPresesnt(actual,-7));
      Assert.assertTrue(sonis.checkIfSetPresesnt(actual,46));
  }


}
