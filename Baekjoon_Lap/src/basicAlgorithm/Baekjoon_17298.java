import java.util.*;
import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		Stack<Integer> St = new Stack<Integer>();
		String[] s = br.readLine().split(" ");
		int[] arr = new int[s.length];
		for(int i=0 ;i<s.length; i++) {
			arr[i] = Integer.parseInt(s[i]);
		}
		
		
		for(int i=0; i<arr.length; i++) {
			while(!St.isEmpty() && arr[St.peek()] < arr[i]) {
				arr[St.pop()] = arr[i];
			}
			
			St.push(i);
		}
		
		while(!St.isEmpty()) {
			arr[St.pop()] = -1;
		}
		
		for(int item : arr) {
			bw.write(item + " ");
		}
		
		bw.flush();
	}
}