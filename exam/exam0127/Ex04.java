package kr.green.exam0127;
/*
피보나치 수열이란, 첫 번째 항의 값이 0이고 두 번째 항의 값이 1일 때, 이후의 항들은 이전의 두 항을 더한 값으로 이루어지는 수열을 말한다.
예) 1, 1, 2, 3, 5, 8, 13
인풋을 정수 n으로 받았을때, n 이하까지의 피보나치 수열을 출력하는 프로그램을 작성하세요

[ 풀이 방법 ]
1. 변수 2개를 만들어 첫번째 변수에 0 두번째 변수에 1로 초기화한다.
2. 두번째 변수를 출력한다.
3. 임시변수에 두번째 변수를 피신시킨다.
4. 두개를 더해 두번째 변수에 넣는다.
5. 첫번째 변수에 피신시킨 값을 넣는다.
6. 두번째 변수값이 n보다 클때까지 2 ~ 5를 반복한다. 
 */
public class Ex04 {
	public static void main(String[] args) {
		fibonacci_numbers(10);
		fibonacci_numbers(30);
		fibonacci_numbers(50);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
		fibonacci_numbers2(10);
		fibonacci_numbers2(30);
		fibonacci_numbers2(50);
	}
	public static void fibonacci_numbers(int n) {
		int first = 0, second = 1; 					// 1번
		while(second<n) { 							// 6번
			System.out.print( second + " "); 	// 2번
			int temp = second; 					// 3번
			second = first + second;				// 4번
			first = temp;  								// 5번
		}
		System.out.println();
	}
	// fibonacci_numbers() 문제 풀이를 보면 temp라는 변수는 왜? 사용했을까.....
	// second값이 변경되기 전의 값을 first에 넣기 위하여 피신 시킨 것이다.
	// 변하기 전 second값을 알 수 있다면 temp라는 임시 변수는 필요하지 않다. 공간 복잡도가 좋아진다.
	// 위 문제를 temp를 사용하지 않고 풀어보아라.  ---- 5분!!!!
	public static void fibonacci_numbers2(int n) {
		int first = 0, second = 1; 					// 1번
		while(second<n) { 							// 6번
			System.out.print( second + " "); 	// 2번
			second = first + second;				// 4번
			first = second - first;  					// 5번
		}
		System.out.println();
	}
}
