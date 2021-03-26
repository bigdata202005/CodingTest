package kr.green.exam0215;

/*
문제 4] 정수와 소수 구별하기
프로그래머 X는 코딩을 하다가 문득, 수학 시간에 배운 정수와 소수를 구별하는 방법을 떠올렸다. 
정수와 소수의 차이는 분수로 표현이 되느냐, 되지 않느냐에 따라 차이가 나기도 하며, 
또한 파이 등 특정한 값을 나타내는 것에 의하여 소수인지 정수인지 판별이 나게 된다.
프로그래머 X는 입력값을 숫자를 입력하거나 문자를 입력하려고 하는데,
만약 숫자를 입력하였으면 그것이 정수인지, 소수인지 구별하는 프로그램을 짜보도록 하고,
만약 문자를 입력하였으면 숫자가 아니므로 math error를 표시하게 하라.
 */
public class Ex04 {
	public static void main(String[] args) {
		example("123");
		example("123.45");
		example("abc");
	}

	public static void example(String str) {
		try {
			double d = Double.parseDouble(str);
			if(d - (int)d==0)
				System.out.println("정수");
			else
				System.out.println("실수");
		}catch (Exception e) {
			System.out.println("math error");
		}
	}
}
