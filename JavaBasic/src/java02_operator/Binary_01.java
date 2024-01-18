package java02_operator;

public class Binary_01 {

	public static void main(String[] args) {
		//이항 연산자 - 산술
		// + - * / %
		//-----------------------------------------------------
		
		int num1 = 16, num2 = 7; //피연산자
		int result; //연산의 결과값을 저장할 변수
		
		result = num1 + num2;
		//result = 16 + 7;
		//result = 23;
		System.out.println("덧셈 결과 : " + result);
		System.out.println("-----------------");
		
		// %
		// 나머지 연산자
		// modular operator
		//mod 연산자
		//모드 연산자
		
		//나눗셈을 수행하고 그 나머지를 결과값으로 나타낸다
		 num1 = 15;
		 num2 = 6;
		 
		 result = num1 % num2;
		 System.out.println(num1 + "를" + num2 + "(으)로 나눈 나머지 : " + result);
		 
		 System.out.println("num1 + num2 = " + (num1 + num2));
		 System.out.println("num1 - num2 = " + (num1 - num2));
		 System.out.println("num1 * num2 = " + (num1 * num2));
		 System.out.println("num1 / num2 = " + (num1 / num2));
		 System.out.println("num1 % num2 = " + (num1 % num2));
		 System.out.println("-----------------");
		 System.out.println("15 / 6 = " + (15/6 ));  // int / int -> int
		 System.out.println("15.0 / 6.0 = " + (15.0/6.0 ));  // double / double -> double
		 System.out.println("-----------------");
		 System.out.println( (double)num1 / (double)num2 );
		 //System.out.println( (double)15 / (double)6 );  //변수값 불러오기
		 //System.out.println(15.0 / (double)6);  //왼쪽항 double로 형변환
		 //System.out.println(15.0 / 6.0);  //오른쪽항 double로 형변환
		 //System.out.println(2.5);  //double데이터들 나눈셈
		 
		 //**산술 연산은 반드시 피연산자들의 데이터타입이 같아야 한다
		 //**산술 연산의 결과값도 피연산자와 같은 데이터타입을 가진다
		 num1 = 17;
		 num2 =3;
		 
		 System.out.println("--------잘못 사용한 경우---------");
		 System.out.println((double)(num1 / num2));
//		 System.out.println((double)(17 / 3)); -> 변수값 불러오기
//		 System.out.println((double) 5 );  int/int수행
//		 System.out.println( 5.0 );  double형변환
		 
		 System.out.println("-----------------");
		 
		 double dNum = 3.14;
		 System.out.println("3.14 / 2 = " + (dNum/2));

		 System.out.println("3.14 % 2 = " + (dNum%2));
		 //** 실수 계산에서는 부동소수점 오차가 발생할 수 있다.
		 // -> 1.1400000000001
	}

}
