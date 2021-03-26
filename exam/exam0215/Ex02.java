package kr.green.exam0215;

/*
문제 2] n의 배수 판정법
어떤 수 x와 n이 주어졌을때 조건에 따라 x가 n의 배수인지 판별하는 코드를 작성하라.
x는 0 이상의 정수이며 조건에 맞지 않는 입력은 주어지지 않는다.
여기서 하나의 함수인지 여러 함수인지는 본인이 선택하면 된다.
단 절대 산술연산자 중 %와 /는 코드에 없도록 한다.
그리고 divmod() 함수를 쓰는것도 금지한다
코드는 창의적으로 하는 것을 목적으로 한다. 속도는 크게 중점을 두지 않는다.
n의 종류는 2,3,5,7,11,13이다.
원하는 n만 선택해서 풀 수도 있다.
입력
입력으로 주어질 자연수의 종류를 입력받고 차례로 그 수만큼 정수를 입력받는다.
6
432 2
4 3
635 5
421 7
122 11
143 13
출력
1
0
1
0
0
1
저는 인터넷에서 n의 배수 판정하는 법이란 글을 보게되어 여러분들에게 더욱 창의적인 방법을 묻고싶었는데
가장 기본을 생각못하다니 저도 참 무식한것 같습니다.
이미 푸신분들은 어쩔 수 없겠지만 최대한 이미 나온 조건과 더불어 이 조건도 추가하면 좋을것 같습니다.
저 좋으라고 하는일이 아닌 여러분들의 창의력을 키우기위한 문제이니까요 감사합니다.
 */
public class Ex02 {
	public static void main(String[] args) {
		System.out.println(example(432,2));
		System.out.println(example(4, 3));
		System.out.println(example(635,5));
		System.out.println(example(421,7));
		System.out.println(example(122,11));
		System.out.println(example(143,13));
	}
	public static  int example(int n, int m) {
		return n%m==0 ? 1 : 0;
	}
}
