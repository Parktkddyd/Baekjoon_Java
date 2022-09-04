package basicAlgorithm;

import java.util.*;
public class Baekjoon_1874 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int N = sc.nextInt();
		int[] arr = new int[N];
		Stack<Integer> st = new Stack<Integer>();
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		//첫번째 원소 추가
		
		int i = 1; // 두번째 원소
		int k = 0; // 배열 컨트롤 인덱스
		while(k<N) {
			if(st.size() > 0) {
			if(st.peek() < arr[k]) {
				st.push(i++);
				sb.append("+" + "\n");
			}
			else if(st.peek() == arr[k]) {
				st.pop();
				k++;
				sb.append("-" + "\n");
			}else {
				break;
			}
			}else {
				st.push(i++);
				sb.append("+" + "\n");
			}
			
			
		}		
		if(st.size() != 0) {
			System.out.println("NO");
		}else {
			System.out.println(sb.toString());
		}
	}
}
