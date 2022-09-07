import java.util.*;
import java.io.*;

public class Main {
	static boolean[] arr;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw  = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		PrimeNumber();
		
		for(int i=N; i<=M; i++) {
			if(arr[i] == false)
				bw.write(i + "\n");
		}
		
		bw.flush();
	}
	private static void PrimeNumber() {
		arr = new boolean[1000001];
		
		arr[0] = true;
		arr[1] = true;
		
		for(int i=2; i<arr.length; i++) {
			if(arr[i] == true)
				continue;
			for(int j=i+i; j<arr.length; j+=i)
				arr[j] = true;
		}
	}
}