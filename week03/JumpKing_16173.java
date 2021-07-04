package week03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class JumpKing_16173 {

	static int[] x = {0, 1};
	static int[] y = {1, 0};
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		int[][] map = new int[N][N];	// 맵 생성
		boolean[][] visit = new boolean[N][N];	// 방문여부
		
		int i, j;
		for(i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			for(j=0; j<N; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
//		dfs();
		
		System.out.println("Hing");
	}
	
	static void dfs(int N, int[][] map, boolean[][] visit, int a, int b) {
		int jelly = map[a][b];
	}

}
