import java.util.*;
import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
		
		int r1 = (Facto2(A) -(Facto2(B) + Facto2(A-B)));
		int r2 = (Facto5(A) -(Facto5(B) + Facto5(A-B)));
		System.out.println(Math.min(r1, r2));
		
	}
	private static int Facto5(int a) {
		
		if(a<5) {
			return 0;
		}else {
			return (a/5) + Facto5(a/5);
		}
		
	}
	
private static int Facto2(int a) {
		
		if(a<2) {
			return 0;
		}else {
			return (a/2) + Facto2(a/2);
		}
		
	}

}

