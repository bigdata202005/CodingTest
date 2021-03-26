package kr.green.exam0322;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

/*
문제 3] 평균 구하기
정수를 담고 있는 배열 arr의 평균값을 return하는 함수, solution을 완성해보세요.

제한사항
arr은 길이 1 이상, 100 이하인 배열입니다.
arr의 원소는 -10,000 이상 10,000 이하인 정수입니다.
입출력 예
arr	return
[1,2,3,4]	2.5
[5,5]	5
 */
public class Ex03 {
	Solution solution;

	@Before // 테스트 전에 실행할 메서드 지정
	public void before() {
		solution = new Solution();
	}

	// 테스트에 사용할 메서드 지정
	@SuppressWarnings("deprecation")
	@Test
	public void test() {
		assertEquals(solution.solution(new int[] {1,2,3,4}), 2.5);
		assertEquals(solution.solution(new int[] {5,5}), 5.0);
		
	}

	static class Solution {
		public double solution(int[] arr) {
			double answer = 0;
			int sum=0;
			for(int t : arr) sum += t;
			answer = (double)sum/arr.length;
			System.out.println(answer);
			return answer;
		}
	}
}
