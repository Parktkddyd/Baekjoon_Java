import java.util.*;
import java.io.*;

public class Main {
	static boolean[] arr;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw  = new BufferedWriter(new OutputStreamWriter(System.out));
		
		PrimeNumber();
		while(true) {
			int ans = Integer.parseInt(br.readLine());
			int p = 3;
			int q = ans-p;
			
			if(ans == 0)
				break;
			
			while(true) {
					if((p+q == ans) && (arr[p] == false && arr[q] == false)) {
						bw.write(ans + " = " + p + " + " + q + "\n");
						break;
					}else {
						p++;
						q--;
					}
					
					if(p == q) {
						bw.write("Goldbach's conjecture is wrong.");
						break;
					}
				}
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