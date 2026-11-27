package filecopy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopy {
	
	public static void main(String[] args) {
		copyImageFile();
//		copyTextFile();
	}
	
	public static void copyImageFile() {
		String source = "Curi_01.jpg";
		String target = "Curi_01_copied.jpg";
		
		// 입력 파일로 입력 스트림 객체 생성	
		// 출력 파일로 출력 스트림 객체 생성
		try (InputStream fis = new FileInputStream(source);
			OutputStream fos = new FileOutputStream(target);
		) {
			while (true) {
			    // 입력 스트림 객체로부터 데이터를 읽어옴
//				int data = fis.read();
//				if (data == -1) break;
			    // 읽어온 데이터를 출력 스트림 객체로 출력
//				fos.write(data);
				
				byte[] dataArr = new byte[128];
				int result = fis.read(dataArr);
				if (result == -1) break;
				fos.write(dataArr);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
	
	public static void copyTextFile() {
		String orgFilename = "D1_Student.txt";
		String copiedFilename = "D1_Student_copied.txt";
		
		try (FileReader fr = new FileReader(orgFilename);
			 FileWriter fw = new FileWriter(copiedFilename);	
		) {
			while(true) {
				
				int c = fr.read();
				if ( c== -1) break;
				fw.write(c);
			}
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
