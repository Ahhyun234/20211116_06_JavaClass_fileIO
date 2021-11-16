package codes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MainDrive {
	public static void main(String[] args) {

//	writeToFile();
//		readFile();
		
		
		Scanner myScanner = new Scanner(System.in);
		System.out.println("파일에 저장 할 문구");
		String inputStr = myScanner.nextLine();
		writeToFile(inputStr);
		
	}
		
		Static void writeToFile(String content) {
			
		}
		
		
		static void readFile() {
//			파일 load 하기 (input)
//			1. 어디서 파일을 불러 올 것인지 경로 설정을 해야 함
			Filw myFile = new File("mytest.txt");
//			2. 파일 불러내기 클래스 활용 -> 파일이 지워져 있으면? 예외 대응 try catch 필요
			
			
		
			
			
			FileReader fr = new Filereader(myFile);
		
		
//		여러 글자를 뭉쳐서 String으로 읽어오게 하는 클래스 => 한번에 한 줄씩 반복 
		
//		불명확한 반복이기 때문에 while 사용 / io 추가 대비 필요
			String line = br.readLine();
			
			if(line==null) {
//				더이상 읽을 게 없음
				System.out.println("끝까지 읽음");
				break;
			}
			System.out.println(line);
			
			
			BufferedReader br = new BufferedReader(fr);
		
//			파일을 다 쓰면 닫아주자 (다른곳에서도 사용 가능하게)
			br.close();
			fr.close();
			
		}
		
		
		

//		try {
//			for (int i = 0; i < 5; i++) {
//				System.out.println(10 % i);
//			}
//		} catch (Exception e) {
//			System.out.println("예외발생");
//		}
//		System.out.println("앱이 안죽어야 나오는 코드");
//
	}

	static void writeToFile() {
//		파일 저장 (output) 실습

//	1. 어디에 파일을 저장 할 것인지 경로 설정을 해야 함
		File myFile = new File("myTest.txt");

//	2. 실제로 파일 작성을 도와주는 클래스 활용 => 위험소지 try/catch사용

		try {
			
//			한 글자를 2byte씩 다루게 되어있음 -> 한번에 한 글자씩만 처리 함
			FileWriter fw = new FileWriter(myFile,true);
			
//			문장을 통재로 다루게 도와주는 Class
			BufferedWriter bw = new BufferedWriter(fw);
			
//			실제 문장 기록: bw를 이용
			bw.append("수고하셨습니다.");
			
//			다음줄로 내려주자
			bw.newLine();
			
//			파일을 다 쓰면 닫아주자 (다른곳에서도 사용 가능하게)
			bw.close();
			fw.close();
			
			
			
		} catch (IOException e) {

			e.printStackTrace();
		}

	}
}
