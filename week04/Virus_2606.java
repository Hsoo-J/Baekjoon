package week04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Virus_2606 {
	static int cnt = 0;		// 감염된 컴퓨터의 수
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());	// 정점의 수
		
		int[][] com = new int[N+1][N+1];	// 인접행렬 그래프 생성
		boolean[] visit = new boolean[N+1];	// 방문여부
		
		int M = Integer.parseInt(br.readLine());	// 간선의 수
		
		int i;
		for(i=0; i<M; i++) {	// 인접행렬에 연결정보 저장
			st = new StringTokenizer(br.readLine());
			
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			com[x][y] = 1;
			com[y][x] = 1;
		}
//		인접행렬 확인
//		for(i=1; i<com.length; i++) {
//			for(int j=1; j<com.length; j++) {
//				System.out.print(com[i][j]);
//				if(j==com.length-1) {
//					System.out.println();
//				}
//			}
//		}
		
//		dfs 실행 전 방문정보
//		for(i=1; i<visit.length; i++) {
//			System.out.print(visit[i] + " ");
//		}
		
		dfs(com, visit, 1);	// dfs 실행
		
//		dfs 실행 후 방문정보
//		for(i=1; i<visit.length; i++) {
//			System.out.print(visit[i]+" ");
//		}
		
		System.out.println(cnt-1);	// 1번 컴퓨터를 제외한 감염된 컴퓨터 수
	}
	
	static void dfs(int[][] com, boolean[] visit, int v) {

		visit[v] = true;	// 방문했을 경우 true로 변경
		cnt++;	// 바이러스 수 증가(1번 컴퓨터 포함)
		
		int i;
		for(i=0; i<com[v].length; i++) {	// 인접행렬 탐색
			if(com[v][i] == 1 && !visit[i]) {	// 연결된 정점이면서 미방문
				dfs(com, visit, i);			// dfs 수행
			}
		}
		
		if(visit[v] == true) {
			return;		// 완료시 dfs 종료
		}
	}
}
