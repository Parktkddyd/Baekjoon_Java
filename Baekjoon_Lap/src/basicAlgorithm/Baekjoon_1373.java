import java.util.*;
import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s = br.readLine();
		
		if(s.length() %3 == 1)
			s = "00" + s;
		else if(s.length() % 3 == 2)
			s = "0" + s;
		
		int i = 0;
		int num;
		while(i<s.length()) {
			int pow = 0;
			num = 0;
			for(int j=i+2; j>=i; j--) {
				if(s.charAt(j) == '1')
					num += (int)Math.pow(2, pow++);
				else
					pow++;
			}
			bw.write(num+"");
			 i+=3;
		}
		bw.flush();
	}
}