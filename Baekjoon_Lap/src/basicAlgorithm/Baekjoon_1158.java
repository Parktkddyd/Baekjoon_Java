import java.util.*;
import java.io.*;

public class Main {
	public static int idx = 0;
	public static Queue<Integer> q1 = new LinkedList<Integer>();
	public static Queue<Integer> q2 = new LinkedList<Integer>();
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int[] result = new int[N];
		for(int i=1; i<=N; i++) {
			q1.add(i);
		}
		int t=1;
		while(!q1.isEmpty()) {
			if((t % K) == 0) {
				result[idx++] = q1.poll();
				t++;
			}
			else {
				q2.add(q1.poll());
				t++;
				}
			
			if(!q2.isEmpty()) {
				while(!q2.isEmpty()) {
					q1.add(q2.poll());
				}
			}
		}
		
		System.out.print('<');
		for(int i=0 ; i<result.length; i++) {
			if(i == result.length-1) {
				System.out.print(result[result.length-1]);
				break;
			}
			System.out.print(result[i] + ", ");
		}
		
		System.out.print('>');
	}	
}