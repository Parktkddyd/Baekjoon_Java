import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		Stack<Integer> St = new Stack<Integer>();
		String[] s = br.readLine().split(" ");
		int[] value = new int[s.length];
		
		for(int i=0; i<s.length; i++){
			value[i] = Integer.parseInt(s[i]);
		}
		
		int[] count = new int[(Arrays.stream(value).max().getAsInt() + 1)];
		
		for(int i=0 ; i<value.length; i++) {
			count[value[i]]++;
		}
			
		for(int i=0; i<value.length; i++) {
			while(!St.isEmpty() && count[value[St.peek()]] < count[value[i]]) {
				value[St.pop()] = value[i];
			}
			St.push(i);
		}
		
		while(!St.isEmpty()) {
			value[St.pop()] = -1;
		}
		
		for(int item : value) {
			bw.write(item + " ");
		}
		
		bw.flush();
	}
}