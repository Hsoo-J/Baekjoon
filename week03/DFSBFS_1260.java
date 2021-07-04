package week03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class DFSBFS_1260 {
	static boolean[] check;
	static int[][] graph;
	static int N, M, V;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int i;
		
		N = Integer.parseInt(st.nextToken());	// 정점
		M = Integer.parseInt(st.nextToken());	// 간선
		V = Integer.parseInt(st.nextToken());	// 시작점
		
		graph = new int[N+1][N+1];
		check = new boolean[N+1];
		
		for(i=0; i<M; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			graph[x][y] = 1;
			graph[y][x] = 1;
		}
		
		DFS(V);
		System.out.println();
		Arrays.fill(check, false);
		
		BFS(V);

	}
	
	public static void DFS(int i) {
		int j;
		check[i] = true;
		System.out.print(i + " ");
		
		for(j=1; j<N+1; j++) {
			if( graph[i][j] == 1 && !check[j]) {
				DFS(j);
				// 갈 곳이 없으면 리턴해서 돌아옴
			}
		}
	}
	
	public static void BFS(int i) {
		Queue<Integer> Q = new LinkedList<Integer>();
		
		Q.offer(i);
		check[i] = true;
		
		// 방문 체크
		while(!Q.isEmpty()) {
			int tmp = Q.poll();
			
			System.out.print(tmp + " ");
			
			for(int j=1; j<N+1; j++) {
				if(graph[tmp][j] == 1 && !check[j]) {
					Q.offer(j);
					check[j] = true;
				}
			}
		}
	}
}
