package week04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Wellbeing_1012 {
	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		int i, j, k;
		for(i=0; i<T; i++) {
			st = new StringTokenizer(br.readLine());
			
			int M = Integer.parseInt(st.nextToken());
			int N = Integer.parseInt(st.nextToken());
			int K = Integer.parseInt(st.nextToken());
			
			int[][] farm = new int[N+1][M+1];
			
			for(j=0; j<K; j++) {
				st = new StringTokenizer(br.readLine());
				
				int x = Integer.parseInt(st.nextToken());
				int y = Integer.parseInt(st.nextToken());

			}
			
//			for(j=0; j<M+1; j++) {
//				for(k=0; k<N+1; k++) {
//					farm[x][y] = 
//					System.out.println(farm[i][j]);
//				}
//			}
			
		}
		
		
	}
}
