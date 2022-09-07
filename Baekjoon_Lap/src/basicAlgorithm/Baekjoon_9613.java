import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		
		while(N-->0) {
			
			String[] s = br.readLine().split(" ");
			int[] arr = new int[Integer.parseInt(s[0])];
			for(int i=0; i<arr.length; i++) {
				arr[i] = Integer.parseInt(s[i+1]);
			}
			
			long result = 0;
		
			for(int i=0; i<arr.length; i++) {
				for(int j=i+1; j<arr.length; j++) {
					if(arr[i] > arr[j]) {
						result+=GCD(arr[i],arr[j]);
					}
					else
						result+=GCD(arr[j],arr[i]);
				}
			}
		
			bw.write(result + "\n");
		}
		bw.flush();
	}

	private static int GCD(int i, int j) {
		if(j==0)
			return i;
		else
			return GCD(j, i%j);
	}
}
