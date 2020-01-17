public class Q2058 {

	public static void main(String[] args) {

		String N = (new Scanner(System.in).next());
		int sum = 0;
		int[] num = new int[4];
		
		for ( int i=0; i<num.length; i++) {
			num[i] = N.charAt(i) - '0';
			sum += num[i];
		}
		System.out.println(sum);
	}

}
