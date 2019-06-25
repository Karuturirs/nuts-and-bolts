package com.karuturirs.nutsandbolts.algo;

public class BubbleSort{

    public void sortMe(int[] input){

        for(int i=0; i<input.length; i++){
          for(int j=(input.length-1); j>i; j--){
            int temp =input[j-1];
            if(input[j] < temp){
              input[j-1] = input[j];
              input[j] = temp;
            }
          }
        }
    }
}
