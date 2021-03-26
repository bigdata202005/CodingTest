package kr.green.exam0203;

/*
문제 2] 10~1000까지 각 숫자 분해하여 곱하기의 전체 합 구하기
예로, 10~15까지의 각 숫자 분해하여 곱하기의 전체 합은 다음과 같다.

10 = 1 * 0 = 0
11 = 1 * 1 = 1
12 = 1 * 2 = 2
13 = 1 * 3 = 3
14 = 1 * 4 = 4
15 = 1 * 5 = 5

그러므로, 이 경우의 답은 0+1+2+3+4+5 = 15

// 반복될때마다 10으로 마누면 1자리씩 줄어든다. .... 결국에 0이된다.
1234/10
123/10
12/10
1/10
0
 */
public class Ex02 {
	public static void main(String[] args) {
		System.out.println(example(10,15));
		System.out.println();
		System.out.println(example(10,1000));
		
	}

	public static int example(int n, int m) {
		int sum = 0; // 합
		for(int i=n;i<=m;i++) {
			int t = i;
			int mul = 1; // 곱
			while(t>0) {
				mul *= t%10; // 뒷자리 1자리 잘라서 곱하기
				t /= 10; // 뒷자리 버리기
			}
			sum += mul; // 곱을 누적
		}
		return sum;
	}
}
