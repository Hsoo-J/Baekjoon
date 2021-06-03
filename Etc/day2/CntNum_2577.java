package day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CntNum_2577 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
//		int A = Integer.parseInt(br.readLine());
//		int B = Integer.parseInt(br.readLine());
//		int C = Integer.parseInt(br.readLine());

		int A = 150;
		int B = 266;
		int C = 427;
		
		int num = A*B*C;
		String D = Integer.toString(num);	// num을 String으로 변환
		
		int[] cnt = new int[10];		// 0~9까지 담을 배열 생성

		for(int i=0; i<D.length(); i++) {	// D의 자릿수까지 루프
			cnt[D.charAt(i)-48]++;		// D.charAt(i) = D를 한글자씩 나누기
										// cnt 배열의 D.charAt(i) 번째 자리에 +1씩
		}
		for(int j=0; j<10; j++) {
		System.out.println(cnt[j]);
		}
	}
}