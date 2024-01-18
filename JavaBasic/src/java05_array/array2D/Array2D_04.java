package java05_array.array2D;


import java.util.Scanner;

public class Array2D_04 {

		
		//학생 성적 관리 프로그램
		//	-> 국영수 3과목 점수
		
		//점수 1개		-> int
		//3과목 점수	-> int[3]
		//4명의 학생 점수들  -> int[4][3]
		//2개의 학급	-> int[2][4][3]
	      //QUIZ.
	      //   2명의 국어, 영어, 수학 점수를 처리하기
	      //   학생들의 점수를 입력받고 총점과 평균을 계산하여 출력한다 
	      
	      //   ** 2차원배열 이용해보기
	      
	      //   int[2][3] - 학생들 점수
	      //   int[2] - 학생들 총점
	      //   double[2] - 학생들 평균
	      
	      //----- 최종 출력 -----
	      //   번호   국어   영어   수학   총점   평균
	      //   1번      xxx      xxx      xxx      xxx      xxx.xx
	      //   2번      xxx      xxx      xxx      xxx      xxx.xx
		
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		final String[] SUBJECT = {"국어", "영어", "수학" };  //과목 이름
		
		int[][] score;
		score = new int[2][3];  //학생들 점수
		int[] sum = new int[2];  //총점
		double[] avg = new double[2];  //평균
		
		for (int i = 0; i < score.length; i++) {   //i번째 학생
			for (int j = 0;j < score[i].length; j++) {   //j번째 과목
				
				System.out.print((i+1) +"번째 학생의 " + SUBJECT[j] + " 점수는 ?");
				
				score[i][j] = sc.nextInt();		//2명에 대한 3과목 점수 입력
				
				sum[i] += score[i][j];		//총점 계산
				
				avg[i] = sum[i]/(double)3;		//평균 계산
				
			}
			
			System.out.println();
			
		}
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균\t");      // 최종 출력
		//번호	
		for (int i = 0; i < score.length; i++) {  
				System.out.print((i+1) + "번" + "\t");  
//		//국어
//		System.out.print(score[i][0]);
//		
//		//영어
//		System.out.print(score[i][1]);
//		
//		//수학
//		System.out.print(score[i][2]);
		
		for (int j = 0; j < score[i].length; j++) {
			System.out.print(score[i][j] + "\t");
		}
		
		System.out.print(sum[i] + "\t");    //총점
		
		System.out.printf("%.2f\n",avg[i]);  //평균
		}
		
	}
			
		
}


