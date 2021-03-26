package kr.green.exam0202;

/*
문제 2] Printing OXs
앞의 문제들 중 비슷한 알고리즘이 있던 것 같지만, 같은 건 없다고 생각해서 올립니다. 
문제를 푸는데 많은 approach가 있을 듯 싶습니다. 
이 문제의 핵심은 비트 연산을 얼마나 잘 이해하고 있냐이기 때문에 비트 연산으로 
풀어주세요. 
input은 int n을 입력 받아 
첫번째 row는 (n-1)의 O와 X, 
두번째 row는 (n-2)의 O와 XX, 
세번째 row는 (n-3)의 0와 XXX... n번째 row는 n의 X을 출력하시오.

입력 예시: 6
출력 예시:
OOOOOX
OOOOXX
OOOXXX
OOXXXX
OXXXXX
XXXXXX
 */
public class Ex02 {
	public static void main(String[] args) {
		example(6);
		System.out.println();
		example(3);
		System.out.println();
		example(10);
	}

	public static void example(int row) {
		int n = 1;
		for (int i = 0; i < row; i++) {
			String t = Integer.toBinaryString(n);
			// System.out.println("이진수 : " + n + " : " + t);
			for (int j = 0; j < row; j++) {
				System.out.print((j < row - t.length()) ? "O" : "X");
			}
			// n을 1 11 111 1111 1111로 변경
			n <<= 1;
			n = n | 1;
			System.out.println();
		}
	}
}
