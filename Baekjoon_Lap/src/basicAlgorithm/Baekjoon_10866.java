package basicAlgorithm;
import java.util.*;
import java.io.*;
public class Main {
	public static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Integer> front_q = new Stack<Integer>();
		Stack<Integer> back_q = new Stack<Integer>();
		int N = Integer.parseInt(br.readLine());
		
		while(N-- >0) {
			String[] command = br.readLine().split(" ");
			
			switch(command[0]) {
			case "push_front":push_front(front_q, Integer.parseInt(command[1])); break;
			case "push_back": push_back(back_q, Integer.parseInt(command[1])); break;
			case "pop_front": pop_front(front_q,back_q); break;
			case "pop_back": pop_back(back_q, front_q); break;
			case "size": size(front_q, back_q); break;
			case "empty": empty(front_q, back_q); break;
			case "front" : front(front_q,back_q); break;
			case "back" : back(back_q,front_q); break;
			default: break;
			}
		}
		
		System.out.println(sb.toString());
		
	}

	private static void back(Stack<Integer> back_q, Stack<Integer> front_q) {
		if(!back_q.isEmpty()) {
			sb.append(back_q.peek() + "\n");
		}else if(back_q.isEmpty() && !front_q.isEmpty()){
			while(front_q.size() > 1) {
				back_q.add(front_q.pop());
			}
			sb.append(front_q.peek() + "\n");
			while(!back_q.isEmpty()) {
				front_q.add(back_q.pop());
			}
		}else if(back_q.isEmpty() && front_q.isEmpty()){
			sb.append(-1 + "\n");
		}
		
	}

	private static void front(Stack<Integer> front_q, Stack<Integer> back_q) {
		if(!front_q.isEmpty()) {
			sb.append(front_q.peek() + "\n");
		}else if(front_q.isEmpty() && !back_q.isEmpty()){
			while(back_q.size() > 1) {
				front_q.add(back_q.pop());
			}
			sb.append(back_q.peek() + "\n");
			while(!front_q.isEmpty()) {
				back_q.add(front_q.pop());
			}
		}else if(back_q.isEmpty() && front_q.isEmpty()){
			sb.append(-1 + "\n");
		}
		
	}

	private static void empty(Stack<Integer> front_q, Stack<Integer> back_q) {
		int size = front_q.size() + back_q.size();
		if(size == 0)
			sb.append(1 + "\n");
		else
			sb.append(0 + "\n");
	}

	private static void size(Stack<Integer> front_q, Stack<Integer> back_q) {
		int size = front_q.size() + back_q.size();
			sb.append(size + "\n");
	}

	private static void pop_back(Stack<Integer> back_q, Stack<Integer> front_q) {
		if(!back_q.isEmpty()) {
			sb.append(back_q.pop() + "\n");
		}else if(back_q.isEmpty() && !front_q.isEmpty()){
			while(front_q.size() > 1) {
				back_q.add(front_q.pop());
			}			
			sb.append(front_q.pop() + "\n");
			while(!back_q.isEmpty()) {
				front_q.add(back_q.pop());
			}
		}else if(back_q.isEmpty() && front_q.isEmpty()) {
			sb.append(-1 + "\n");
		}
		
	}

	private static void pop_front(Stack<Integer> front_q, Stack<Integer> back_q) {
		if(!front_q.isEmpty()) {
			sb.append(front_q.pop() + "\n");
		}else if(front_q.isEmpty() && !back_q.isEmpty()){
			while(back_q.size() > 1) {
				front_q.add(back_q.pop());
			}
			sb.append(back_q.pop() + "\n");
			while(!front_q.isEmpty()) {
				back_q.add(front_q.pop());
			}
			
		}else if(back_q.isEmpty() && front_q.isEmpty()){
			sb.append(-1 + "\n");
		}
		
	}

	private static void push_back(Stack<Integer> back_q, int parseInt) {
		back_q.add(parseInt);
		
	}

	private static void push_front(Stack<Integer> front_q, int parseInt) {
		front_q.add(parseInt);
		
	}

}