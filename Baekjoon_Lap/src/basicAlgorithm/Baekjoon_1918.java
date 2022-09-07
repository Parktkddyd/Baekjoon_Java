import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String S = br.readLine();
		Stack<Character> st = new Stack<Character>();
		
		for(int i=0; i<S.length(); i++) {
			if(S.charAt(i) >= 'A' && S.charAt(i) <= 'Z')
				bw.write(S.charAt(i));
			else {
			if(S.charAt(i) == '(') {
				st.push('(');
			}			
			else if(S.charAt(i) == ')') {
				while(st.peek() != '(')
					bw.write(st.pop());
				st.pop();
			}else {
				while(!st.isEmpty() && comparison(st.peek()) >= comparison(S.charAt(i)))
					bw.write(st.pop());
				
				st.push(S.charAt(i));
				
			}
			}
		}
		while(!st.isEmpty())
			bw.write(st.pop());
		
		bw.flush();
	}
	
	public static int comparison(char ch) {
        if (ch == '(') return 0;
        if (ch == '+' || ch == '-') return 1;
        else return 2;
    }
}