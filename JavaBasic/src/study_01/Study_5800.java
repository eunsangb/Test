package study_01;


import java.util.Scanner;

public class Study_5800 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] score = new int[2][5];
		
		for (int i = 0; i < score.length; i++) {  //i번째 반
			for (int j = 0; j < score[i].length; j++) {  //j번째 반 점수
				System.out.print( (i + 1)+"반 학생들 점수 : ");
				score[i][j] = sc.nextInt();
			}
			System.out.println();
		}
		for (int j = 0; j < score.length-1; j++) {
			for (int j2 = 0; j2 < score.length-1-j; j2++) {
				if(score[1][j] < score[1][j+1]) {
					int tmp = score[1][j];
					score[1][j] = score[1][j+1];
					score[1][j+1] = tmp;
				}
			}
		}
		
			for (int i = 0; i < score.length; i++) {  
				System.out.print((i+1) + "반" + "\t");  

				for (int j = 0; j < score[i].length; j++) {
					System.out.print(score[i][j] + "\t");
				}
			}
	}
		
		
		
		
}	




