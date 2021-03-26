package kr.green.exam0226;

/*
문제 3] 뒤쪽 0의 갯수 구하기
N!의 정의는 다음과 같습니다.
N! = 1 * 2 * 3 * 4 ... N
이때 N!를 정수로 변환 해 뒤에서 부터 연속되는 0의 갯수를 구하세요.
예) f(12) -> 2 # 12!은 479001600 f(25) -> 6 # 25!은 15511210043330985984000000
*/

public class Ex03 {
	public static void main(String[] args) {
		System.out.println(example(12));
		System.out.println(example(25));
		System.out.println(example2(12));
		System.out.println(example2(25));
	}
	public static  int example(int n) {
		long factorial = 1;
		while(n>0) {
			factorial *= n--;
		}
		System.out.println(factorial); // 오버플로우!!!
		int count = 0;
		while(factorial%10==0) {
			count++;
			factorial/=10;
		}
		return count;
	}
	/*
	 1부터 시작되는 자연수들을 5개씩 쪼갠 뒤 각각의 자연수를 소인수분해 했을 때, 소수 2의 총 개수는 항상 소수 5의 총 개수보다 같거나 많습니다
	 1,2,3,4,5->1,2^1,3,2^2,5^1 : 2 4개 5 1개
     121,122,123,124,125->121,61*2,123,31*2^2,5^3 : 2 3개 5 3개

	 예를 들어 10!의 경우를 보겠습니다
	 10!=3628800 즉 끝에 0이 2개 입니다
	 2개의 0은 어디서 나오는 것이냐면
	 (10) * 9 * 8 * 7 * 6 * (5) * 4 * 3 * 2 * 1 10과 5 두개에서 나오는 것입니다 소인수 2의 개수는 항상 5의 개수보다 같거나 
	 많기 때문에 따로 셀 필요 없습니다
	 따라서 소인수 5의 개수만 세어주면 됩니다
	 */
	public static  int example2(int n) {
		int count = 0;
	    while(n>1) {
	    	n /= 5;
	    	count += n; 
	    }
		return count;
	}
}
