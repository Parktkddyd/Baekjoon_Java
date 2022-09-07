import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String s = br.readLine();
		
		for(int i=0; i<s.length(); i++) {
			if((s.charAt(i) >= '0' && s.charAt(i)<='9') || s.charAt(i) == ' '){
				bw.write(s.charAt(i));
			}else {
			    if(s.charAt(i) >= 'A' && s.charAt(i) <='Z') 
					bw.write((char)((s.charAt(i)-'A' + 13)%26 + 'A'));
				
				if(s.charAt(i) >= 'a' && s.charAt(i) <='z')
					bw.write((char)((s.charAt(i)-'a' + 13)%26 + 'a'));
            }
		}
		
		bw.flush();
	}
}