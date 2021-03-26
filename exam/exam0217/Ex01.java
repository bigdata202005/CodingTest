package kr.green.exam0217;

/*
문제 1] 구글 입사문제 중에서
1부터 10,000까지 8이라는 숫자가 총 몇번 나오는가?
8이 포함되어 있는 숫자의 갯수를 카운팅 하는 것이 아니라 8이라는 숫자를 모두 카운팅 해야 한다.
(※ 예를들어 8808은 3, 8888은 4로 카운팅 해야 함)
*/
public class Ex01 {
	public static void main(String[] args) {
		example();
	}
	public static void example() {
		int count = 0;
		for(int i=1;i<10000;i++) {
			int t = i;
			while(t>0) {
				if(t%10==8)count++;
				t/=10;
			}
		}
		System.out.println(count);
	}

}
