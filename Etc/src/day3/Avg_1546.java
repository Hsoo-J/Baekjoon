package day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Avg_1546 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		float[] score = new float[N];
		int i;
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(i=0; i<N; i++) {
			score[i] = Integer.parseInt(st.nextToken());
		}
		
		float Max = score[0];
		float sum = 0;
		
		for(i=0; i<N; i++) {
			if(score[i]>Max) {
				Max=score[i];	
			}
			sum += score[i];
		}
		System.out.println(sum*100/Max/N);
	}
}
