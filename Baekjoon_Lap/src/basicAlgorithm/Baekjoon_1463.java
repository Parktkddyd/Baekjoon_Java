import java.io.*;

public class Main {
	public static int ans = Integer.MAX_VALUE;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		MakeOne(N, 0);
		
		System.out.println(ans);
	}
	private static void MakeOne(int n, int cnt) {
		
		if(n ==1) {
			ans = Math.min(ans, cnt);
			return;
		}
		
		if(cnt>=ans) {
			return;
		}
		
		if(n%3 ==0)
			MakeOne(n/3, cnt+1);
		if(n%2 ==0)
			MakeOne(n/2, cnt+1);
		MakeOne(n-1,cnt+1);
	}
}