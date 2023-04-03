package Programmers;

import java.util.HashMap;
import java.util.Map;

public class hash {

	public static void main(String[] args) {
		
		// 1. 완주하지 못한 선수
		
		String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
		String[] completion = {"josipa", "filipa", "marina", "nikola"};
		String answer = "";
		Map<String, Integer> hm = new HashMap<>();
		
		for(String p : participant) {
			hm.put(p, hm.getOrDefault(p, 0) + 1); 
			
		}
		
		for(String c : completion) {
			hm.put(c, hm.get(c) -1);
		}

		for(String key : hm.keySet()) {
			if(hm.get(key) == 1) {
				answer = key;
				break;
			}
		}
		
		System.out.println("1번 정답 : " + answer);
		
		// 2. 폰켓몬
		
		int[] nums = {3,1,2,3};
		int answer2 = 0;
		Map<Integer, Integer> m = new HashMap<>();
		
		for(int num : nums) m.put(num, 1);

		if(m.size() >= nums.length / 2) {
			answer2 = nums.length / 2;
		}else {
			answer2 = m.size();
		}
		
		System.out.println(answer2);
		// 저장할 value가 없기 때문에 HashMap을 쓸 게 아니라 HashSet을 써야 했음,,, 
		// 이 코드는 쓸데없는 게 너무 많네,,,
	
	}

}
