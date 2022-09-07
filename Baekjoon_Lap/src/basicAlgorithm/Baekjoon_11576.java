import java.util.*;
import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Stack<Integer> st = new Stack<Integer>();
		String[] s1 = br.readLine().split(" ");
		int m = Integer.parseInt(br.readLine());
		String[] s2 = br.readLine().split(" ");
		int[] arr = new int[s2.length];
		
		int A = Integer.parseInt(s1[0]); // 미래세계 진법
		int B = Integer.parseInt(s1[1]); // 정이세계의 진법
		
		for(int i=0; i<s2.length; i++) {
			arr[i] = Integer.parseInt(s2[i]);
		} // 문자열로 받은 숫자들 각각 정수로 변환
		
		int pow=(m-1); // 길이-1 = 숫자의 위치
		int res=0; // 10진수로 변환한 값
		
		for(int i=0; i<arr.length; i++)
			res+=(arr[i]*Math.pow(A, pow--)); // A진수 10진수 변환
		
		if(res == 0) {
			st.push(0);
		}else {
			while(res!=0) {
				st.push(res%B);
				res/=B;
			}
		}
		
		while(!st.isEmpty())
			bw.write(st.pop()+" ");
		
		bw.flush();
	}
}