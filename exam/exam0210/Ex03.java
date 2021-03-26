package kr.green.exam0210;

/*
문제 3] 각 자릿수의 합을 구할 수 있나요?
초보자 프로그래머 홍길동은 사용자가 입력한 양의정수(범위는 int)
각 자리수를 더해 출력하는 프로그램을 만들고 싶어한다. 
ex) 5923의 결과는 5+9+2+3인 19이다 
ex) 200의 결과는 2+0+0인 2이다 
ex) 6719283의 결과는 6+7+1+9+2+8+3인 36이다.
*/
public class Ex03 {
	public static void main(String[] args) {
		System.out.println(example(5923));
		System.out.println(example(200));
		System.out.println(example(6719283));
	}

	public static int example(int n) {
		int result = 0;
		while (n > 0) {
			result += n%10;
			n /= 10;
		}
		return result;
	}
}
