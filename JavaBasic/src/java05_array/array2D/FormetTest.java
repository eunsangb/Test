package java05_array.array2D;

public class FormetTest {

	public static void main(String[] args) {
		double data = 123.456789;
		System.out.println("그냥 출력 : " + data);
		
//		String.format("서식 문자열", 데이터);
		//	서식 문자열에 맞게 데이터를 서식화 하고 String타입으로 반환한다
		
		String str = String.format("%d점 입니다", 100);
		System.out.println(str);
		
		str = String.format("%.2f 입니다", data);
		System.out.println(str);
		
		//**서식 문자 종류
		// %d - 10진수 정수
		// %f - 실수
		// %s - 문자열
		// %c - 단일 문자
		
		//** %기호와 형식지정자 사이에 숫자를 이용하여 자릿수를 지정할 수 있다
		
		//-----------------------------------------------------------------------------
		System.out.println("--------------");
		System.out.println(String.format("%10d 값 출력", 123));
		System.out.println(String.format("%10d 값 출력", 12345));
		System.out.println(String.format("%10d 값 출력", 1235676));

		
		System.out.println(String.format("%5d%10s%7f",23, "hihi", 3.14));
		
		System.out.println("--------------");
		
		//** 실수 데이터는 정수부분, 소수부분, .기호 자리를 지정할 수 있다
		
		//	ex) 	%9.3f
		//			전체 9자리를 구성한다
		//			소수부분을 3자리로 고장
		//			.점 기호도 1자리 차지한다
		//			나머지를 정수부분이 사용한다
		
		System.out.println(String.format("%10.4f", 123.45));
		System.out.println(String.format("%10.4f", 123.456789));
		System.out.println(String.format("%10.4f", 12353685.456789));
		
		System.out.println(String.format("%.2f", 12353685.456789));

		System.out.println("--------------");

		System.out.printf("%d%s", 1122, "Hello");
		
		//** printf == print( String.format() )
		
	}

}
