package kr.green.exam0324;

import static org.junit.Assert.assertEquals;

/*
문제 1] 소수 만들기
주어진 숫자 중 3개의 수를 더했을 때 소수가 되는 경우의 개수를 구하려고 합니다. 
숫자들이 들어있는 배열 nums가 매개변수로 주어질 때, nums에 있는 숫자들 중 서로 다른 3개를 골라 더했을 때 
소수가 되는 경우의 개수를 return 하도록 solution 함수를 완성해주세요.

제한사항
nums에 들어있는 숫자의 개수는 3개 이상 50개 이하입니다.
nums의 각 원소는 1 이상 1,000 이하의 자연수이며, 중복된 숫자가 들어있지 않습니다.
입출력 예
nums			result
[1,2,3,4]		1
[1,2,7,6,4]		4

입출력 예 설명
입출력 예 #1
[1,2,4]를 이용해서 7을 만들 수 있습니다.

입출력 예 #2
[1,2,4]를 이용해서 7을 만들 수 있습니다.
[1,4,6]을 이용해서 11을 만들 수 있습니다.
[2,4,7]을 이용해서 13을 만들 수 있습니다.
[4,6,7]을 이용해서 17을 만들 수 있습니다.
*/
import org.junit.Before;
import org.junit.Test;

public class Ex01 {
	Solution solution;

	@Before // 테스트 전에 실행할 메서드 지정
	public void before() {
		solution = new Solution();
	}

	// 테스트에 사용할 메서드 지정
	@Test
	public void test() {
		assertEquals(solution.solution(new int[] {1,2,3,4}), 1);
		assertEquals(solution.solution(new int[] {1,2,7,6,4}), 4);
	}

	static class Solution {
		// 소수 판단
	    public boolean isPrime(int n) {
	        for (int i = 2; i*i <= n; i++) {
	            if (n % i == 0) return false;
	        }
	        return true;
	    }

	    public int solution(int[] nums) {
	        int answer = 0;

	        // 세 수의 합 구하기
	        for (int i = 0; i < nums.length; i++) {
	            for (int j = i+1; j < nums.length; j++) {
	                for (int k = j+1; k < nums.length; k++) {
	                	//System.out.println(nums[i] + ", " + nums[j] + ", " + nums[k]);
	                    int sum = nums[i] + nums[j] + nums[k]; // 합
	                    if (isPrime(sum)) answer++; // 소수이면 개수 증가
	                }
	            }
	        }
	        return answer;
	    }
	}
}
