package kr.green.exam0225;

/*
문제 1] Largest prime factor
출처 : http://projecteuler.net/problem=3, 한국어 사이트
프로젝트 오일러 3번째 문제
어떤 수를 소수의 곱으로만 나타내는 것을 소인수분해라 하고, 이 소수들을 그 수의 소인수라고 한다.
예를 들면 13195의 소인수는 5, 7, 13, 29 이다.
600851475143의 소인수 중에서 가장 큰 수를 구하시오.
*/
public class Ex01 {
	public static void main(String[] args) {
		example(600851475143L);
	}

	public static void example(long n) {
		int cnt = 2;
		while (cnt < n) {
			if (n % cnt == 0) {
				System.out.print(cnt + " ");
				example(n / cnt);
				return;
			}
			cnt++;
		}
		System.out.println(n);
	}
}
