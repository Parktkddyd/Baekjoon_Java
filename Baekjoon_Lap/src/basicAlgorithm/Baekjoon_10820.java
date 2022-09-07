import java.util.*;
import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] s = new String[100];
		
		for(int i=0; i<s.length; i++) {
			s[i] = br.readLine();
			int a = 0;
			int b = 0;
			int c = 0;
			int d = 0;
			
			
			if(s[i] == null)
				break;
			
			for(int j=0; j<s[i].length(); j++) {
				if(s[i].charAt(j) >= 'a' && s[i].charAt(j) <= 'z') {
					a++;
				}else if(s[i].charAt(j) >= 'A' && s[i].charAt(j) <= 'Z') {
					b++;
				}else if(s[i].charAt(j) >= '0' && s[i].charAt(j) <= '9') {
					c++;
				}else {
					d++;
				}
			}
			
			System.out.println(a + " " + b + " " + c + " " + d);
		}
	}
}