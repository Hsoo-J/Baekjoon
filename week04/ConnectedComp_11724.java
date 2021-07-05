package week04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ConnectedComp_11724 {
	
	static int cnt = 0;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[][] graph = new int[N+1][N+1];
		boolean[] visit = new boolean[N+1];
		
		int i;
		for(i=0; i<M; i++) {
			st = new StringTokenizer(br.readLine());
			int u = Integer.parseInt(st.nextToken()); 
			int v = Integer.parseInt(st.nextToken());
			
			graph[u][v] = 1;
			graph[v][u] = 1;
		}
		
//		인접행렬 확인
//		for(i=1; i<N+1; i++) {
//			for(int j=1; j<N+1; j++) {
//				System.out.print(c[i][j]);
//				if(j==v) {
//					System.out.println();
//				}
//			}
//		}
		
		for(i=1; i<N; i++) {
			if(!visit[i]) {	// 정점에 방문하지 않았다면
				dfs(graph, visit, i);	// dfs 수행하고
				cnt++;
//				if()
			}
		}
		System.out.println(cnt);
	}
	
	public static void dfs(int[][] graph, boolean[] visit, int v) {
		
		visit[v] = true;	// 방문하면 true로 변경

		for(int i=0; i<graph[v].length; i++) {
			if(graph[v][i]==1 && !visit[i]) {	// 연결되어있고, 방문하지 않은 경우
				dfs(graph, visit, i);	// dfs 실행
			}
		}
		
		if(visit[v] == true) {
			return;		// 완료시 dfs 종료
		}
	}
}
