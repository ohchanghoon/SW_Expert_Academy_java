import java.util.Scanner;

public class Q2070 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for (int i = 1; i <= N; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();

			if (a > b) {
				System.out.println("#"+i+" "+">");
			} else if (a < b) {
				System.out.println("#"+i+" "+"<");
			} else {
				System.out.println("#"+i+" "+"=");
			}

		}
	}
}
