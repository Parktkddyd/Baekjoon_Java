package basicAlgorithm;

import java.util.*;

public class Baekjoon_10828_Array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] stacks = new int[10000];
		sc.nextLine();
		while(N-->0) {
			String[] str = sc.nextLine().split(" ");
			int number = 0;
			if(str.length > 1)
				number = Integer.parseInt(str[1]);
			switch(str[0]) {
			case "push": push(stacks, number);
			break;
			case "pop": System.out.println(pop(stacks));
			break;
			case "size":  size(stacks);
			break;
			case "empty": empty(stacks);
			break;
			case "top" : System.out.println(top(stacks));
			break;
			}
		}
		sc.close();
	}


	private static void push(int[] stacks, int number) {
		int i=(stacks.length-1);
		if(stacks[0] == 0) {
			stacks[0] = number;
		}
		while(i-- > 0) {
			if(stacks[i] != 0)
			stacks[i+1] = number;
		}
		
		
	}


	private static int pop(int[] stacks) {
		int i=(stacks.length-1);
		int p = top(stacks);
		if(p > 0) {
		while(i-- > 0) {
			if(stacks[i] == p)
			stacks[i] = 0;
		}
		}else {
			p = - 1;
		}
		return p;
	}


	private static void size(int[] stacks) {
		int a = top(stacks);
		int i = stacks.length-1;
		if(a > 0) {
			while(i-- > 0) {
				if(stacks[i] == a) {
					System.out.println(i);
					break;
				}
			}
		}else {
			System.out.println(0);
		}
		
	}


	private static void empty(int[] stacks) {
		if(stacks[0] == 0) 
			System.out.println(1);
		else
			System.out.println(0);
		
	}


	private static int top(int[] stacks) {
		int i=(stacks.length-1);
		int t=0;
		while(i-- > 0) {
			if(stacks[i] != 0) {
				t = stacks[i];
				break;
			}
		}
		if(t>0)
		return t;
		else
			return -1;
	}
}
