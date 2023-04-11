package Programmers;

import java.util.*;

public class test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt(); // 당첨시킬 응모권 수
		sc.nextLine();
		String ticket = sc.nextLine(); // 티켓 번호 입력
		String[] numbers = ticket.split(" "); // 티켓 번호 배열에 저장(String)
		int[] numArr = new int[numbers.length]; // int로 변환
		
		for(int i = 0; i < numbers.length; i++) {
			numArr[i] = Integer.parseInt(numbers[i]);
		}
		
		Set<Integer> set = new HashSet<>();
		
		for(int i = 0; i < numArr.length; i++) {
			if(!set.contains(numArr[i])) {
				set.add(numArr[i]);
			}else {
				set.remove(numArr[i]);
			}
		}
		
		
		Set<Integer> set2 = new HashSet<>();

		if(set.size() < number) {
			for(int i = 0; i < numArr.length; i++) {
				set2.add(numArr[i]);
			}
			
			for(int num : set2) System.out.print(num + " ");
			
		}else {
			for(int num : set) System.out.print(num + " ");
		}
//		List<Integer> list = new ArrayList<>(set);
//		Collections.sort(list);
//
//		if(number < set.size()) {
//			
//		}
		
		
	}

}
