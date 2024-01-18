package java04_control.selection;

public class Switch_02 {
	public static void main(String[] args) {
	
		int num =30;
		
		if( num==10 ) {
			System.out.println("10이다");
		}
		
		else if( num==20 ) {
			System.out.println("20이다");
			
		}
		else if( num==30 ) {
			System.out.println("30이다");
			
		}else {
			System.out.println("모두 아님");
			
		}
		
		//----------------------------------------------
		
		
		int score = 88;
		
		if(score >= 90) {
			System.out.println('A');
	
		}
		else if(score >= 80) {
			System.out.println('B');
			
		}
		else if(score >= 70) {
			System.out.println('C');
			
			
		}
		//----------------------------------------------
		
		score =99;
		
		switch(score/10) {  //10의자리 숫자 추출
		
		case 10:
			
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		}
		System.out.println("------------------------");
		
		String str1 = "Cherry";  //상수 활용
		
		String str2 = new String("Cherry");  //객체 활용
		
		//==로 String 비교하면 안됨
		System.out.println(str1 == str2);
		
		// .equals()를 이용하여 비교해야 한다
		System.out.println(str1.equals(str2) );

		System.out.println("------------------------");
		
		if( str2.equals(str1)) {
			System.out.println("두 문자열이 같다");
		}
		
		
	}

}