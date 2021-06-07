package week01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class LectureRoom_11000_2 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		int[] start = new int[N];
		int[] end = new int[N];
		int result = N;
		
		int i, j;
		for(i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			
			int S = Integer.parseInt(st.nextToken());
			int T = Integer.parseInt(st.nextToken());
			
			start[i] = S;
			end[i] = T;
			
		}
		Arrays.sort(start);
		Arrays.sort(end);

		for(i=0; i<N; i++) {
			for(j=0; j<N; j++) {
				if(start[i]==end[j]) {
					result--;
					
				}
				
			}			
		}
		System.out.println(result);
	}
}