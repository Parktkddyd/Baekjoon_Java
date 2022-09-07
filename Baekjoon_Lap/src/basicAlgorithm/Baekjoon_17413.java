package basicAlgorithm;
import java.util.*;
import java.io.*;

public class Main {
		public static void main(String[] args) throws IOException{
			BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw  = new BufferedWriter(new OutputStreamWriter(System.out));
			
			String S = br.readLine();
			
			Stack<Character> st = new Stack<Character>();
			boolean tag = false;
			
			for(int i=0; i<S.length(); i++) {
				if(S.charAt(i) == '<') {
					while(!st.isEmpty())
						bw.write(st.pop());
					
					tag = true;
				}
				if(S.charAt(i) == '>') {
					bw.write('>');
					tag = false;
					continue;
				}
				
				if(tag == true) {
					bw.write(S.charAt(i));
				}
				
				if(tag == false) {
					if(S.charAt(i) == ' ') {
						while(!st.isEmpty())
							bw.write(st.pop());
						bw.write(' ');
					}else {
						st.push(S.charAt(i));
					}
				}
				
				if(i == S.length()-1) {
					while(!st.isEmpty()) {
						bw.write(st.pop());
					}
				}
				
			}

			bw.flush();
		}
}