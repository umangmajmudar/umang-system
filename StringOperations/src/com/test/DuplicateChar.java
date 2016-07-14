package com.test;

import java.util.*;

public class DuplicateChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scanner = new Scanner(System.in);
		int tests = scanner.nextInt();

		for(int l = 0; l < tests; l++)
		{
			int n = scanner.nextInt();
			int k = scanner.nextInt();
			long[] numbers = new long[n];

			for(int i = 0; i < n; i++)
			{
				numbers[i] = scanner.nextLong();
			}

			long[] prefixModCount = new long[k];
			for(int i = 0; i < k; i++)
			{
				prefixModCount[i] = 0;
			}
			prefixModCount[0] = 1;

			int prefixSum = 0;
			for(int i = 0; i < numbers.length; i++)
			{
				prefixSum += numbers[i];
				prefixSum %= k;
				prefixModCount[prefixSum] += 1;
			}

			long result = 0;
			for(int mod = 0; mod < k; mod++)
			{
				result += prefixModCount[mod] * (prefixModCount[mod] - 1) / 2;
			}
			System.out.println(result);
		}

		scanner.close();
		
		
		/*String a = "Umang Majmudar";

		char b;

		Set s = new HashSet();
		Set s1 = new HashSet();
		for (int i = 0; i < a.length(); i++) {

			b = a.charAt(i);

			if (s.add(b) == false) {
				s1.add(b);
				System.out.println(b);
			}
			
		}
		System.out.println("List is ::: "+s1);
	
	*/
		/*String myStr = "Umang Majmudar Test abc Vijay Majmudar";
		HashMap<Character, Integer> myHash = new HashMap<Character,Integer>();
		
		for(Character ch : myStr.toCharArray()){
			myHash.put(ch, myHash.get(ch)==null? 1: myHash.get(ch)+1);
		}
		System.out.println("Map is ::: "+myHash);
		
	
	
	
	// second one
	
	String str = "IloveJava.Javaisgreat.Javaiscool.Javaishot";
	HashMap<Character,Integer> map = new HashMap<Character,Integer>();
	for(Character ch: str.toCharArray()){
		map.put(ch, map.get(ch)==null? 1: map.get(ch)+1);
	}
	System.out.println(map);
	
	Iterator it = map.keySet().iterator();
	int maxKeyCount =0;
	Character maxCountCharacter =' ';
	while(it.hasNext()){
		Character character = (Character)it.next();
		int maxKeyCountTemp = Math.max(map.get(character),maxKeyCount) != maxKeyCount ? map.get(character): maxKeyCount;
		maxCountCharacter = Math.max(map.get(character),maxKeyCount) != maxKeyCount ? character: maxCountCharacter;
		maxKeyCount = maxKeyCountTemp;
	}
	System.out.println("Max Charackter:"+maxCountCharacter + " Count:"+maxKeyCount);*/
	
	

}
	
}
