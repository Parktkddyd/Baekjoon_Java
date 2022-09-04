package basicAlgorithm;
import java.io.*;

public class Baekjoon_1463_Topdown {
	static int[] dp;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		System.out.println(MakeOne(N));
		
	}
	private static int MakeOne(int n){
		dp = new int[n+1];
		
		if(n==1) {
			return 0;
		}
		if(dp[n]>0)
			return dp[n];
		
		dp[n] = MakeOne(n-1)+1;
		
		if(n%3==0)
			return (Math.min(dp[n], MakeOne(dp[n/3])+1));
		
		if(n%2==0)
			return (Math.min(dp[n], MakeOne(dp[n/2])+1));
		
		return dp[n];
	}
}
