import java.util.Arrays;
import java.util.Scanner;

public class Q2068 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] num = new int[10];

		for (int i = 1; i <= N; i++) {
			for (int j = 0; j < 10; j++) {
				num[j] = sc.nextInt();
			}
			Arrays.sort(num);
			System.out.println("#" + i + " " + num[9]);
		}
	}
}