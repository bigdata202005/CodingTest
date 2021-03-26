package kr.green.exam0317;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
/*
문제 4] 약수의 합
정수 n을 입력받아 n의 약수를 모두 더한 값을 리턴하는 함수, solution을 완성해주세요.

제한 사항
n은 0 이상 3000이하인 정수입니다.

입출력 예
n		return
12		28
5		6

입출력 예 설명

입출력 예 #1
12의 약수는 1, 2, 3, 4, 6, 12입니다. 이를 모두 더하면 28입니다.

입출력 예 #2
5의 약수는 1, 5입니다. 이를 모두 더하면 6입니다.

*/
public class Ex04 {
	Solution solution;

	@Before // 테스트 전에 실행할 메서드 지정
	public void before() {
		solution = new Solution();
	}

	// 테스트에 사용할 메서드 지정
	@Test
	public void test() {
		assertEquals(solution.solution(12), 28);
		assertEquals(solution.solution(5), 6);
	}

	static class Solution {
		public int solution(int n) {
			int answer = 0;
			for(int i=1;i<=n;i++) {
				if(n%i==0) answer += i;
			}
			System.out.println(answer);
			return answer;
		}
	}
}
