package java05_array.quiz;

import java.util.Iterator;

public class ArrayQuiz_1 {

//	
//	 int[] arr = {10, 17, 3, 9, 27, 10, 8, 9, 13, 21};
//	 배열이 선언된 뒤 문제를 푸시오
//
//	 - arr 배열을 invert_arr라는 배열에 거꾸로 입력하시오
//	 => invert_arr : { 21, 13, 9, 8, 10, 27, 9, 3, 17, 10 }
//
//	 - arr 배열의
//	  (짝수번째 인덱스 내용의 합) - (홀수번째 인덱스 내용의 합)을
//	  구하시오
//	     => -5
//
//	 - arr 배열의 숫자들 중 높은 숫자가 1등이 되게하여
//	  rank_arr라는 배열에 순위를 입력하시오
//	    => arr :     { 10, 17, 3, 9, 27, 10, 8, 9, 13, 21 }
//	     => rank_arr :{  5,  3, 10,7,  1,  5, 9, 7,  4,  2 }
//
//	 - arr 배열의 요소들 중 중복된 값은 over_arr에 넣고 중복되지
//	  않은 값은 ret_arr에 입력하시오
//	    ** over_arr, ret_arr은 길이가 10인 배열로 작성한다
//	    
//	    출력한다면 (정렬도 할 수 있으면 해도 됨)
//	    => over_arr : 9, 10
//	    => ret_arr : 3, 8, 13, 17, 21, 27
	
	
	public static void main(String[] args) {
//		int[] arr = {10, 17, 3, 9, 27, 10, 8, 9, 13, 21};
//		
//		int[] invert_arr = new int[arr.length];
//		for (int i = 0; i < arr.length; i++) {
//			
//			//** arr.length-1 : 마지막 인덱스 번호
//			invert_arr[arr.length-1-i] = arr[i];
//			
//		}
//		for (int i = 0; i < invert_arr.length; i++) {
//			System.out.print(invert_arr[i] + " ");
//		}
//		System.out.println();
		//--------------------------------------------------------------------------
//		System.out.print("invert_arr : {");
//		for (int i = arr.length-1; i >= 0; i--) {
//			
//			System.out.print(arr[i]+",");
//		}
//		System.out.println("}");
			
		//--------------------------------------------------------------------- 1번
		
//		int[] arr = {10, 17, 3, 9, 27, 10, 8, 9, 13, 21};
		
		
		//결과
//		int result = 0;
//		
//		for (int i = 0; i < arr.length; i++) {
//			
//			if(i%2 ==0) {
//				result += arr[i];
//			}else {  //홀수 인데스
//				result -= arr[i];
//			}
//		}
//		System.out.println("결과 : " + result);
		//-----------------------------------------------------------------------2번
		
		int[] arr = {10, 17, 3, 9, 27, 10, 8, 9, 13, 21};
		
		int[] rank_arr = new int[10];
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		}
			
		
	}




