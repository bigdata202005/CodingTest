package kr.green.exam0205;

/*
문제 2] 2진법으로 자연수 나타내기
2진법이란, 어떤 자연수를 0과 1로만 나타내는 것이다. 
예를 들어 73은 64(2^6)+8(2^3)+1(2^0)이기 때문에 1001001으로 표현한다. 
어떤 숫자를 입력받았을 때 그 숫자를 2진법으로 출력하는 프로그램을 작성하시오.
 */
public class Ex02 {
	public static void main(String[] args) {
		for(int i=0;i<20;i++) {
			// System.out.println(example(i));
			System.out.println(example2(i));
		}
	}

	public static String example(int n) {
		return Integer.toBinaryString(n);
	}
	
	public static String example2(int n) {
		StringBuffer sb = new StringBuffer();
		int mask = 0x80; // 8비트중 최상위 비트만 1인수 : 0b10000000 ==> 자리수만큼 만들어 주어야 한다. 여기서는 0~255사이만
		for(int i=0;i<8;i++) {
			sb.append(((mask&n)==mask) ? "1" : "0");
			mask>>=1;
		}
		return sb.toString();
	}
	
	
}
