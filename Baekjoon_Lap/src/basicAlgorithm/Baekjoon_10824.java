import java.io.*;
import java.math.BigInteger;
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		String[] s = br.readLine().split(" ");
		
		BigInteger a = new BigInteger(s[0] + s[1]);
		BigInteger b = new BigInteger(s[2] + s[3]);
		
		System.out.println(a.add(b));
	}
}