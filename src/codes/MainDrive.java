package codes;

import java.io.File;
import java.io.FileWriter;

public class MainDrive {
	public static void main(String[] args) {

	writeToFile();
	
		
	}
	
	static void writeToFile() {
//		파일 저장 (output) 실습
		
//	1. 어디에 파일을 저장 할 것인지 경로 설정을 해야 함
		File myFile = new File("myTest.txt");
		
//	2. 실제로 파일 작성을 도와주는 클래스 활용
		
		FileWriter fw = new FileWriter(myFile);
		
		
	}
}
