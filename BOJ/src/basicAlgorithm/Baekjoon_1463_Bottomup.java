package basicAlgorithm;
import java.util.*;
import java.io.*;
public class Baekjoon_1463_Bottomup {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());

		System.out.println(MakeOne(N));
	}
	private static int MakeOne(int n) {
		int[] dp = new int[n+1];
		
		
		//dp[0] = dp[1] = 0;
		for(int i=2; i<=n; i++) {
			dp[i] = dp[i-1]+1;
			
			if(i%3==0) {
				dp[i] = Math.min(dp[i], (dp[i/3]+1));
			}
			
			if(i%2==0) {
				dp[i] = Math.min(dp[i], (dp[i/2]+1));
			}
		}
		
		return dp[n];
	}
}
