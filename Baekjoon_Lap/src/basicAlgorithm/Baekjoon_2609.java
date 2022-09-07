import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		int i=2; // 처음 나눌 수
		int k=1; // 최소 공배수
		while(true) {
			if(a/i == 0 || b/i == 0)
				break;
			if(a%i == 0 && b%i==0) {
				a = a/i;
				b = b/i;
				k *=i;
			}else {
				i++;
			}
		}
		
		System.out.println(k);
		System.out.println(k*a*b);
	}
}