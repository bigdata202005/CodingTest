package kr.green.exam0203;

/*
문제 3] Dash Insert
DashInsert 함수는 숫자로 구성된 문자열을 입력받은 뒤, 
문자열 내에서 홀수가 연속되면 두 수 사이에 - 를 추가하고, 짝수가 연속되면 * 를 추가하는 기능을 갖고 있다. 
(예, 454 => 454, 4546793 => 454*67-9-3) DashInsert 함수를 완성하자. 

입력 - 화면에서 숫자로 된 문자열을 입력받는다.
"4546793"
출력 - *, -가 적절히 추가된 문자열을 화면에 출력한다.
"454*67-9-3"
 */
public class Ex03 {
	public static void main(String[] args) {
		System.out.println(example("4546793"));
	}
	public static String example(String str) {
		String result = "";
		for(int i=0;i<str.length()-1;i++) {
			result += str.charAt(i);
			if((str.charAt(i)-'0')%2==0 && (str.charAt(i+1)-'0')%2==0) { // 짝수면
				result += "*";
			}else if((str.charAt(i)-'0')%2!=0 && (str.charAt(i+1)-'0')%2!=0) { // 홀수면
				result += "-";
			}
		}
		result += str.charAt(str.length()-1); // 마지막 글자 추가
		return result;
	}
}
