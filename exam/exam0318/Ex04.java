package kr.green.exam0318;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collections;

import org.junit.Before;
import org.junit.Test;
/*
문제 4] 정수 내림차순으로 배치하기
함수 solution은 정수 n을 매개변수로 입력받습니다. 
n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요. 
예를들어 n이 118372면 873211을 리턴하면 됩니다.

제한 조건
n은 1이상 8000000000 이하인 자연수입니다.

입출력 예
n		return
118372	873211
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
		assertEquals(solution.solution(118372), 873211);
	}

	static class Solution {
		public long solution(long n) {
            String[] ar = (n+"").split(""); // 문자열 배열
			Arrays.sort(ar, Collections.reverseOrder()); // 내림차순정렬
			return Long.parseLong(String.join("", ar)); // 배열을 합쳐 정수로 바꾸기;
		}
	}
}
