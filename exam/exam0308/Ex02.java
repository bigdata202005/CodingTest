package kr.green.exam0308;

import static org.junit.Assert.assertArrayEquals;

/*
문제 2] 모의고사
수포자는 수학을 포기한 사람의 준말입니다. 수포자 삼인방은 모의고사에 수학 문제를 전부 찍으려 합니다. 
수포자는 1번 문제부터 마지막 문제까지 다음과 같이 찍습니다.
1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...
1번 문제부터 마지막 문제까지의 정답이 순서대로 들은 배열 answers가 주어졌을 때, 
가장 많은 문제를 맞힌 사람이 누구인지 배열에 담아 return 하도록 solution 함수를 작성해주세요.

제한 조건
시험은 최대 10,000 문제로 구성되어있습니다.
문제의 정답은 1, 2, 3, 4, 5중 하나입니다.
가장 높은 점수를 받은 사람이 여럿일 경우, return하는 값을 오름차순 정렬해주세요.

입출력 예
answers			return
[1,2,3,4,5]		[1]
[1,3,2,4,2]		[1,2,3]

입출력 예 설명

입출력 예 #1
수포자 1은 모든 문제를 맞혔습니다.
수포자 2는 모든 문제를 틀렸습니다.
수포자 3은 모든 문제를 틀렸습니다.
따라서 가장 문제를 많이 맞힌 사람은 수포자 1입니다.

입출력 예 #2
모든 사람이 2문제씩을 맞췄습니다.
*/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class Ex02 {
	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(Arrays.toString(solution.solution(new int[] { 1, 2, 3, 4, 5 })));
		System.out.println(Arrays.toString(solution.solution(new int[] { 1, 3, 2, 4, 2 })));
	}

	Solution solution;

	@Before // 테스트 전에 실행할 메서드 지정
	public void before() {
		solution = new Solution();
	}

	// 테스트에 사용할 메서드 지정
	@Test
	public void test() {
		assertArrayEquals(solution.solution(new int[] { 1, 2, 3, 4, 5 }), new int[] { 1 });
		assertArrayEquals(solution.solution(new int[] { 1, 3, 2, 4, 2 }), new int[] { 1, 2, 3 });
	}

	static class Solution {
		public int[] solution(int[] answers) {
			// 찍는순서를 배열에
			int[] supoja1 = { 1, 2, 3, 4, 5 };
			int[] supoja2 = { 2, 1, 2, 3, 2, 4, 2, 5 };
			int[] supoja3 = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };

			// 3명의 점수를 저장할 리스트
			List<Integer> list = new ArrayList<Integer>();
			for (int i = 0; i < 3; i++)	list.add(0);

			// 점수 계산 : i % 5,  i % 8, i % 10 ===> 찍는 개수만큼 문제수 만큼 반복되어야 한다.
			for (int i = 0; i < answers.length; i++) {
				if (answers[i] == supoja1[i % 5]) list.set(0, list.get(0) + 1);
				if (answers[i] == supoja2[i % 8]) list.set(1, list.get(1) + 1);
				if (answers[i] == supoja3[i % 10]) list.set(2, list.get(2) + 1);
			}
			// 점수의 최대값 구하기
			int max = Collections.max(list);
			// 최고 점수를 받은 사람들의 목록을 저장할 리스트
			List<Integer> returnList = new ArrayList<Integer>();
			for (int i = 0; i < list.size(); i++)
				if (max == list.get(i)) // 최대값과 같은 사람의 번호를 저장
					returnList.add(i + 1);

			// 리스트를 다시 배열로 변경
			int[] answer = new int[returnList.size()];
			for (int i = 0; i < returnList.size(); i++)
				answer[i] = returnList.get(i);
			// System.out.println(Arrays.toString(answer));
			return answer;
		}
	}
}
