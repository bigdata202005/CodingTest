package kr.green.exam0219;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/*
문제 3] Every Other Digit
모든 짝수번째 숫자를 * 로 치환하시오.(홀수번째 숫자,또는 짝수번째 문자를 치환하면 안됩니다.) 
로직을 이용하면 쉬운데 정규식으로는 어려울거 같아요.
Example: a1b2cde3~g45hi6 → a*b*cde*~g4*hi6
*/
public class Ex03 {
	public static void main(String[] args) {
		System.out.println(example("a1b2cde3~g45hi6"));
	}

	@Test
	public void test() {
		assertEquals(example("a1b2cde3~g45hi6"), "a*b*cde*~g4*hi6");
	}
	public static String example(String str) {
		String result = "";
		String[] ar =  str.split("");
		for(int i=1;i<=ar.length;i++) {
			if(i%2==0 && "0123456789".contains(ar[i-1])) {
				result += "*";
			}else {
				result += ar[i-1];
			}
		}
		return result;
	}
	
}
