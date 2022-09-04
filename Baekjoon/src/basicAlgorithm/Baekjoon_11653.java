package basicAlgorithm;

import java.util.*;
import java.io.*;
public class Baekjoon_11653 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		int i=2;
		while(N!=1) {
			if(N%i == 0) {
				bw.write(i+"\n");
				N/=i;
			}
			else
				i++;
		}
		bw.flush();
	}
}
