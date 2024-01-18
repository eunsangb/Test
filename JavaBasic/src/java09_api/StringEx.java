package java09_api;

import java.util.Scanner;

public class StringEx {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
		String str1 = "Apple";  //리터럴 상수
		String str2 = new String("Banana");  //객체로 생성 (동적 할당)
//		String str3 = sc.next().toUpperCase();
		//-------------------------------------------------------------
		
		System.out.println("-----length()---------");
		
		System.out.println("str1의 길이 : " + str1.length());
		System.out.println("str2의 길이 : " + str2.length());
		
		System.out.println("\"Cherry\"의 길이 : " + "Cherry".length());
		
		
		System.out.println("\n--- toLowerCase() ------" + str2.toLowerCase());
		
		System.out.println("\n--- toUpperCase()-----" + str2.toUpperCase());
		
		System.out.println("\n---charAt(int)---"+ str1.charAt(3));
		
		System.out.println("\n---replace(char,char)-----" + str2.replace('n', 'x'));
	
		System.out.println("\n---contains()------" );
		boolean b = str1.contains("pp");
		System.out.println(b);
		
		System.out.println("\n---subString()----");
		//문자열의 일부를 발췌한다
		
		String sub1 = str1.substring(2);
		System.out.println("sub1 : " + sub1);
				
		String sub2 = str1.substring(1,3);
		System.out.println("sub2 : " + sub2);
	}

}
