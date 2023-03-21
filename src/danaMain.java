package src;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

public class danaMain {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		/*
		 * out.txt 파일을 읽어들여 map에 저장 후 
		 * 이름: 점수
		 * 총 합계총인원 출력
		 * map.put(name,score)
		 * 입력받은 값은 전부 String 계산을 위해서는 int ㅈ료형으로 변환이 필요
		 * Integer.parseInt(문자값);
		 * 
		 */
		BufferedReader br = new BufferedReader(new FileReader("out.txt"));
		PrintWriter pw = new PrintWriter(new FileWriter("out.txt",true));
		HashMap<String, String> map = new HashMap<>();
		//File f = new File(null);
		//System.out.println(f.getAbsolutePath());
		
		while(true) {
			String line = br.readLine();
			if(line ==null) {break;}
			String name = line.substring(0,line.indexOf(":"));
			String score = line.substring(line.indexOf(":")+1);
			map.put(name, score);
		}
		System.out.println(map);
		for(String n:map.keySet()) {
			System.out.println(n+":"+map.get(n));
		}
		String line = "";
		String update="바나나";
		while((line=br.readLine())!=null) {
			if((line=br.readLine())=="banana : 바나나") {
				pw.println("메론");
			}
			System.out.println(line); //콘솔 출력
			pw.println(line);
		}
		br.close();
	}
}
