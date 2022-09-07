import java.util.*;
import java.io.*;

public class Main {
	static boolean[] arr = new boolean[1001];
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int count = 0;
		while(N-->0) {
		int i = Integer.parseInt(st.nextToken());
		
		PrimeNumber();
		if(arr[i] == false)
			count++;
		}
		
		System.out.println(count);
	}
	private static void PrimeNumber() {
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