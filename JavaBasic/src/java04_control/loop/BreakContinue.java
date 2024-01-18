package java04_control.loop;

public class BreakContinue {

	public static void main(String[] args) {
		
		//break;
		
		//	반복묵(for, while, dd-while) 또는 switch문을 중단시키는 코드
		
		
		//에러
		// -> 반복문이나 switch 없이 break;를 사용할 수 없다
		if(true) {
			//에러
//			break;
		}
		
		for(int i=0; i <100; i++) {
			System.out.println(i);
			if(i>=5) {
			break;
			}
		}
		
		System.out.println("--------");
		
		
		//중첩된 제어문에서 break를 사용하려면 가까운 블록의 제어문 한개만 중단한다
		// -> 안쪽 제어문에서 바깥쪽 for문을 중단시킬 수 없다
		for(int i = 0; i <5; i++) {
			for(int j = 0; j<5; j++) {
				
				if(j >=2) break;
				System.out.println("i:" +i+",j:"+j);
			}
			System.out.println();
		}
		//------------------------------------------------
		
		//continue;
		
		//반복문에서만 사용할 수 있는 제어문
		
		// 현재 반복코드를 중단하고 다음 반복을 수행한다
		// 반복문의 {}중괄호 블록의 남은 부분을 1번 건너뛴다
		
		for(int i =0; i<10; i++) {
			if( i%2 ==0) { //짝수
				continue;
			}
			System.out.println(i);
		}
		
		//-------------------------------------------------------
		
		//while문의 continue는 조건식으로 가기 떄문에 증감식을 만나지 못하고 조건 검사만 반복적으로 수행한다
		
		//증감식을 만나지 못하고 조건 검사만 반복적으로 수행한다
		
		// -> (예상치 못한)무한 루프

//		int i = 0;
//		while(i<10) {
//			if( i%2 ==0) { //짝수
//				continue;
//			}
//			System.out.println(i);
//			i++;
//		}
		
		//-------------------------------------------------------
		
		//for문에서 continue는 증감문으로 간다
		
		//while , do-while에서는 continue는 조건문으로 간다
		
		
		
		
	}
}
