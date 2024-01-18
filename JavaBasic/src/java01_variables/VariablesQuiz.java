package java01_variables;

public class VariablesQuiz {

	public static void main(String[] args) {
		
		int studentAge;
		studentAge = 99;
		double height;
		height = 178.2;
		String name;
		name = "Alice";
		char sex;
		sex = 'M';
		
		System.out.print("나이 :" + studentAge);
		System.out.print("키: " + height );
		System.out.print("이름: " + name);
		System.out.print("성별 : " + sex);

		System.out.println("나이 :" + studentAge + ",키: " + height + ",이름: " + name + ",성별 : " + sex);
		
		System.out.print("AAA");
		System.out.print("BBB");
		System.out.println();
		System.out.println("------------------");
		
		System.out.println("---------");
		System.out.println("HI\nHELLO HOLA");
		System.out.println("---------");
		System.out.println("HI\nHELLO HOLA");
		
		//**  '\n' : 줄바꿈 문자, 개행 문자
		// (ASCII 10 - LF, Line Feed )
		
		System.out.println("---------");
		System.out.println("Apple");
		System.out.print("Apple\n");


	}

}
