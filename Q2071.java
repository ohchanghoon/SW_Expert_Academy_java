import java.util.Scanner;

public class Q2071 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int [] nums = new int[10];
		for ( int i=1; i<=N; i++) {
			double sum = 0;
			for ( int j=0; j<10; j++) {
				sum += sc.nextInt();
			}
			sum = Math.round(sum/10);
			System.out.println("#"+i+" "+(int)sum);
		}

	}

}