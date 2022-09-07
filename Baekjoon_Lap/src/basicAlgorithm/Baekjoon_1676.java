import java.io.*;
import java.util.StringTokenizer;


public class Main {
public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());
		
			System.out.println(Facto(A));
		
	}
	private static int Facto(int a) {
		
		if(a<5) {
			return 0;
		}else {
			return (a/5) + Facto(a/5);
		}
		
	}
}