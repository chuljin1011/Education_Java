package xyz.itwill.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileApp {
	public static void main(String[] args) throws IOException {

		File fileeOne = new File("c:\\data");

		if (fileeOne.exists()) {
			System.out.println("c:\\data 폴더가 이미 존재합니다.");
		} else {
			fileeOne.mkdir();
			System.out.println("c:\\data 폴더를 생성 했습니다.");

		}
		System.out.println("======================================");
		File fileTwo = new File("C:/data/itwill.txt");

		if (fileTwo.exists()) {
			System.out.println("c:\\dataitwill.txt 파일이 이미 존재합니다.");
		} else {
			fileTwo.createNewFile();
			System.out.println("c:\\dataitwill.txt 파일을 생성 했습니다.");
		}
		System.out.println("======================================");

		File fileThree = new File("c:/data", "itwill.txt");

		if (fileThree.exists()) {
			fileThree.delete();
			System.out.println("c:\\data\\itwill.txt 파일이 삭제 되었습니다.");
		} else {
			System.out.println("c:\\data\\itwill.txt 파일이 없습니다.");

		}
		
		System.out.println("======================================");
		File fileFour=new File("src");
		
		if(fileFour.exists()) {
			System.out.println("File 객체에 저장된 파일 경로 = " + fileFour);
			System.out.println("File 객체에 저장된 파일 경로 = " + fileFour.getAbsolutePath());
		} else {
			System.out.println("작업 디렉토리에 src 폴더가 없습니다.");
		}
		System.out.println("======================================");
		
		File filefive = new File("c:/");
		
		if(filefive.isDirectory()) {
			File[] subFiles=filefive.listFiles();
			
			for(File file : subFiles) {
				
				if(file.isFile()) {
					System.out.println("파일 = " + file);
				} else {
					System.out.println("폴더 = " + file);
					
					
				}
			}
			
		}
		
	}
}
