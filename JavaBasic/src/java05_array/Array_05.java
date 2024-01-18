package java05_array;

import java.util.Iterator;

public class Array_05 {

	public static void main(String[] args) {

		//문자열
		String str = "Apple";
		
		//------------------------------------------------------
		
		String[] strArr = null;
		System.out.println(strArr);
		
		//String배열 공간(요소) 생성 (3개)
		strArr = new String[3];
		
		strArr[0] = "Apple";
		strArr[1] = "banana";
		strArr[2] = "cherry";
		
		for (int i = 0; i < strArr.length; i++) {
			System.out.println(strArr[i]);
			System.out.println(strArr[i].length());
			System.out.println("-------------------");
		}
			
		//strArr -> String[]
		//strArr.length -> 배열의 길이 (3개의 문자열)
		
		//strArr[i] -> String
		//strArr[i].length() -> i인덱스 문자열의 길이
		
		
		
	}

}
