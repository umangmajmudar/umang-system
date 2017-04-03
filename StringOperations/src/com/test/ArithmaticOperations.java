package com.test;

import java.io.RandomAccessFile;
import java.util.Scanner;

public class ArithmaticOperations {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String msg = "Adding a url https://localhost:8443/abc, and one more gopher://text/1111111, and another <telnet://testing/9987654> test case#1";
		//String withURL = msg.replaceAll("((https?|ftp|rdar|exp2|gopher|telnet|file):((//)|(\\\\))+[\\w\\d:#@%/;$()~_?\\+-=\\\\\\.&]*)", "<a href='$0'>$0</a>");
		String withURL = msg.replaceAll("(?:https?|rdar?|exp2?|ftp?|file?|http?|telnet?|gopher?)://[\\w:[0-9]\\?\\=/%.-]+", "<a href='$0'>$0</a>");
		
		System.out.println(withURL);
		System.exit(1);
		
		
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
