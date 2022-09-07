import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String s = br.readLine();
		String[] sArr = new String[s.length()];

		for(int i=0; i<s.length(); i++)
			sArr[i] = s.substring(i,s.length());
		
		Arrays.sort(sArr);
		
		for(String item : sArr)
			bw.write(item + "\n");
		
		bw.flush();
	}
}