package kr.green.exam0315;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

public class Ex03 {
	Solution solution;

	@Before // 테스트 전에 실행할 메서드 지정
	public void before() {
		solution = new Solution();
	}

	// 테스트에 사용할 메서드 지정
	@Test
	public void test() {
		assertEquals(solution.solution(new String[] {"Jane", "Kim"}), "김서방은 1에 있다");
	}

	static class Solution {
		public String solution(String[] seoul) {
			String answer = "";
			int index = -1;
//			for(int i=0;i<seoul.length;i++) {
//				if(seoul[i].equals("Kim")) {
//					index=i;
//					break;
//				}
//			}
			// binarySearch는 2진 검색이다. 이전에 반드시 정렬이 되어 있어야 한다.
			Arrays.sort(seoul);
			index = Arrays.binarySearch(new String[] {"Jane", "Kim","Lee"}, "Kim");
			// System.out.println(Arrays.binarySearch(new String[] {"Jane","Shon" "Kim","Lee"}, "Kim"));
			answer = "김서방은 "+index+"에 있다";
			return answer;
		}
}
}
