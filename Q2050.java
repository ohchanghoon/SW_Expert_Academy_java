// 알파벳으로 이루어진 문자열을 입력 받아 각 알파벳을 1부터 26까지의 숫자로 변환하여 출력
import java.util.Scanner;
public class Q2050 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char[] strs = str.toCharArray();
		for (int i = 0; i < str.length(); i++) {
			System.out.print((strs[i] - 'A') + 1 + " ");
		}

	}
}