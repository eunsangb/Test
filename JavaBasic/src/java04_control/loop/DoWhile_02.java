package java04_control.loop;

public class DoWhile_02 {

	public static void main(String[] args) {
		
		//DoWhile 사용 예시
		// ->메뉴 화면, 선택
		
//		do {
//			
//		//  ----메뉴----
//		//	1. 사용자 정보 입력
//		//	2. 사용자 검색
//		//	3.	전체 사용자 출력
//		//	4.	종료
//			
//		//	메뉴선택 >>
//			_	
//		}while(4번을 선택하지 않으면);
		
		//---------------------------------------------------------

//		for(int i=0; i<5; i++) {
//			System.out.println(i);
//		}
		
		//---------------------------------------------------------
				
		int i = 0;
		do {
			System.out.println(i);
			i++;
		}while(i<5);
		
	}
}
