package com.karuturirs.nutsandbolts.algo;

import java.util.Arrays;

public class MergeSort{

  public void merge(int[] A, int p, int q, int r){ // 1,2,3
    int n = q-p+1; //n = 6  ; 2
    int m = r-q; // m = 5  ; 1

    //create L[] and R[]
    int[] L = new int[n]; // lenth 6 ;2
    for(int i=0; i<n ;i++){
      L[i]=A[(p-1)+i]; //  L{}={36,20}
    }
    int[] R = new int[m]; // 1
    for(int j=0; j<m ;j++){
      R[j]=A[q+j]; //R{} = {33}
    }

    int i=0,j=0;
    for(int x=(p-1); x<r; x++){
      if(i> (n-1)){
        A[x] = R[j];
        j++;
      }else if(j>(m-1)){
        A[x] = L[i];
        i++;
      }else if(L[i] < R[j]){
        A[x] = L[i];
        i++;
      }else{
        A[x] = R[j];
        j++;
      }
    }
  }
  public void merge_sort(int[] A, int p, int r){
    if(p<r){ // 1<11, 1<6, 1<3, 1<2
      int q = (p+r)/2; //q= 6, 3, 2, 1
      merge_sort(A,p,q); //A, 1, 6; A,1,3; A, 1,1
      merge_sort(A,q+1,r); // A , 7,11; A,4,6;
      merge(A,p,q,r); // A , 1, 6, 11; A,1,2,3
      Arrays.stream(A)
      .forEach(i ->{
          System.out.print(i);
          System.out.print("\t");
      });
      System.out.println("--");
    }
  }

}
