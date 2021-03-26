package kr.green.exam0222;

/*
문제 1] Ones
출처: programming challenges
2나 5로 나눌 수 없는 0 이상 10,000 이하의 정수 n이 주어졌는데, 
n의 배수 중에는 10진수로 표기했을 때 모든 자리 숫자가 1인 것이 있다. 
그러한 n의 배수 중에서 가장 작은 것은 몇 자리 수일까?
Sample Input
3
7
9901

Sample Output
3
6
12

*/
public class Ex01 {
	public static void main(String[] args) {
		System.out.println(example(3));
		System.out.println(example(7));
		System.out.println(example(9901));
	}
	public static int example(int n) { 
		long t;
		int  length = 0;
        do{
        	length++;
            t=1; 
            for(int j=1; j< length;j++) // n= 1로만 이루어진 N자리의 수 : 1 11 111 1111 11111 이런 숫자를 만들어 준다.
            	t = t*10 + 1; 
        }while(t%n!=0); // 만들어진 수가 n의 배수라면 종료
        //System.out.println(t + ", " + length);
        return length; // 길이
	}
}
