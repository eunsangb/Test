package java01_variables;

public class Variables_05 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		//학생의 나이
	//	int student age; //에러, 띄어쓰기 금지
		
		int student_age; //snake case, 뱀 표기법
		
		int studentAge; //camel case, 낙타 등 표기법
		
		//자바에서는 낙타등표기법(Camel case)를 권장한다
		
		//변수의 이름은 소문자로 시작한다.
		//------------------------------------------------------
		
		//에러, 숫자로 시작하면 안된다.
		//int 1stNumber;
		int firstNumber;
		
		//**의미 없는 변수명은 사용하지 않도록 한다
//		int a;
//		int b;
//		int c;
		//------------------------------------------------------
		
		//한글로 식별자를 설정하면 안된다
		double 넓이 = 5435.345;
		System.out.println( 넓이 );
		
	}

}
