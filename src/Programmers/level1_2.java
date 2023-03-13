package Programmers;

import java.util.ArrayList;

public class level1_2 {

	public static void main(String[] args) {
		
		// 문자열 내 p와 y의 개수
		
		String s = "stre";
		boolean answer = true;
		String[] sArr = s.split("");
		int countP = 0, countY=0;
		for(int i = 0; i < sArr.length; i++) {

			if(sArr[i].equals("P") || sArr[i].equals("p")) {
				countP++;
			}else if(sArr[i].equals("Y") || sArr[i].equals("y")) {
				countY++;
			}
		}
		
		if(countP != countY) {
			answer = false;
		}
		
		System.out.println(answer);
	}

}
