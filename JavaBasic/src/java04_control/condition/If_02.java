package java04_control.condition;

import java.util.Scanner;

public class If_02 {

	public static void main(String[] args) {
		
		int num = 10;
//		int num = new Scanner(System.in).nextInt();  //Scanner 1회용
		
		if(num == 10 ) {   										//if start
			System.out.println("Hi");
		}// if end
		System.out.println("Hello");
		
		//-------------------------------------------------------------------
		
		//{}중괄호 블록은 여러 개의 코드를 묶어주는 역할을 한다
		//코드 실행 흐름에는 영향을 주지 않는다
		System.out.println("----------------");
		
		//제어문은 해당 제어문 다음에 오는 코드 한 개 또는 
        //{}중괄호 블록 하나에 영향을 준다
		
		if(false) 
			System.out.println("코드 1"); // 실행되지 않는다 (if영향 받음)
		
		System.out.println("코드 2"); // 실행된다 (if영향받지 않음)
		
		//영향받는 실행코드가 1개여도 {}중괄호로 감싸도록 하자
		
		System.out.println("----------------");
		
		
		//제어문의 ()괄호 다음에 ;을 붙히지 않도록 조심
		// -> 실수로 작성하는 경우가 많음
		
		if (false); {
		System.out.println("HI");
		System.out.println("Hello");
		System.out.println("Hola");
		}
		
	}//main end

}//class end
