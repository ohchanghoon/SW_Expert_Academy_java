// 1부터 주어진 횟수까지 2를 곱한 값(들)을 출력하시오.
import java.util.Scanner;

public class Q2019 {

	public static void main(String[] args) {

		System.out.println("정수를 입력하세요");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i <= n; i++)
			System.out.print((int) Math.pow(2, i) + " ");

	}

}
