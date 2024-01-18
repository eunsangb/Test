package java04_control.loop;

public class For_10_1 {

	public static void main(String[] args) {
		
//		for(int i = 2; i<10; i++) {
//			System.out.println("----"+i+"단"+"----");
//			for(int j = 1; j<10; j++) {
//				System.out.println(i+" x "+j+" = "+(i*j));
//			}
//		}  내가 한거
		
		
		for(int i =1; i<=9; i++) {	
			for(int dan =2; dan<=9; dan++) {
				System.out.print(i + "x" + dan + "=" + (dan*i)+"\t");
			}
			System.out.println();
		}
	}
	
	

}
