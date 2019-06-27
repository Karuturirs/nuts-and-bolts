package com.karuturirs.nutsandbolts.algo;

/**
Let A[1 : : n] be an array of n distinct numbers. If i < j and A[i] > A[j] , then the
pair .(i, j) is called an inversion of A.


for(int i=0; i<a.lenth; i++){
  for(int j=i+1; j <a.length; j++){
      if(a[i] > a[j]){
        System.out.println("("+i+" , "+j+")");
      }
   }
}
**/
public class Inversion{
  
  public int findInversion(int[] a, int p, int q, int r){

	int n =q-p+1;
	int m =r-q;

    int[] left = new int[n];

    for(int i=0 ; i<n; i++){
      left[i] = a[p-1+i];
    }

    int[] right = new int[m];
    for(int j=0 ; j<m; j++ ){
      right[j] = a[q+j];
    }

    int i=0, j=0, inver=0;
    for(int x=(p-1) ;x <r ;x++){
      if(i > (n-1)){
        a[x] = right[j];
        j++;
      }else if(j > m-1){
        a[x] = left[i];
        i++;
      }else if(left[i] <= right[j]){
    	  a[x] = left[i];
          i++;
      }else{
        
        inver += p-i;
        a[x] = right[j];
        j++;
      }

    }
    return inver;
  }

  public int mergesort(int[] a, int p, int r){
	int inver =0;
    int q = (p+r)/2;
    if(q<r){
      inver += mergesort(a,p,q);
      inver += mergesort(a,q+1,r);
      inver += findInversion(a,p,q,r);
      return inver;
    }else{
    	return 0;
    }

  }


}
