import java.util.Scanner;

public class AB7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int result = 0;
		
		int T = sc.nextInt();
		for(int i=1; i<=T; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			
			result = A+B;
			System.out.println("Case #" + i + ": " + result);
		}
	}
}
