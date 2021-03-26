package kr.green.exam0303;

/*
문제 2] CamelCase를 Pothole_case 로 바꾸기!
파이썬과 같은 몇몇 프로그래밍 언어는 Pothole_case 를 더 선호하는 언어라고 합니다.
Example:
codingDojang --> coding_dojang
numGoat30 --> num_goat_3_0
위 보기와 같이 CameleCase를 Pothole_case 로 바꾸는 함수를 만들어요!
출처: UT past test
*/

public class Ex02 {
	public static void main(String[] args) {
		System.out.println(example("codingDojang"));
		System.out.println(example("numGoat30"));

	}
	public static  String example(String str) {
		String result="";
		for(char ch : str.toCharArray()) {
			if(Character.isUpperCase(ch) || Character.isDigit(ch)) { // 대문자 또는 숫자라면 앞에 _를 붙여준다.
				result += "_" + ch;
			}else {
				result += ch;
			}
		}
		return result.toLowerCase();
	}
	
}
