package basicAlgorithm;

import java.util.*;
import java.io.*;
public class Baekjoon_1406 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String s = br.readLine();
		int N = Integer.parseInt(br.readLine());
		Stack<Character> leftSt = new Stack<Character>();
		Stack<Character> RightSt = new Stack<Character>();
		
		for(int i=0; i<s.length(); i++) {
			leftSt.push(s.charAt(i));
		}
		while(N-- >0) {
			String e = br.readLine();
			if(e.charAt(0) == 'B') {
				if(!leftSt.empty())
					leftSt.pop();
			}
			//삭제
			if(e.charAt(0) == 'L') {
				 if(!leftSt.empty())
					 RightSt.push(leftSt.pop());
			}
			//왼쪽 이동
			
			if(e.charAt(0) == 'D') {
				if(!RightSt.empty())
					leftSt.push(RightSt.pop());
			}
			//오른쪽 이동
			
			if(e.charAt(0) == 'P') {
				leftSt.push(e.charAt(2));
			}
			//삽입
			
		}
		
		while(!leftSt.empty()) {
			RightSt.push(leftSt.pop());
		}
		while(!RightSt.empty()) {
			bw.write(RightSt.pop());
		}
		
		bw.flush();
	}
}
