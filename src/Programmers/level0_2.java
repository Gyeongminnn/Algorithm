package Programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class level0_2 {

	public static void main(String[] args) {
		// 1. 카운트 업
		int start = 3;
		int end = 10;
		List list = new ArrayList<>();
		
		for(int i = start; i <=end; i++) {
			list.add(i);
		}
		System.out.println(list);
	}

}
