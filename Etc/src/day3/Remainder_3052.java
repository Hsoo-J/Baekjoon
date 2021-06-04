package day3;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Remainder_3052 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int i;
		int[] A = new int[10];
		int cnt=0;
		int[] cnts = new int[42];
		
		for(i=0; i<10; i++) {
			A[i] = Integer.parseInt(br.readLine()) % 42;
			
			cnts[A[i]]++;
			
			if(cnts[A[i]]!=0) {
				cnt++;
			}
			if(cnts[A[i]]>=2) {
				cnt--;
			}
		} 
		System.out.println(cnt);
	}
}
