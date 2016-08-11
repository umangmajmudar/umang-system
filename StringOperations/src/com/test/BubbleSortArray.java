package com.test;

import java.util.Arrays;

public class BubbleSortArray {

	public static void main(String[] args) {

		
		int[] unsort = {2,4,1,5,9,7};
		System.out.println("Array before sorting ::: " + Arrays.toString(unsort));
		sortArray(unsort);		
		
		
	}

	private static void sortArray(int[] unsort) {

		for(int i=0;i<unsort.length-1;i++){
			
			for(int j=1;j<unsort.length-i;j++){
				
				// compare two adjacent elements, and swap higher element towards end of array list
				if(unsort[j-1]>unsort[j]){
					int temp = unsort[j];
					unsort[j] = unsort[j-1];
					unsort[j-1] = temp;
				}
				
			}
			
		}
	
		System.out.println("Array after sorting ::: " + Arrays.toString(unsort));
	
	
	
	
	
	}

}
