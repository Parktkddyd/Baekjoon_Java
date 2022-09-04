package basicAlgorithm;

import java.util.*;
import java.io.*;

public class Baekjoon_2745 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Character> st = new Stack<Character>();
		String[] s = br.readLine().split(" ");
		
		int B = Integer.parseInt(s[1]); // BÁø¹ý
		
		for(int i=0; i<s[0].length(); i++) {
			st.push(s[0].charAt(i));
		}
		
		int pow=0;
		int res=0;
		if(s[0].charAt(0) == '0') {
			System.out.println(0);
		}else {
		while(!st.isEmpty()) {
			if(B<10) {
				res += (st.pop()-'0')*Math.pow(B, pow);
				pow++;
			}else {
				if(st.peek() <= '9') {
					res += (st.pop()-'0')*Math.pow(B, pow);
					pow++;
				}else {
					res += (st.pop()-55)*Math.pow(B, pow);
					pow++;
				}
			}
		}
		System.out.println(res);
		}
	}
}
