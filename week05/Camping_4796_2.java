package week05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Camping_4796_2 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuffer sb;

		int cnt = 0;
		int result;

		while(true) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int L = Integer.parseInt(st.nextToken());	// 사용 가능 기간
			int P = Integer.parseInt(st.nextToken());	// 연속하는 날짜
			int V = Integer.parseInt(st.nextToken());	// 총 휴가 기간
			
			if(L==0) break;
			
			cnt++;										// Case +1
			result = 0;									// result 초기화

			result += L * (V / P);						// V일 동안 반복되는 P일 이내에 L일 모두 사용
			
			if( L <= V % P ) {							// L이 남은 날보다 적거나 같은 경우
				result += L;							// result에 L 추가
			} else if( L > V % P) {						// L보다 남은 날이 적은 경우
				result += V % P;						// result에 남은 날 추가
			} 
			
			sb = new StringBuffer();

			sb.append("Case " + cnt + ": " + result).append('\n');
			System.out.print(sb);
		}
	}
}
