package basicAlgorithm;

import java.util.*;
import java.io.*;

public class Baekjoon_9012 {
		public static void main(String[] args) throws IOException{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			int T = Integer.parseInt(br.readLine());
			Stack<Character> stack = new Stack<Character>();
			
			while(T-->0) {
				stack.clear();
				String s = br.readLine();
				int count = 0;
				for(int i=0; i<s.length(); i++) {
					if(s.charAt(i) == '(') {
						stack.push('(');
					}
					else if(s.charAt(i) ==')') {
						if(stack.size() != 0) {
							stack.pop();
						}else {
							count--;
						}
					}
				}
				if(count == 0 && stack.size() == 0) 
					System.out.println("YES");
				else
					System.out.println("NO");
			}
			}
}
