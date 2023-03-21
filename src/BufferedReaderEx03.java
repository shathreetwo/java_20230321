package src;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class BufferedReaderEx03 {

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
		HashMap<String, Integer> map = new HashMap<>();
		//File f = new File(null);
		
		//System.out.println(f.getAbsolutePath());
		
		while(true) {
			String line = br.readLine();
			if(line ==null) {break;}
			
			String name = line.substring(0,line.indexOf(" "));
			int score = Integer.parseInt(line.substring(line.indexOf(" ")+1));
			map.put(name, score);
			
		}
		System.out.println(map);
		int sum=0;
		for(String n:map.keySet()) {
			System.out.println(n+":"+map.get(n));
			sum+=map.get(n);
		}
		br.close();
		
	}
}