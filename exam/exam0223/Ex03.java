package kr.green.exam0223;

/*
문제 3] 비슷한 단어 찾아내기
아래와 같은 결과를 출력하는 function을 구현하라
bool OneEditApart(s1 s1, s1 s2)
OneEditApart("cat", "dog") = false
OneEditApart("cat", "cats") = true 
OneEditApart("cat", "cut") = true 
OneEditApart("cat", "cast") = true 
OneEditApart("cat", "at") = true
OneEditApart("cat", "acts") = false 
한개의 문자를 삽입, 제거, 변환을 했을때 s1, s2가 동일한지를 판별하는 OneEditApart 함수를 작성하시오.
*/
public class Ex03 {
	public static void main(String[] args) {
		System.out.println(oneEditApart("cat", "dog"));
		System.out.println(oneEditApart("cat", "cats"));
		System.out.println(oneEditApart("cat", "cut"));
		System.out.println(oneEditApart("cat", "cast"));
		System.out.println(oneEditApart("cat", "at"));
		System.out.println(oneEditApart("cat", "acts"));
	}

	public static boolean oneEditApart(String s1, String s2) {
		if (s1.length() == s2.length()) { // 길이 같을 때
			int isCorrectNum = 0;
			for (int i = 0; i < s1.length(); i++) {
				if (s1.charAt(i) == s2.charAt(i)) {
					isCorrectNum++;
				}
			}
			if (isCorrectNum >= s1.length() - 1) {
				return true;
			} else {
				return false;
			}
		} else if (s1.length() > s2.length()) { // 앞의 길이가 클떄
			for (int i = 0; i < s1.length(); i++) {
				if (i >= s2.length() || s1.charAt(i) != s2.charAt(i)) {
					StringBuilder sb = new StringBuilder(s2);
					s2 = sb.insert(i, ' ').toString();
					return oneEditApart(s1, s2);
				}
			}
		} else{ // 뒤의 길이가 클떄
			for (int i = 0; i < s2.length(); i++) {
				if (i >= s1.length() || s1.charAt(i) != s2.charAt(i)) {
					StringBuilder sb = new StringBuilder(s1);
					s1 = sb.insert(i, ' ').toString();
					return oneEditApart(s1, s2);
				}
			}
		}
		return false;
	}
}
