package java01_variables;

public class Variables_06 {
	public static void main(String[] args) {
		//System.out.println( 11 + 22 );
		
		//리터럴 상수
		System.out.println(3456L);
		System.out.println(344.456f);
		//------------------------------------------
		int num;
		num = 123;
		num = 456;
		num = 678;
		
		//---------------------------------------------
		
		//이름있는 상수
		// 변수의 상수화
		//**이름있는 상수의 식별값은 모든 글자를 대문자로 작성한다
		final int MAX;
		
		MAX = 100;
		
		//에러, 상수화된 변수는 값 대입을 한 번만 할 수 있다
//		max = 200;
		
		//연걸된 식별자들 함께 변경하기 : alt + shift + r
		// (우클릭 메뉴 - Refactor - Rename)
		//---------------------------------------------

		//선택영역 대문자로 변환: ctrl + shift + x
		//선택영역 th문자로 변환: ctrl + shift + y
		
		final int WORKING_DAY = 25;
		System.out.println("이번 달은" + WORKING_DAY + "일 근무 하셨습니다.");
		System.out.println("이번 달 급여" + WORKING_DAY * 150000);
	}

}
