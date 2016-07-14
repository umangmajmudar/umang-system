package com.test;

import java.io.RandomAccessFile;
import java.util.Scanner;

public class ArithmaticOperations {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Binary to decimal
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Binary number ::: ");
		String myStr = sc.nextLine();
	
		System.out.println("Results ::: Binary Number ::: "+myStr+"  ::: Decimal number ::: "+Integer.parseInt(myStr, 2));
	
	// another approach -- Binary to decimal
		
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter a binary number ::: ");
		
		int i = sc1.nextInt();
		int j = i;
		
		int decimal = 0;
		int power = 0;
		
		while(true){
			if(j==0){
				break;
			}else{
				
				int temp=j%10;
				decimal += temp*Math.pow(2, power);
				j = j/10;
				power++;
			}
		}
		System.out.println("Binary ::: "+i+" Decimal ::: "+decimal);
		}
	}
