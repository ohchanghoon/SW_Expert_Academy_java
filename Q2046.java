
// 주어진 숫자만큼 # 을 출력해보세요.
// 주어질 숫자는 100,000 이하다.
import java.util.Scanner;

public class Q2046 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for (int i = 0; i < a; i++) {
			String z = "#";
			System.out.print(z);
		}
	}
}
