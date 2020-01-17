import java.util.Arrays;
import java.util.Scanner;

public class Q2063 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] nums = new int[N];
		for (int n = 0; n < N; n++) {
			nums[n] = sc.nextInt();
		}
		Arrays.sort(nums);
		System.out.println(nums[N / 2]);
	}

}
