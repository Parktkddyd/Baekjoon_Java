import java.io.*;
public class Main {
	static int[] dp = new int[11];
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine());
		while(T-->0) {
		int N = Integer.parseInt(br.readLine());
		bw.write(plus(N)+"\n");
		}
		bw.flush();
	}

	private static int plus(int n) {
		dp[1] = 1;
		dp[2] = 2;
		dp[3] = 4;
		
		for(int i=4; i<=n; i++) {
			dp[i] = dp[i-3]+dp[i-2]+dp[i-1];
		}
		
		return dp[n];
		
	}
}