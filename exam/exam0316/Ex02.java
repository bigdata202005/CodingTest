package kr.green.exam0316;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/*
문제 2] 소수 찾기
1부터 입력받은 숫자 n 사이에 있는 소수의 개수를 반환하는 함수, solution을 만들어 보세요.
소수는 1과 자기 자신으로만 나누어지는 수를 의미합니다.
(1은 소수가 아닙니다.)

제한 조건
n은 2이상 1000000이하의 자연수입니다.

입출력 예
n		result
10		4
5		3

입출력 예 설명
입출력 예 #1 : 1부터 10 사이의 소수는 [2,3,5,7] 4개가 존재하므로 4를 반환

입출력 예 #2 : 1부터 5 사이의 소수는 [2,3,5] 3개가 존재하므로 3를 반환
*/
public class Ex02 {
	Solution solution;

	@Before // 테스트 전에 실행할 메서드 지정
	public void before() {
		solution = new Solution();
	}

	// 테스트에 사용할 메서드 지정
	@Test
	public void test() {
		assertEquals(solution.solution(10), 4);
		assertEquals(solution.solution(5), 3);
	}
	static class Solution {
		// 에라토스테네스의 체 알고리즘
		public int solution(int n) {
            int answer = 0;
			int ar[] = new int[n+1]; // 크기보다 1 크게 배열 선언
			for(int i=2;i<ar.length;i++) {
				// 이미 체크된 수의 배수들은 합성수
				if(ar[i]==1) continue;
				//i를 제외한 i의 배수들을 1로 체크
				for(int j=i+i;j<ar.length;j+=i)	ar[j] = 1; 
			}
			for(int i=2;i<ar.length;i++) {
				if(ar[i]!=1) { // 1이아닌(배수가 아닌) 갯수
					answer++;
					//System.out.printf("%4d", i);
				}
			}
			//System.out.println();
			return answer;
		}
	}
}
