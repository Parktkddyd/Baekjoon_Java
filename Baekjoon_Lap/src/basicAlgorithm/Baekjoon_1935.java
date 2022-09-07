import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());		
		double[] arr = new double[100];
		Stack<Double> st = new Stack<Double>();
		String S = br.readLine(); // 계산식 받고
		
		int idx = 65;
		
		for(int i=0; i<N; i++) {
			arr[idx++] = Double.parseDouble(br.readLine());
		}
		double opr1, opr2;
		for(int i=0; i<S.length(); i++) {
			if(S.charAt(i) >= 'A' && S.charAt(i) <= 'Z') {
				st.push(arr[(S.charAt(i)-0)]);
			}else {
				if(S.charAt(i) == '+') {
					opr2 = st.pop();
					opr1 = st.pop();
					st.push(opr1 + opr2);
				}
				
				if(S.charAt(i) == '-') {
					opr2 = st.pop();
					opr1 = st.pop();
					st.push(opr1 - opr2);
				}
				
				if(S.charAt(i) == '*') {
					opr2 = st.pop();
					opr1 = st.pop();
					st.push(opr1 * opr2);
				}
				
				if(S.charAt(i) == '/') {
					opr2 = st.pop();
					opr1 = st.pop();
					st.push(opr1 / opr2);
				}
			}
		}
		System.out.printf("%.2f", st.pop());
	}
}
