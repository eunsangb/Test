package java09_api.ranQuiz;

import java.util.Random;
import java.util.Scanner;



public class RanQuiz {
	
	private Random ran = new Random();
	Scanner sc = new Scanner(System.in);
	
	public void updown(int[] com) {
		
		
		for(int i = 0; i<com.length; i++) {
			int num = ran.nextInt(50) +1 ;
			
			System.out.println("user : " );
			
			int user = sc.nextInt();
			
			if(user< num) {
				System.out.println("up");
			}
		}
	}
	
}	
	

