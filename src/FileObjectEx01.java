package src;

import java.io.File;

public class FileObjectEx01 {
	public static void main(String[] args) {
		File f = new File("C:\\Users\\EZENIC-152\\eclipse-workspace\\out.txt");
		String fileName = f.getName();
		System.out.println(fileName); //경로를 제외한 파일이름
		System.out.println(f.getPath()); //경로 + 이름
		System.out.println(f.getAbsolutePath()); //경로 + 이름
		System.out.println(f.getParent()); //경로만
		System.out.println(File.separator); //파일 구분자
		System.out.println(File.separatorChar); //파일 구분자
		
		
		String fstr = f.toString();
		System.out.println(fstr); //경로 + 파일명
		//fstr에서 드라이브만 추출 출력
System.out.println("드라이브:"+fstr.substring(0,fstr.indexOf(File.separator)));
		//fstr에서 파일명만 추출 출력
//System.out.println("파일명:"+fstr.substring(fstr.lastIndexOf(File.separator)+2,fstr.indexOf(File.separator)));		
		//fstr에서 파일경로만 추출 출력
System.out.println(fstr.substring(fstr.indexOf(File.separator)+1,fstr.lastIndexOf(File.separator)));


//파일명과 확장자 분리
System.out.println(f.getName()); //파일명 확장자
String[] str = f.getName().split(File.separator+".");
System.out.println("파일명:"+str[0]+", 확장자");
		
		

	}
}
