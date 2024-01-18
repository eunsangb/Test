package beakjoon;

import java.util.Scanner;

public class Beakjoon01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력하세요 : " );
		int score = sc.nextInt();
		if(score >= 90) {
			System.err.println("A");
		}else if ( score < 89) {
			System.out.println("B");
		}else {
			System.out.println("c");
		}
		
	}
}