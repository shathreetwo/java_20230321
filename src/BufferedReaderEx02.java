package src;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class BufferedReaderEx02 {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		/*
		 * BufferedReader, PrintWriter
		 * 파일을 읽어들여 복사하여 객체 생성
		 * out.txt에서 파이을 읽어서 out2.txt로 쓰기
		 */
		
		BufferedReader br = null;
		PrintWriter pw = null;
		final String Path_OUT = "C:\\\\Users\\\\EZENIC-152\\\\eclipse-workspace\\\\out2.txt";
		System.out.println("복사를 시작합니다.");
		
		br = new BufferedReader(new FileReader("C:\\Users\\EZENIC-152\\eclipse-workspace\\out.txt"));
		pw = new PrintWriter(new FileWriter(Path_OUT,true));
		
		System.out.println("복사를 위한 객체 생성 완료~!!");
		
		String line = "";
		
		while((line=br.readLine())!=null) {
			System.out.println(line); //콘솔 출력
			pw.println(line);
		}
		System.out.println("텍스트 복사 완료");
		
		if(br!=null) {
			br.close();
		}
		if(pw != null) {
			br.close();
		}
	}
}