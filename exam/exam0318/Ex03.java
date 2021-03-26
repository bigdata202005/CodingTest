package kr.green.exam0318;

import static org.junit.Assert.assertArrayEquals;
import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

/*
문제 3] 자연수 뒤집어 배열로 만들기
자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.

제한 조건
n은 10,000,000,000이하인 자연수입니다.
입출력 예
n		return
12345	[5,4,3,2,1]
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
		assertArrayEquals(solution.solution(12345), new int[] { 5,4,3,2,1 });
		assertArrayEquals(solution.solution2(12345), new int[] { 5,4,3,2,1 });
	}

	static class Solution {
		public int[] solution(long n) {
			int[] answer = new int[(n+"").length()]; // 숫자를 문자로 변환해서 길이만큼 배열 선언
			StringBuffer sb = new StringBuffer(n+""); // 스트링버퍼로 뒤집기
			sb.reverse(); // 뒤집기
			char[] chars = sb.toString().toCharArray(); // 문자 배열
			for(int i=0;i<chars.length;i++) { // 정수배열에 숫자로 변환해서 대입
				answer[i] = chars[i]-'0';
			}
			System.out.println(Arrays.toString(answer));
			return answer;
		}
		public int[] solution2(long n) {
			int[] answer = new int[(n+"").length()]; ; // 숫자를 문자로 변환해서 길이만큼 배열 선언
			int i= 0;
			while(n>0) {
				answer[i++] = (int) (n%10); // 뒤에서 1자리 잘라서 배열의 앞에 넣고
				n/=10; // 1잘리 지우기
			}
			System.out.println(Arrays.toString(answer));
			return answer;
		}
	}
}
