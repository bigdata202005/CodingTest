package kr.green.exam0319;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Before;
import org.junit.Test;

/*
문제 2] 제일 작은 수 제거하기
정수를 저장한 배열, arr 에서 가장 작은 수를 제거한 배열을 리턴하는 함수, solution을 완성해주세요. 
단, 리턴하려는 배열이 빈 배열인 경우엔 배열에 -1을 채워 리턴하세요. 
예를들어 arr이 [4,3,2,1]인 경우는 [4,3,2]를 리턴 하고, [10]면 [-1]을 리턴 합니다.

제한 조건
arr은 길이 1 이상인 배열입니다.
인덱스 i, j에 대해 i ≠ j이면 arr[i] ≠ arr[j] 입니다.

입출력 예
arr			return
[4,3,2,1]	[4,3,2]
[10]		[-1]
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
		assertArrayEquals(solution.solution(new int[] {4,3,2,1}), new int[] {4,3,2});
		assertArrayEquals(solution.solution(new int[] {10}), new int[] {-1});
		
	}
	static  class Solution {
		public int[] solution(int[] arr) {
			int[] answer;
			if(arr.length==1) {
				answer = new int[] {-1};
			}else {
				answer = new int[arr.length-1];
				int min = arr[0];
				for(int i=0;i<arr.length;i++) {
					if(min>arr[i]) {
						min = arr[i];
					}
				}
				int j=0;
				for(int i=0;i<arr.length;i++) {
					if(min==arr[i]) continue;
					answer[j] = arr[i];
					j++;
				}
			}
			//System.out.println(Arrays.toString(answer));
			return answer;
		}
	}
}
