package week05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Camping_4796 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuffer sb;

		int cnt = 0;
		int result;
		boolean[] date;
		int[] no;
		int a;
		
		while(true) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int L = Integer.parseInt(st.nextToken());	// 사용 가능 기간
			int P = Integer.parseInt(st.nextToken());	// 연속하는 날짜
			int V = Integer.parseInt(st.nextToken());	// 총 휴가 기간
			
			if(L==0) break;

			result = 0;									// result 초기화
			
			date = new boolean[V+1];					// 1일부터 시작
			
			a = V/P;									// P가 반복될 횟수
			no = new int[a+1];							// V보다 작은 P의 배수를 저장할 배열

			int i, j;
			for(i=0; i<=a; i++) {
				no[i] = P * i;							// V보다 작은 P의 배수를 저장
				
				for(j=1; j<=L; j++) {					// 1일부터 L일까지
					if( j + no[i] <= V ) {
						date[j + no[i]] = true;
						result++;
					}
				}
			}

			sb = new StringBuffer();
			cnt++;
			
			sb.append("case " + cnt + ": " + result).append('\n');
			System.out.print(sb);
		}
	}
}
