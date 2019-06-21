package com.karuturirs.nutsandbolts.algo;

public class BinarySearch{

  int position = -1;
  
  BinarySearch(){
	  
  }

  BinarySearch(int findme, int[] sortedarray ){
	  searchMe(findme, sortedarray, 0, (sortedarray.length-1));
  }

  public void searchMe(int findme, int[] sortedarray, int p, int q){
	int r = (p+q)/2;
	if(p<= r && r<=q){
	    if(sortedarray[r] == findme){
	    	position = r;
	    	return;
	    }else if(sortedarray[r] > findme ){
	      searchMe(findme, sortedarray, p , r-1);
	    }else if(sortedarray[r] < findme ){
	      searchMe(findme, sortedarray, r+1 , q);
	    }
	}
  }
  
  public int searchMeEasy(int findme, int[] sortedarray){
	  	int low = 0;
	  	int high = sortedarray.length -1;
		
		while(low <= high){
			int mid = (low + high)/2;
			if(sortedarray[mid] == findme ){
				return mid;
			}else if(sortedarray[mid] > findme){
				high = mid-1;
			}else{
				low = mid+1;
			}
		}
		return -1;
	  }

	public int getPosition() {
		return position;
	}

}
