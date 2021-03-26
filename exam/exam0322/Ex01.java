package kr.green.exam0322;

import static org.junit.Assert.assertArrayEquals;

/*
문제 1] 최대공약수와 최소공배수

두 수를 입력받아 두 수의 최대공약수와 최소공배수를 반환하는 함수, solution을 완성해 보세요. 
배열의 맨 앞에 최대공약수, 그다음 최소공배수를 넣어 반환하면 됩니다. 
예를 들어 두 수 3, 12의 최대공약수는 3, 최소공배수는 12이므로 solution(3, 12)는 [3, 12]를 반환해야 합니다.

제한 사항
두 수는 1이상 1000000이하의 자연수입니다.
입출력 예
n	m	return
3	12	[3, 12]
2	5	[1, 10]

입출력 예 설명
입출력 예 #1
위의 설명과 같습니다.

입출력 예 #2
자연수 2와 5의 최대공약수는 1, 최소공배수는 10이므로 [1, 10]을 리턴해야 합니다.

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
		assertArrayEquals(solution.solution(3,12), new int[] {3, 12});
		assertArrayEquals(solution.solution(2,5), new int[] {1, 10});
		
	}

	static class Solution {
		  public int[] solution(int n, int m) {
		      int[] answer = new int[2];
		      answer[0] = gcd(n,m);
		      answer[1] = lcm(n,m);
		      return answer;
		  }
		  public int gcd(int a, int b) { // 최대 공약수
			  return a%b==0 ? b : gcd(b,a%b);
		  }
		  public int lcm(int a, int b) { // 최소 공배수
			  // 0이 아닌 두수의 곱/두수의 최대 공약수
			  return (a*b)/gcd(a,b);
		  }
	}
}
