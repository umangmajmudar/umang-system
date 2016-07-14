package com.test;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.*;

public class ReplaceChar {

	
	
	public static String replaceChar(String a, String b, String c) {
		System.out.println(a.length());
		String tempStr = a.replace(b, c);
		return tempStr;
		
	}
	
	public static String replaceAllChar(String a, String b, String c) {
		String tempStr = a.replaceAll(b, c);
		return tempStr;
		
	}

	public static String replaceAllCharRegex(String a, String b, String c) {
		String tempStr = a.replaceAll(b, c);
		return tempStr;
		
	}
	
	public static String removeCharAt(String a, int b){
		
		StringBuffer sb = new StringBuffer(a.length()-1);
		sb.append(a.substring(0, b)).append(a.substring((b+1)));
		return sb.toString();
	}
	
	public static String removeAllChar(String a, String b){
		
		String sb = a.replace(b, "");
		
		return sb;
	}
	
	
	public static String removeNonDigits(String a) {
		a = a.replaceAll("[a-zA-Z]+", "");
		return a;
	}
	
	public static String replaceCahrAt(String a, int b, char c) {
		
		StringBuffer sb = new StringBuffer(a);
		sb.setCharAt(b, c);
		
		return sb.toString();
	}
	
	public static String reverseString() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Place your String ::: ");
		String s = sc.nextLine();
		
		StringBuffer sb = new StringBuffer(s);
		return sb.reverse().toString();
	}
	
	public static String reverseStringVariable() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Place your String ::: ");
		String s = sc.nextLine();
		
		String reverseString = "";
		
		for(int i = s.length()-1; i!=-1;i--){
			reverseString += s.charAt(i);
		}
		
		return reverseString;
	}
	
	
        //remove n substrings from string 
	
	public static String removeSubstringFromString() {
        String S = "ccdaabcdbb";
        int n = S.length()/2;
		
		for (int i = 0; i < n; i++) {
			S = S.replaceAll("ab", "");
			S = S.replaceAll("cd", "");
		}
        return S;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("Str after SubStr ::: "+ removeSubstringFromString());
		//System.out.println("ReverseString output ::: " + reverseStringVariable());
		//System.out.println("RemoveAllChars output ::: " + removeAllChar("ABCDE ABCDE ABDCE", "C"));
		//System.out.println("RemoveAllNonDigits output ::: " + removeNonDigits("AB1234CDE AB5543CDE AB3467432DCE"));
		//System.out.println("RemoveAllNonDigits output ::: " + new String("AB1234CDE AB5543CDE AB3467432DCE").replaceAll("[\\D]", ""));
		//System.out.println("ReplaceCahrAt output ::: "+ replaceCahrAt("Umang Majmudar", 5, '%'));
		//System.out.println("ReplaceChar output ::: " + replaceChar("Umang Majmudar", "a", "@"));
		//System.out.println("ReplaceChar output ::: " + removeCharAt("Umang Majmudar", 10));
		//System.out.println("ReplaceAllChar output ::: "+ replaceAllChar("MyTest UmangTest MajmudarTesr", "Test", "@@@@"));
		//System.out.println("ReplaceOnlyChar output ::: "+ "MyTest UmangTest MajmudarTesr".replace('a','@'));
		//System.out.println("ReplaceOnlyFirstString output ::: "+ "MyTest UmangTest MajmudarTesr".replaceFirst("a","@"));
		//System.out.println("ReplaceAllCharRegex output ::: "+ replaceAllCharRegex("MyTest 1234 UmangTest 56321 MajmudarTest 876 You 554", "[a-zA-Z]+", "%%%%"));
		//System.out.println("ReplaceAllCharRegex output ::: "+ replaceAllCharRegex("MyTest 1234 UmangTest 56321 MajmudarTest 876 You 554", "[0-9]+", "%%%%"));
		 
		 Pattern p1 = Pattern.compile("pick");
		 Matcher m1 = p1.matcher("Peter Piper picked a peck of pickled peppers. A peck of pickled peppers Peter Piper picked. If Peter Piper picked a peck of pickled peppers, "
		 		+ "Where's the peck of pickled peppers Peter Piper picked?");
		
		 StringBuffer sb1 = new StringBuffer();
		 while(m1.find()){
			 m1.appendReplacement(sb1, "@@@@");
		 }
		 m1.appendTail(sb1);
		// System.out.println("sb1 ::: "+sb1);
		 
		
	}
	
}


