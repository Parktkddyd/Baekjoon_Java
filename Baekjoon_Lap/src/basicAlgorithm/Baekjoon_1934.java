import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		
		while(N-->0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			if(a>b) {
			GCD(a,b);
			bw.write((a*b)/GCD(a,b) + "\n");
			}else {
				GCD(b,a);
				bw.write((a*b)/GCD(b,a) + "\n");
			}	
		}
		bw.flush();
	}

	private static int GCD(int a, int b) {
		if(b == 0) {
			return a;
		}else {
			return GCD(b, a%b);
		}
		
	}
}