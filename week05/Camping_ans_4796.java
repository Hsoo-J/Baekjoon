package week05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Camping_ans_4796 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int cnt = 0;
		int result;

		while(true) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int L = Integer.parseInt(st.nextToken());	// 사용 가능일 
			int P = Integer.parseInt(st.nextToken());	// 연속하는 날짜
			int V = Integer.parseInt(st.nextToken());	// 총 휴가일
			
			if(L == 0) break;	// 첫번째 토큰인 L이 0이면 종료

			result = 0;
			cnt++;
			
			while ( V > P ) {	// V가 P보다 크면
				V -= P;			// V는 P를 뺸 값으로 초기화
				result += L;	// result에 L 만큼 더함
			} 
			
			if(L >= V) {		// 남은 날이 L보다 작거나 같으면
				result += V;	// 남은 날을 result에 더해준다
			} else {			// L이 남은 날보다 크면 
				result += L;	// result에 L만큼 더해준다
			}

			System.out.println("Case " + cnt + ": " + result);
		}
	}
}
