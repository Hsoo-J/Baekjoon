package week01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NewEmployee_1946{
public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(reader.readLine());
        int t, i;
 
        for(t=0; t<T; t++){
            int N = Integer.parseInt(reader.readLine());
            int [] test= new int[N+1];
 
            for(i=0; i<N; i++) {
                st = new StringTokenizer(reader.readLine());
                int paper = Integer.parseInt(st.nextToken());
                int inter = Integer.parseInt(st.nextToken());
                test[paper] = inter;
            }
            
            int result = 1;
            int standard = test[1];
            for(i=2; i<=N; i++) {
                if(standard > test[i]) {
                    result++; //추가
                    standard = test[i];
                }
            }
            System.out.println(result);
        }
    }
}