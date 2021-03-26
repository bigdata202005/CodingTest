package kr.green.exam0205;

/*
문제 3] palindrome
앞에서부터 읽을 때나 뒤에서부터 읽을 때나 모양이 같은 수를 대칭수(palindrome)라고 부릅니다. 
두 자리 수를 곱해 만들 수 있는 대칭수 중 가장 큰 수는 9009 (= 91 × 99) 입니다. 
세 자리 수를 곱해 만들 수 있는 가장 큰 대칭수는 얼마입니까?
 */
public class Ex03 {
	public static void main(String[] args) {
		System.out.println(example());
	}
	public static int example() {
		int result = 0;
		for(int i=100;i<1000;i++) { // 3자리수
			for(int j=100;j<1000;j++) {
				int t = i * j; // 곱하기
				StringBuffer sb = new StringBuffer(t+""); // 스트링버퍼로 만듬. reverse()메서드가 존재!!!
				if(sb.toString().equals(sb.reverse().toString())) {
					// System.out.println(t);
					result = Math.max(result, t); // 최대값
				}
			}
		}
		return result;
	}
}
