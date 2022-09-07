import java.util.*;
import java.io.*;
public class Main {
	static boolean[] Prime; 
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		int cnt;
		int start_p;
		int end_p;
		PrimeNumber();
		while(T-->0) {
			int N = Integer.parseInt(br.readLine());
			cnt = 0;
			start_p = 2;
			end_p = N-start_p;
			
			while(start_p<=end_p) {
				if(Prime[start_p] == false && Prime[end_p] == false && (start_p+end_p==N)) {
					cnt++;
					start_p++;
					end_p--;
				}else {
					start_p++;
					end_p--;
				}
			}
			bw.write(cnt + "\n");
		}
		bw.flush();
	}
	private static void PrimeNumber() {
		Prime = new boolean[1000001];
	
		Prime[0] = true;
		Prime[1] = true;
		
		for(int i=2; i<Prime.length; i++) {
			if(Prime[i] == true)
				continue;
			for(int j=i+i; j<Prime.length; j+=i) {
				Prime[j] = true;
			}
		}
	}
}