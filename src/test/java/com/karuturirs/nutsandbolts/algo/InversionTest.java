package com.karuturirs.nutsandbolts.algo;

import java.util.Arrays;

import org.testng.Assert;
import org.testng.annotations.Test;

public class InversionTest{



  @Test
  public void inversionTest(){
   
    Inversion in = new Inversion();
    
    int actual[] = {36,20,33,1000,250,46,99,234,37,66,9999};
    int z = in.mergesort(actual,1,11);
    Assert.assertEquals(z, 18);
    
    Arrays.stream(actual).forEach( a ->System.out.print(a+",") );
    int put[] ={ 6,5,4,3,2,1}; 
    Assert.assertEquals(in.mergesort(put,1,6), 13);
    int put2[] ={ 2,3,8,6,1}; 
    Assert.assertEquals(in.mergesort(put2,1,5), 5);
    
  }


}
