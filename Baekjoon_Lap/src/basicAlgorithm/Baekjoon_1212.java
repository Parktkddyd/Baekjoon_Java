import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] binary = {
				"000", "001", "010", "011",
				"100", "101", "110", "111"
				}; 
		String s = br.readLine();
		StringBuilder sb = new StringBuilder();
		
		if(s.length() == 1 && s.charAt(0) == '0') {
			sb.append("0");
		}else {
		for(int i=0; i<s.length(); i++) {
			sb.append(binary[s.charAt(i)-'0']);
		}
		while(sb.charAt(0) == '0')
			sb.deleteCharAt(0);
		}
		System.out.println(sb.toString());
	}
}