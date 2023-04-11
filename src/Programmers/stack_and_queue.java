package Programmers;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class stack_and_queue {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		String[] number = input.split(" ");
		System.out.println(Integer.parseInt(number[0]) * Integer.parseInt(number[1]));
//		System.out.println(input);
	}

}
