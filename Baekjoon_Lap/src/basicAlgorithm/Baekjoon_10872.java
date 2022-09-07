import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		System.out.println(Factorial(N));
	}

	private static int Factorial(int n) {
		if(n == 0) {
			return 1;
		}else {
			return n*Factorial(n-1);
		}
		
	}
}