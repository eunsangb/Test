package java13_io.fileStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FIleOutputStreamEx {
	public static void main(String[] args) {
		
		//출력 대상 파일
		File file = new File("./src/java13_io/fileStream", "output");
		System.out.println("exists : " + file.exists());
		
		//파일 출력 스트림 객체
		FileOutputStream fos = null;
		
		try {
			//파일 출력 스트림 생성
			//	-> 출력 대상 파일이 존재하지 않으면 파일을 생성한다
			fos = new FileOutputStream(file);  //쓰기 모드
			
//			fos = new FileOutputStream(file, true);  //추가 모드
//			fos = new FileOutputStream(file, false);  //쓰기 모드
			
			
			String data = "Grape";
			fos.write(data.getBytes(), 0, data.length());
			fos.flush();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}finally {
			
			try {
				//스트림 닫기
				if(fos!=null)  fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
