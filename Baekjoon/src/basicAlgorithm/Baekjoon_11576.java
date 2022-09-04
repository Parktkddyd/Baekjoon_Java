package basicAlgorithm;

import java.util.*;
import java.io.*;
public class Baekjoon_11576 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Stack<Integer> st = new Stack<Integer>();
		String[] s1 = br.readLine().split(" ");
		int m = Integer.parseInt(br.readLine());
		String[] s2 = br.readLine().split(" ");
		int[] arr = new int[s2.length];
		
		int A = Integer.parseInt(s1[0]); // �̷����� ����
		int B = Integer.parseInt(s1[1]); // ���̼����� ����
		
		for(int i=0; i<s2.length; i++) {
			arr[i] = Integer.parseInt(s2[i]);
		} // ���ڿ��� ���� ���ڵ� ���� ������ ��ȯ
		
		int pow=(m-1); // ����-1 = ������ ��ġ
		int res=0; // 10������ ��ȯ�� ��
		
		for(int i=0; i<arr.length; i++)
			res+=(arr[i]*Math.pow(A, pow--)); // A���� 10���� ��ȯ
		
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
