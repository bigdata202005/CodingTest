package kr.green.exam0225;

import java.util.Stack;

/*
문제 2] Simple Balanced Parentheses
출처: http://interactivepython.org/courselib/static/pythonds/BasicDS/SimpleBalancedParentheses.html
아래는 괄호를 이용한 연산식이다.
(5+6)∗(7+8)/(4+3)
우리는 여는 괄호가 있으면 닫는 괄호가 반드시 있어야 한다는 것을 잘 알고 있다.
다음은 정상적인(balanced) 괄호 사용의 예이다.
(()()()())
(((())))
(()((())()))
다음은 비정상적인(not balanced) 괄호 사용의 예이다.
((((((())
()))
(()()(()
(()))(
())(()
괄호의 사용이 잘 되었는지 잘못 되었는지 판별 해 주는 프로그램을 작성하시오.
*/

public class Ex02 {
	public static void main(String[] args) {
		System.out.println(example("(()()()())"));
		System.out.println(example("(((())))"));
		System.out.println(example("(()((())()))"));
		System.out.println(example("((((((())"));
		System.out.println(example("()))"));
		System.out.println(example("(()()(()"));
		System.out.println(example("(()))("));
		System.out.println(example("())(()"));
	}
	public static  boolean example(String str) {
		Stack<String> stack = new Stack<String>(); // 스텍작성
		for(String t : str.split("")) {
			if(t.equals("(")) { // 여는 괄호면 스텍에저장
				stack.push(t);
			}else { // 닫는괄호면 스텍에서 제거
				if(stack.empty()) { // 비어있다면 짝이 맞지 않는다.
					return false; // 거짓
				}
				stack.pop(); // 제거
			}
		}
		return stack.isEmpty(); // 모두 돌았을때 스텍이 비어있으면 참!!!
	}
}
