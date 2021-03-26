package kr.green.exam0316;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
/*
문제 3] 수박수박수박수박수박수?
길이가 n이고, "수박수박수박수...."와 같은 패턴을 유지하는 문자열을 리턴하는 함수, solution을 완성하세요. 
예를들어 n이 4이면 "수박수박"을 리턴하고 3이라면 "수박수"를 리턴하면 됩니다.

제한 조건
n은 길이 10,000이하인 자연수입니다.

입출력 예
n			return
3			"수박수"
4			"수박수박"
 */
public class Ex03 {
	Solution solution;

	@Before // 테스트 전에 실행할 메서드 지정
	public void before() {
		solution = new Solution();
	}

	// 테스트에 사용할 메서드 지정
	@Test
	public void test() {
		assertEquals(solution.solution(3), "수박수");
		assertEquals(solution.solution(4), "수박수박");
	}

	static class Solution {
		public String solution(int n) {
			StringBuffer answer = new StringBuffer();
			String temp = "수박";
			
			for(int i=0;i<n;i++) 
				answer.append(temp.charAt(i%2));
			
			return answer.toString();
		}
	}
}
