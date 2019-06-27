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

  public int nativeCompute(int x, int[] a, int n){
      int y = 0;
      for(int i=0 ; i<= n && i < a.length; i++ ){
    	  y = y + (a[i] * power(x,i));
      }

      return y;
  }
  public int power(int x,int i){

	  if(x == 0){
		  if(i==0){
			 return 1;
		  }else{
			  return 0;
		  }

	  }else if(i == 0){
		  return 1;
	  }else{
		 return (i>0)?(x * power(x,i-1)):-1;
	  }

  }
}
