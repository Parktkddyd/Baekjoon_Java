import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Stack<Character> st = new Stack<Character>();
		String[] s = br.readLine().split(" ");
		
		int N = Integer.parseInt(s[0]);
		int B = Integer.parseInt(s[1]);
		
		if(N == 0) {
			bw.write('0');
		}else {
			if(B<=10) {
				while(N!=0) {
					st.push((char)('0'+N%B));
					N/=B;
				}
			}else {
				while(N!=0) {
					if(N%B < 10) {
						st.push((char)('0'+N%B));
					}else {
						st.push((char)('A'+(N%B-10)));
					}
					N/=B;
				}
			}
		}
		while(!st.isEmpty())
			bw.write(st.pop()+"");
		
		bw.flush();
	}
}