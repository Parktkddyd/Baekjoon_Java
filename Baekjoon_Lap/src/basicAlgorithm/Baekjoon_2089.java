import java.util.*;
import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Stack<Integer> binary = new Stack<Integer>();
		int N = Integer.parseInt(br.readLine());
		
		if(N == 0)
			binary.push(0);
		else {
		while(N!=0) {
			if(N%-2 == -1) {
				binary.push(1);
				N=(N/-2)+1;
			}else {
				binary.push(N%-2);
				N=N/-2;
			}
		}
		}
		
		while(!binary.isEmpty())
			bw.write(binary.pop()+"");
		
		bw.flush();
	}
}