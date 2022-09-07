import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s = br.readLine();
		
		Stack<Character> st = new Stack<Character>();
		int cnt=0;
		int a=0, b=0;// a는 나무막대기 개수, b는 레이저 개수
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i) == '(') {
				st.push(s.charAt(i));
			}else{
				if(s.charAt(i-1) == '(') {
					st.pop();
					cnt+=st.size();
				}else if(s.charAt(i-1) == ')'){
					st.pop();
					cnt+=1;
				}
			}
		}
		
		System.out.println(cnt);
	}
}