package com.karuturirs.nutsandbolts.algo;

import org.testng.annotations.Test;
import org.testng.Assert;

public class HornersRuleTest{

  int[] a = {1,2,3,4,5,6};
  HornersRule hr = new HornersRule();

  @Test
  public void computeTest(){
     Assert.assertEquals(hr.compute(10, a, 0), 1);
     Assert.assertEquals(hr.compute(10, a, 1), 21);
     Assert.assertEquals(hr.compute(10, a, 2), 321);
     Assert.assertEquals(hr.compute(10, a, 5), 654321);
     Assert.assertEquals(hr.compute(10, a, 7), 654321);
     Assert.assertEquals(hr.compute(10, a, 20), 654321);
     Assert.assertEquals(hr.compute(10, a, -5), 0);
     Assert.assertEquals(hr.compute(0, a, 5), 1);
     Assert.assertEquals(hr.compute(0, a, 5), 1);
  }


}
