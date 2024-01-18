package java04_control.selection;

public class Switch_03 {

	public static void main(String[] args) {
		
//		에러	
		
//		double d= 3.14;
//		switch( d ) {
//		
//		case
//		
//		}
		//--------------------------------------------------------------

		//		에러
		
//		boolean d = true;
//		switch(d) {
//		case
//		}

		//--------------------------------------------------------------
		
		//char형은 정수값(ASCII)으로 처리된다
		// -> switch 비교대상으로 사용 가능
		
		char alpha = 'B';
		
		switch( alpha ) {
		case 'A':
			System.out.println("사과");
			break;
			
		case 'B':
			System.out.println("바나나");
			break;
		}
		System.out.println("-------------");
		
		//String타입을 switch구문에서 사용할 수 있다
		// -> JDK 1.7이상
		
		String str = "Banana";
		
		switch(str) {
		case "apple":
			System.out.println("사과");
			break;
			
		case"Banana":
			System.out.println("바나나");
			
			break;
		}

	}

}
