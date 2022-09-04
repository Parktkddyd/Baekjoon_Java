package basicAlgorithm;
import java.io.*;
public class Baekjoon_9093 {
public static void main(String[] args) throws IOException{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	int T = Integer.parseInt(br.readLine());
	while(T-->0) {
		String[] s = br.readLine().split(" ");
		for(int i=0; i<s.length; i++) {
			char[] arr = s[i].toCharArray();
			char temp;
		for(int j=0; j<s[i].length()/2; j++) {
			temp = arr[j];
			arr[j] = arr[(arr.length-1)-j];
			arr[(arr.length-1)-j] = temp;
			}
		bw.write(String.valueOf(arr) + " ");
		}
		bw.write("\n");
	}
	
	bw.flush();
}
}
