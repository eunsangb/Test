package Java03_scanner;
import java.util.Scanner;
public class ScannerQuiz {

	public static void main(String[] args) {
		   //3과목 점수 관리 프로그램
		   
		   //   국어, 영어, 수학
		   //   점수를 저장할 수 있는 변수를 만들고
		   //   3과목 점수를 입력받는다

		   //   총점과 평균을 포함한 결과를 출력한다

		//동작 예시)
		   
		//===== 입력 =====
		//Input Korean : 100
		//Input English : 99
		//Input Mathematics : 97

		//===== 출력 =====
		//국어   영어   수학   총점   평균
		//100   99   97   296   98.666666667
//		Scanner sc;
//		sc = new Scanner(System.in);
//		System.out.print("국어 :  " );
//		int korean = sc.nextInt();
//		System.out.print("영어 :  " );
//		int english = sc.nextInt();
//		System.out.print("수학 :  " );
//		int math = sc.nextInt();
		
		
//		System.out.print("국어 :" + korean);
		
//		System.out.print("  영어: " + english );
		
//		System.out.print("  수학: " + math );
		
//		System.out.print("  총점: " + (korean + english + math));
//		System.out.print("  평균: " + (korean + english + math)/(double)3);
//		sc.close();
		
		
		
		
		
		
		
		
		Scanner sc;
		sc = new Scanner(System.in);
		System.out.print("몸무게 : ");
		double weight = sc.nextDouble();
		System.out.print("키 : ");
		double height = sc.nextDouble();
		System.out.print("BMI : ");
		double bmi = weight + height;
		
		System.out.println("몸무게 : " + weight);
		System.out.println("키 : " + height);
		System.out.println("bmi : " + (weight/height));
			
		
		
	}

}
