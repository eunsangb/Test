package java13_io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileOutputStreamEx {

public static void main(String[] args) {
		
		
		
		//입력 대상 파일 객체
		File file = new File("./src/java13_io/fileStream/", "input");
		System.out.println("exist : " + file.exists());
		
		
		
		
		//파일 입력 관련 변수	
		byte[] buf = new byte[1024];
		int len = -1;	//입력 데이터의 길이
		
		
		//최종 데이터 저장소
		StringBuilder sb = new StringBuilder();
		
		//파일 입력 스트림 객체
		FileInputStream fis = null;
		
		
		try {
		//파일 입력 스트림 생성
		fis = new FileInputStream(file);
		
		
		//파일에 읽어들일 데이터가 존재하면 반복한다.
		try {
			while ((len = fis.read(buf)) != -1) {
				
			}
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				//스트림 닫기
				if(fis!=null) fis.close();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println();
		System.out.println("읽어들인 데이터파일");
		System.out.println(sb);
		
		

	}
}
