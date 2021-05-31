package week1;

import java.util.Scanner;

public class Coin0 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		int result = 0;
		
		int[] money = new int[N];			// 돈의 단위를 넣어줄 배열 생성
		
		for(int i=0; i<N; i++) {				// 단위를 입력받을 방의 수
			money[i] = sc.nextInt();			// 단위 입력받음
		}
				
		for(int i=N-1; i>=0; i--) {			// 단위가 큰 돈부터 for문 돌리기
			if( K >= money[i] ) {				// K보다 작거나 같은 money 고르기
				
				result += K / money[i];		// 그 money로 K를 나눔
				K = K % money[i];				// 다음 K는 money로 K를 나눈 나머지
				
			}
		}
		System.out.println(result);
	}

}