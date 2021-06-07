package week01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class LectureRoom_11000 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		int[][] lecture = new int[N][2];
		
		int S, T, i;
		for(i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			
			S = Integer.parseInt(st.nextToken());	// 시작
			T = Integer.parseInt(st.nextToken());	// 끝
			
			lecture[i][0] = S;
			lecture[i][1] = T;
		}
		Arrays.sort(lecture, new Comparator<int[]>() {	// 이차원 배열 오름차순 정렬
			public int compare(int[] o1, int[] o2) {
				if(o1[0] == o2[0]) {
					return o1[1] - o2[1];
				} else {
					return o1[0] - o2[0];
				}
			}
		});
		
		PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (i = 0; i < N; i++) {
            S = lecture[i][0];
            T = lecture[i][1];
            if (!pq.isEmpty() && pq.peek() <= S) { // 시작시간이 일찍 끝나는 시간보다 같거나 크다면 기존 강의실 이용
                pq.poll();
            }
            pq.add(T);
        }
        System.out.println(pq.size());
	}
}