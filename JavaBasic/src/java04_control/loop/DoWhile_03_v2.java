package java04_control.loop;

import java.util.Scanner;

public class DoWhile_03_v2 {

	public static void main(String[] args) {
		
		//숫자를 여러 개 입력받아 모든 값들의 총 합을 구하고 최종합계를 출력하는 프로그램 
		
		//숫자 0을 입력하면 종료
		
		// ->do-while 구문 활용
		
		//----------------------------------------------------------------------------------
		
		Scanner sc = new Scanner(System.in);
		
		int input;  //입력값
		int sum = 0;  //총합
		
		
		while(true) {
			System.out.print("Input Numper(종료 == 0 ) :");
			input = sc.nextInt();
			
			//0을 입력하면 반복문 종료
			if(input ==0) {
				
				//반복문 중단
				break;
			}
			
			sum += input;
		}
		
		System.out.println();
		
		System.out.println("최종 합계 :" + sum);
	}
}
