package java04_control.loop;

public class For_07 {

	public static void main(String[] args) {
	//   첫날에 10원을 예금하고,
	//   다음날에는 전날의 2배를
	//   예금하는 방식으로
	//   보름(15일) 동안 저축한 금액은?
//	      -> 327670
		
//		풀이
		
		//1. 필요한 데이터 파악
		// -> 변수 사용 목적 구분하기
		
		//날짜		int day
		//예금액	int money
		//총 금액	int total
		
		//2. 반복 패턴 파악
		// -> 몇번, 구간
		
		//15일 동안
		//day, 0 ~ 14, x15
		
		//3. 반복에 맞춰 수행해야하는 과정
		// -> 중괄호 안에 작성할 코드
		
		//예금액 2배로 증가시키기
		//총 금액에 추가하기
		//--------------------------------------------------------------------------------


		int day; 	//날짜
		int money = 10;	//예금액
		int total = 0;	//총 금액

		//day, 0 ~ 14, x15
		for(day=0; day<15; day++) {		//매일, 15일 동안
			
			//총 금액에 추가하기
			total += money;
			
			System.out.println(day + "일, 예금액 :" + money);
			System.out.println(day + "일, 총금액 :" + total);
			System.out.println("--------------------------------");
			
			//예금액 2배로 증가시키기
			money *=2;
		}
		System.out.println("총액 : " + total + "원");




//		int sum = 0;
//		int m = 10;
//		for(int i =1; i<15; i++) {
//			m = m * 2;
//			sum = sum + (i*m);
//			
//		}
//		System.out.println("금액:" +  sum);
		
	}
	
}