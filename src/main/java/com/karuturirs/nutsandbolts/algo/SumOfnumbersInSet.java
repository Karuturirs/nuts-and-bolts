package com.karuturirs.nutsandbolts.algo;

public class SumOfnumbersInSet{

    SumOfnumbersInSet(){

    }

    public boolean checkIfSetPresesnt(int[] a, int x){
      MergeSort ms = new MergeSort();
      ms.merge_sort(a,1,a.length);
      int i=0;
      while(i<a.length){
        BinarySearch bs = new BinarySearch();
        int y = x - a[i];
        int z = bs.searchMeEasy(y,a);
        if( z != -1 && z != i){
          return true;
        }
        i++;
      }
      return false;
    }

}
