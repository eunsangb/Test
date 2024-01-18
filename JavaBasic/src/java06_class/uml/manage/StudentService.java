package java06_class.uml.manage;

import java.util.Scanner;

public class StudentService {

	Student student = new Student();
	
	private Student stu = new Student();
	private Scanner input = new Scanner(System.in);
	
	public StudentService() {
	
		
		
	}
	
	
	//이름과 나이 입력
	public void insertInfo() {
		System.out.print("Input name : ");
		stu.setName(input.nextLine());
		
		System.out.print("Input age : ");
		stu.setAge(input.nextInt());
		
		
	}
	
	//국영수 점수 입력
	public void insertScore() {
		System.out.print("Input Korean :");
		stu.setKor(input.nextInt());
		
		System.out.print("Input English :");
		stu.setEng(input.nextInt());
		
		System.out.print("Input Math :");
		stu.setMath(input.nextInt());
		
		//총점 계산하기
		this.calcSum();
		
		//평균 계산하기
		this.calcAvg();
		
		
	}
	
	//총점 계산
	public void calcSum() {
		
		stu.setSum(stu.getKor() + stu.getMath() + stu.getEng());
		
	}
	
	//평균 계산
	public void calcAvg() {
		
		stu.setAvg(stu.getSum() / (double)3);
		
	}
	
	//학생 정보 출력
	public void printStu() {
		
		System.out.println("- - - 학생 정보 - - -");
		
		System.out.println("이름\t나이\t국어\t영어\t수학\t총점\t평균");
		System.out.print(stu.getName() + "\t");
		System.out.print(stu.getAge() + "\t");
		
		System.out.print(stu.getKor() + "\t");
		System.out.print(stu.getEng() + "\t");
		System.out.print(stu.getMath() + "\t");
		
		
		System.out.print(stu.getSum() + "\t");
		System.out.printf("%.2f" , stu.getAvg());
		System.out.println();
	}
	
	

	
	
}
