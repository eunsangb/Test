//패키지 선언코드
package java01_variables;

//주석 단축키 : ctrl + /
//주석 토글(toggle) 단축키 : ctrl + shift + c

// 한 줄 주석

/*  문장 주석
 * 여러 줄을 주석으로 처리
 */

//클래스 정의 코드
public class Variables_01 {
	//메인 메소드 정의 - 프로그램 시작점
	public static void main(String[] args) {
//		System.out.println("동작 테스트");
		System.out.println(123);  //정수 : 소수점 이하가 없는 숫자(int)
		System.out.println(12.345);  //실수 : 소수점 이하가 있는 숫자(double)
		System.out.println(true);  //논리 : 참/거짓 (true/false) (boolean)
		System.out.println( 'A' );  //단일 문자 : 1개 글자 표현 (character)
		System.out.println((char)66);
		System.out.println((char)4346);
		System.out.println((int)'a');
    //-------------------------------------------------------------------------
		System.out.println("Hello");  //문자열 : 0개 이상의 글자 표현
		
		
	}//main method end
	

} //Variables_01 Class end
