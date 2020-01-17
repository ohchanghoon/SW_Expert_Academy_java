import java.util.Scanner;

public class Q2072 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int[] nums = new int[10];

		for (int i = 1; i <= N; i++) {
			int sum = 0;
			for (int j = 0; j < 10; j++) {
				nums[j] = sc.nextInt();
				if (nums[j] % 2 == 1) {
					sum += nums[j];
				}
			}
			System.out.println("#" + i + " " + sum);
		}

	}

}