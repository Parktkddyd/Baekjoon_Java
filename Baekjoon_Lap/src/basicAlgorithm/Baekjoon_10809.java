import java.util.*;
import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s = br.readLine();
		char[] c = s.toCharArray();
		int[] i = new int['z'+1];
		Arrays.fill(i, -1);
		
		for(int k=0; k<c.length; k++) {
			if(i[c[k]] == -1)
            i[c[k]] = k;
		}
		
		for(int k=('a'-0); k <= ('z' - 0) ; k++) {
			bw.write(i[k] + " ");
		}
		
		bw.flush();
    }
	}