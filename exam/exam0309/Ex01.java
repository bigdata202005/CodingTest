package kr.green.exam0309;

import static org.junit.Assert.assertEquals;

/*
문제 1] 체육복
점심시간에 도둑이 들어, 일부 학생이 체육복을 도난당했습니다. 
다행히 여벌 체육복이 있는 학생이 이들에게 체육복을 빌려주려 합니다. 
학생들의 번호는 체격 순으로 매겨져 있어, 바로 앞번호의 학생이나 바로 뒷번호의 학생에게만 체육복을 빌려줄 수 있습니다. 
예를 들어, 4번 학생은 3번 학생이나 5번 학생에게만 체육복을 빌려줄 수 있습니다. 
체육복이 없으면 수업을 들을 수 없기 때문에 체육복을 적절히 빌려 최대한 많은 학생이 체육수업을 들어야 합니다.
전체 학생의 수 n, 체육복을 도난당한 학생들의 번호가 담긴 배열 lost, 
여벌의 체육복을 가져온 학생들의 번호가 담긴 배열 reserve가 매개변수로 주어질 때, 
체육수업을 들을 수 있는 학생의 최댓값을 return 하도록 solution 함수를 작성해주세요.

제한사항
전체 학생의 수는 2명 이상 30명 이하입니다.
체육복을 도난당한 학생의 수는 1명 이상 n명 이하이고 중복되는 번호는 없습니다.
여벌의 체육복을 가져온 학생의 수는 1명 이상 n명 이하이고 중복되는 번호는 없습니다.
여벌 체육복이 있는 학생만 다른 학생에게 체육복을 빌려줄 수 있습니다.
여벌 체육복을 가져온 학생이 체육복을 도난당했을 수 있습니다. 이때 이 학생은 체육복을 하나만 도난당했다고 가정하며, 남은 체육복이 하나이기에 다른 학생에게는 체육복을 빌려줄 수 없습니다.
입출력 예
n	lost	reserve		return
5	[2, 4]	[1, 3, 5]	5
5	[2, 4]	[3]			4
3	[3]		[1]			2

입출력 예 설명
예제 #1
1번 학생이 2번 학생에게 체육복을 빌려주고, 3번 학생이나 5번 학생이 4번 학생에게 체육복을 빌려주면 학생 
5명이 체육수업을 들을 수 있습니다.

예제 #2
3번 학생이 2번 학생이나 4번 학생에게 체육복을 빌려주면 학생 4명이 체육수업을 들을 수 있습니다.
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
		assertEquals(solution.solution(5, new int[] {2, 4}, new int[] {1, 3, 5}), 5);
		assertEquals(solution.solution(5, new int[] {2, 4}, new int[] {3}), 4);
		assertEquals(solution.solution(3, new int[] {3}, new int[] {1}), 2);
		assertEquals(solution.solution(3, new int[] {3}, new int[] {3}), 3); // ----> 처음 반복문이 없으면 여기를 통과 못함
	}

	// 문제 풀이
	static class Solution {
		public int solution(int n, int[] lost, int[] reserve) {
			int answer = n - lost.length; // 전체학생 - 잃어버린 학생수
			// 여분의 체육복을 가지고 온 학생이 잃어 버렸을 경우 처리
			for (int i = 0; i < lost.length; i++) { // 잃어버린 학생
				for (int j = 0; j < reserve.length; j++) { // 여분의 학생
					if (lost[i] == reserve[j]) { // 같은 학생이면
						lost[i] = -1;    // 표시
						reserve[j] = -1; // 표시
						answer++; // 인원 증가
						break;// 탈출!!!
					}
				}
			}
			for (int i = 0; i < lost.length; i++) { // 잃어버린 학생
				for (int j = 0; j < reserve.length; j++) { // 여분의 학생
					if (reserve[j] == -1) continue; // 이미 처리 했으면 다음
					if (lost[i] - 1 == reserve[j] || lost[i] + 1 == reserve[j]) { // 이전/이후 학생이 잃어버렸다면
						answer++; // 인원수 증가
						reserve[j] = -1; // 빌려줬다고 표시
						break; // 탈출!!!
					}
				}
			}
			return answer;
		}
	}
}
