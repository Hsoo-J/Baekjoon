package day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Max_2562 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] num = new int[9];
		int i;
		
		for(i=0; i<9; i++) {
			num[i] = Integer.parseInt(br.readLine());
		}
		int max = num[0];
		
		for(i=0; i<9; i++) {
			if(num[i]>max) {
				max = num[i];
			}
		}
		
		for(i=0; i<9; i++) {
			if(num[i]==max) {
				System.out.println(max);
				System.out.println(i+1);
			}
		}	
	}
}