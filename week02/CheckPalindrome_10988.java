package week02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckPalindrome_10988 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String a = br.readLine();
		int result = 1;
		
		int i;
		for(i=0; i<a.length(); i++) {
			char A = a.charAt(i);
			char B = a.charAt(a.length()-1-i);
			
			if( A != B ) {
				result = 0;
			}
		}
		System.out.println(result);
	}
}
