import java.io.*;
public class Main {
	static int[] dp;
	static int[] arr;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String[] s = br.readLine().split(" ");
		arr = new int[N+1];
		dp = new int[N+1];
		for(int i=1; i<=N; i++) {
			arr[i] = Integer.parseInt(s[i-1]);
		}
		
		System.out.println(Func(N));
	}
	private static int Func(int n) {
		dp[1] = arr[1];
		
		for(int i=2; i<=n; i++) {
			dp[i] = arr[i];
			for(int j=1; j<=i; j++) {
				dp[i] = Math.max(dp[i], dp[i-j]+arr[j]);
			}
		}
		return dp[n];
	}
}