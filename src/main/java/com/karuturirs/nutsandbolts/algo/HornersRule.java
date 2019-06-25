package com.karuturirs.nutsandbolts.algo;

/**

Horners rule, create a polinoial expression

f(x) = y = a0 + x * a1 + x^2 * a2 + x^3 * a3 + ....... + x^(n) * a(n)

     y = a0 +x( a1 + x (a2 +···+ x (an−1 + x an)···))

given the coefficients a0; a1; ..... ;an and a value for x:


***/

public class HornersRule{


  public int compute(int x, int[] a, int n){

        int y = 0;
        for(int i = n ; i >=0  ;i--){
          if(i <= (a.length-1) ){
            y = a[i] + (x * y );
          }else{
            y = x * y;
          }
        }

    return y;
  }

}
