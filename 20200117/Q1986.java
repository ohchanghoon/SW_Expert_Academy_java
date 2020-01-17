import java.util.Scanner;

public class Q1986 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			int N = sc.nextInt();
			if (N % 2 == 0) {
				int b = (N / 2) * -1;
				System.out.println("#" + i + " " + b);
			} else {
				int a = ((N - 1) / 2 * -1) + N;
				System.out.println("#" + i + " " + a);

			}
		}
	}

}
