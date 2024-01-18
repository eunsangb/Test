package study_01;

import java.util.Scanner;

public class Study_1157 { //단어
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next().toUpperCase();
		
		int[] alphabet = new int[26];
		
		for (int i = 0; i < str.length(); i++) {
			int num = str.charAt(i) - 'A' ;
			alphabet[num]++;
		}
		
		int max = 0;
		char answer = '?';
		for (int i = 0; i < alphabet.length; i++) {
			if(max < alphabet[i]){
				max = alphabet[i];
				answer = (char)(i+'A');
			} else if (max == alphabet[i]){
				answer = '?';
			}
		}
		System.out.println(answer);
		
	}
}

		    


