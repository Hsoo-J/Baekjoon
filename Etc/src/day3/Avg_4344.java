package day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Avg_4344 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int C = Integer.parseInt(br.readLine());
		int i, j;
		int[] scores;
		int score;
		
		
		for(i=0; i<C; i++) {
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			
			scores = new int[N];
			
			double sum = 0;
			
			for(j=0; j<N; j++) {
				score = Integer.parseInt(st.nextToken());
				scores[j] = score;
				sum += scores[j];
			}
			
			double cnt = 0;
			double rate = sum/N;
			
			for(j=0; j<N; j++) {
				if(scores[j]>rate) {
					cnt ++;
				}
				
			}
			double result = (cnt/N)*100;
			System.out.printf("%.3f%%\n", result);
		}
	}
}
