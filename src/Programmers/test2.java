package Programmers;

import java.io.*;


public class test2 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();

		int[] count = new int[3]; // 각각의 괄호 개수 저장
		
		for(int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			
			if(c == '[') {
				count[0]++;
			}else if(c == ']') {
				count[0]--;
			}else if(c == '{') {
				count[1]++;
			}else if(c == '}') {
				count[1]--;
			}else if(c == '(') {
				count[2]++;
			}else if(c == ')') {
				count[2]--;
			}
			
		}
		
		for(int i = 0; i < 3; i++) {
			if(count[i] != 0) {
				System.out.println("False");
				return;
			}
			
		}
		
		System.out.println("True");
	}

}
