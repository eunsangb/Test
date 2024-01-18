package java04_control.condition;

import java.util.Scanner;

public class IfQuiz {

	public static void main(String[] args) {
//	    + 숫자 하나를 입력받아 양수인지 음수인지 판별하시오
//      >> Input Number : -3
//      >> 음수입니다
//
//    + 입력한 데이터가 3의 배수인지 판별하시오
//     (% 연산자 사용)
//      >> Input Number : 7
//      >> 3의 배수가 아닙니다
//
//    + 두 수를 입력 받아 큰 수를 출력하시오
//      >> Input Number1 : 44
//      >> Input Number2 : 88
//      >> 88 이 더 큰 수
	//----------------------------------------------------------------------------------1번	

		
//		Scanner sc = new Scanner(System.in);
		
//		System.out.println("Input Number : ");
//		int num = sc.nextInt();
//		if (0 < num ) {
//			System.out.println("양수입니다");
//		}
//		if(!(0<num)) {
//			System.out.println("음수입니다");
//		}
		
		
		//------------------------------------------------------------------------------2번
		
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Input Number:" );
//		int Input = sc.nextInt();
//		if(Input%3==0) {
//			System.out.println("3의 배수입니다.");
//		}
//		if(Input%3 != 0) {
//			System.out.println("3의 배수가 아닙니다.");
//		}
		
		
		//------------------------------------------------------------------------------3번

		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input Number1 : ");
		int num1 = sc.nextInt();
	
		System.out.print("Input Numver2 : ");		
		int num2 = sc.nextInt();
		
		if (num1>num2) {
			System.out.println(num1 + " 이 더 큰수");
		}
		
		if ( ! (num1>num2)) {
			System.out.println(num2 + "이 더 큰수");
		}
		if(num1 == num2) {
			System.out.println( num1 + "두 숫자가 같음");
		}
		
	}

}
