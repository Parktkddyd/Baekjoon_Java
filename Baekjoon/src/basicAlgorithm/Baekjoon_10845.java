package basicAlgorithm;
import java.util.*;
import java.io.*;
public class Baekjoon_10845 {
	public static int front = 0;
	public static int rear = 0;
	public static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));		
		int N = Integer.parseInt(br.readLine());
		int[] queue = new int[N];
		while(N-->0) {
			String[] command = br.readLine().split(" ");
			switch(command[0]) {
			case "push":
				push(queue, Integer.parseInt(command[1]));
				break;
			case "pop":
				pop(queue);
				break;
			case "size":
				size(queue);
				break;
			case "empty":
				empty(queue);
				break;
			case "front":
				front(queue);
				break;
			case "back":
				back(queue);
				break;
			default:
				break;
		}
		}
		System.out.println(sb.toString());
	}

	private static void back(int[] queue) {
		if(rear == 0) {
			sb.append(-1 + "\n");
		}else {
		if(queue[(rear-1)] != 0)
			sb.append(queue[rear-1] + "\n");
		else
			sb.append(-1 + "\n");
		}
		
	}

	private static void front(int[] queue) {
		if(queue[(front)] != 0)
			sb.append(queue[front] + "\n");
		else
			sb.append(-1 + "\n");
		
	}

	private static void empty(int[] queue) {
		if(rear == front)
			sb.append(1 + "\n");
		else
			sb.append(0 + "\n");
	}

	private static void size(int[] queue) {
		if(rear == front)
			sb.append(0 + "\n");
		else
			sb.append((rear-front) + "\n");
	}

	private static void pop(int[] queue) {
		if(queue[front] != 0) {
			sb.append(queue[front] + "\n");
			queue[front] = 0;
			front++;
		}else {
			sb.append(-1 + "\n");
		}
		
	}

	private static void push(int[] queue, int a) {
		queue[rear++] = a;
	}

}
