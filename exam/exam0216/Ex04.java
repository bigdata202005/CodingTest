package kr.green.exam0216;

/*
문제 4] 아는 만큼 적는다
모르는 언어는 고난도, 아는 언어는 Lv.1인 문제입니다.
이 문제는 여러분이 아는 모든 코딩 언어를 활용하여 최대한 많은 코딩언어로 문제를 구현하면 됩니다.
문제 정답을 제출하는 방법은
C
printf("Hello, world!");
Python
print('Hello, world!')
이런 방식으로 적으시면 됩니다.
문제 10가지의 수가 주어집니다. 받은 수들 중에서 이 중 1번째, 4번째, 7번쨰로 입력받은 수만
출력에 나오도록 하는 프로그램을 출력하시오.
 */
public class Ex04 {
	public static void main(String[] args) {
		example(new int[] {1,2,3,4,5,6,7,8,9,10});

	}

	public static void example(int ar[]) {
		System.out.println(ar[0] + ", " + ar[3] + ", " + ar[6]);
	}
}
