package kr.green.exam0205;
/*
문제 5] 1부터 20 사이의 어떤 수로도 나누어 떨어지는 가장 작은 수
		1부터 10까지의 어떤 수로도 나누어 떨어지는 가장 작은 수는 2520입니다.
		그렇다면 1부터 20까지의 어떤 수로도 나누어 떨어지는 가장 작은 수는 얼마입니까?
 */
public class Ex05 {
	public static void main(String[] args) {
		System.out.println(example(10));
		System.out.println(example(20));
	}
	
	public static int example(int n) {
		int result = 1; // 증가 변수
		boolean flag = true;
		do {
			flag = true; // 모두의 배수라고 가정한다.
			for(int i=1;i<=n;i++) {
				if(result%i != 0) { // 배수가 아니면 
					flag = false; // 거짓이다
					break;  // 하나라도 배수가 아니면 다음 숫자로 넘어간다. 
				}
			}
			result++; // 숫자 증가
		}while(!flag); // flag값이 참이라면 모두의 배수이다. 탈출!!!
		return --result; // 위에서 result값이 증가 했으므로 -1해야 한다.
	}
}
