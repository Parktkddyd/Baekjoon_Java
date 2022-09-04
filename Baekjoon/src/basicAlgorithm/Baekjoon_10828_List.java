package basicAlgorithm;

import java.util.*;
import java.io.*;
public class Baekjoon_10828_List {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		ArrayList<Integer> stacks = new ArrayList<Integer>();
		while(N-->0) {
			String[] str = br.readLine().split(" ");
			int number = 0;
			if(str.length > 1)
				number = Integer.parseInt(str[1]);
			switch(str[0]) {
			case "push": push(stacks, number);
			break;
			case "pop": bw.write(pop(stacks) + "\n");
			break;
			case "size":  bw.write(size(stacks) + "\n");
			break;
			case "empty": bw.write(empty(stacks) + "\n");
			break;
			case "top" : bw.write(top(stacks) + "\n");
			break;
			}
		}
		bw.flush();
	}

	private static int top(ArrayList<Integer> stacks) {
		int top = -1;
		if(stacks.size() != 0) {
			top = stacks.get(stacks.size()-1);
		}
		return top;
	}

	private static int empty(ArrayList<Integer> stacks) {
		int e = 0;
		if(stacks.size() == 0)
			e = 1;
		return e;
		
	}

	private static int size(ArrayList<Integer> stacks) {
		int s = 0;
		if(stacks.size() != 0)
			s = stacks.size();
		return s;
	}

	private static int pop(ArrayList<Integer> stacks) {
		int p = top(stacks);
		if(stacks.size() == 0)
			p = -1;
		else {
			stacks.remove(stacks.size()-1);
		}
		return p;
		
		
	}

	private static void push(ArrayList<Integer> stacks, int number) {
		if(number>0)
		stacks.add(number);
	}

}
