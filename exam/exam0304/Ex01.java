package kr.green.exam0304;

/*
문제 1] h-index & g-index
연구자의 연구업적을 평가할 때 사용되는 지표 중 h-index와 g-index라는 것이 있다.
h-index : 인용 횟수가 h번 이상인 논문이 h개일 때 가능한 h의 최댓값
g-index : 인용 횟수가 높은 상위 g개 논문의 인용 횟수 총합이 g²이상일 때 가능한 g의 최댓값
어떤 학자가 쓴 논문 각각의 인용 횟수가 주어질 때, h-index와 g-index를 계산하시오.

e.g.)
입력 : 0 15 4 0 7 10 0
h-index : 4
g-index : 6
*/
public class Ex01 {
	public static void main(String[] args) {
		example(new int[] { 0, 15, 4, 0, 7, 10, 0 });
	}

	public static void example(int n[]) {
		int hIndex = 0, gIndex = 0, sum = 0;
		for (int i = 0; i < n.length; i++) {
			// H index
			int cnt = 0;
			for (int j = 0; j < n.length; j++) {
				if (n[i] <= n[j])
					cnt++;
			}
			if (cnt == n[i] && hIndex <= cnt) {
				hIndex = cnt;
			}
			// G Index
			sum += n[n.length - 1 - i];
			if (i * i >= sum) {
				gIndex = i;
			}
		}
		System.out.println("H Index : " + hIndex);
		System.out.println("G Index : " + gIndex);
	}
}
