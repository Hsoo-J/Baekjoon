package day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OXQuiz_8958 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int i, j;
		char A;
		
		String[] Answer = new String[N];
		
		for(i=0; i<N; i++) {
			Answer[i] = br.readLine();	
			int Score = 0;
			int Result = 0;
			for(j=0; j<Answer[i].length(); j++) {
				A = Answer[i].charAt(j);
				
				if( A == 'O' ) {
					Score ++;
					
				} else {
					Score = 0;
				}
//				System.out.println(j+1+"회");
//				System.out.println("A = "+A);
//				System.out.println("누적 점수 = " + Result);
//				System.out.println("Score = " + "+" + Score);
//				System.out.println();
				Result = Result + Score;
			}
			System.out.println(Result);
		}
		
		
	}
}
