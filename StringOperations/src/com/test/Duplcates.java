package com.test;

public class Duplcates {

	// array length is 100
	// 
	public static int[] removeDuplicate(int[] arr) {
	    boolean[] bool = new boolean[100];
	    int total = 0;
	    try{
	    for( int i = 0; i < arr.length; ++i ) {
	        if( bool[arr[i]] == false ) {
	        	bool[arr[i]] = true;
	            total++;
	        }
	    }
	    
	    System.out.println("total items without duplicates ::: "+total);

	    int[] noDup = new int[total];
	    int c = 0;
	    for( int j = 0; j < bool.length; ++j ) {
	        if( bool[j] == true ) {
	        	noDup[c++] = j;
	        }
	    }
	    return noDup;
	    }
	    catch(Exception e){
	    	e.printStackTrace();
	    	return null;
	    }
	}
	
	
	public static void main(String[] args) {
		int myArr[]={1,2,3,4,5,6,7,1,3,5,7,9,8,23,32,12,56,76,45,32,34,87,4,6,8};
		// removeDuplicate(myArr);
		
		// original array
		System.out.println("Original array ::: ");
				for (int i = 0; i < myArr.length; i++) {
			         if (i > 0) {
			            System.out.print(", ");
			         }
			         System.out.print(myArr[i]);
			      }
		
		System.out.println("\n");
				
		int[] result = removeDuplicate(myArr);
		System.out.println("\nSorted array without duplicate ::: ");
		try {
			for (int i = 0; i < result.length; i++) {
		         if (i > 0) {
		            System.out.print(", ");
		         }
		         System.out.print(result[i]);
		      }
		} catch (Exception e) {
			System.out.println("Exception Occured");
		}
		
	}

}
