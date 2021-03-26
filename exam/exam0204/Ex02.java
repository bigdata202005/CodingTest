package kr.green.exam0204;

/*
문제 2] Even Fibonacci numbers
피보나치 수열의 각 항은 바로 앞의 항 두 개를 더한 것이 됩니다. 
1과 2로 시작하는 경우 이 수열은 아래와 같습니다.

1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...

짝수이면서 4백만 이하인 모든 항을 더하면 얼마가 됩니까?
 */
public class Ex02 {
	public static void main(String[] args) {
		System.out.println(example());

		
	}

	public static int example() {
		int sum = 0; // 합
		int first=1, second=2;
		while(second<=400_0000) {
			if(second%2==0) sum += second;
			second += first;
			first = second - first;
		}
		return sum;
	}
}
