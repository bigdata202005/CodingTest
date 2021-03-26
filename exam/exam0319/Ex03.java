package kr.green.exam0319;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

/*
문제 3] 짝수와 홀수
정수 num이 짝수일 경우 "Even"을 반환하고 홀수인 경우 "Odd"를 반환하는 함수, solution을 완성해주세요.

제한 조건
num은 int 범위의 정수입니다.
0은 짝수입니다.

입출력 예
num		return
3		"Odd"
4		"Even"
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
		assertEquals(solution.solution(3),"Odd");
		assertEquals(solution.solution(4),"Even");
		
	}

	static class Solution {
		public String solution(int num) {
			return (num%2==0) ? "Even":"Odd";
		}
	}
}
