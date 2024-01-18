package java04_control.selection;

import java.util.Scanner;

public class SwitchQuiz {

	public static void main(String[] args) {
	//   - 메뉴 만들기
		//
		//   ===============================
//		      M  e  n  u
		//   ===============================
//		      1. Hello World 출력
//		      2. 이름 출력
//		      3. 성별 출력
//		      4. 종료
		//   ===============================
		//
//		     >> _
		//
//		    -> 각 메뉴 번호를 입력하면 메뉴에 알맞게 동작하도록 작성
//		    -> 동작은 간단한 출력으로 해결

		Scanner sc = new Scanner(System.in);
		//--------------------------------------------------------

		//메뉴 번호 상수
		final int HELLO_Menu = 1;
		final int NAME_Menu = 2;
		final int GENDER_Menu = 3;
		final int EXIT_Menu = 4;
		
		
		//--------------------------------------------------------
		System.out.println("=================");
		System.out.println("M   e    n    u");
		System.out.println("=================");
		System.out.println("1.Hello World");
		System.out.println("2.이름출력");
		System.out.println("3.성별출력");
		System.out.println("4. 종료");
		System.out.println("=================");
		System.out.print(">> ");
		
		int num = sc.nextInt();
		System.out.print(">> ");
		switch(num) {
		case HELLO_Menu:
			System.out.println("Hello World");
			break;
		case NAME_Menu:
			System.out.println("Alice");
			break;
		case GENDER_Menu:
			System.out.println("woman");
			break;
		case EXIT_Menu:
			System.out.println("종료");
			break;
		default:
			System.out.println("메뉴를 잘못 골랐습니다");
		}
	}

}
