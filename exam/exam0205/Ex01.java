package kr.green.exam0205;

/*
문제 1] 시저 암호 풀기
시저 암호는, 고대 로마의 황제 줄리어스 시저가 만들어 낸 암호인데, 
예를 들어 알파벳 A를 입력했을 때, 그 알파벳의 n개 뒤에 오는(여기서는 예를 들 때 3으로 지정하였다)
알파벳이 출력되는 것이다. 예를 들어 바꾸려는 단어가 'CAT"고, n을 5로 지정하였을 때 "HFY"가 되는 것이다.
어떠한 암호를 만들 문장과 n을 입력했을 때 암호를 만들어 출력하는 프로그램을 작성해라.
 */
public class Ex01 {
	public static void main(String[] args) {
		System.out.println(example("CAT", 5));
		System.out.println(example("AB", 1));
		System.out.println(example("z", 1));
		System.out.println(example("A B z", 1));
	}

	public static String example(String str, int n) {
		String answer = "";
		for(char ch : str.toCharArray()) {
			if(ch==' ') { //공백이면 그냥 출력
				answer += ch;
			}else if(ch>='a'&& ch<='z'){ // 소문자면
				// (ch+n-'a') : a로부터 떨어진 거리 ----> 0~25(a~z)이어야 한다. ---> 26으로 나눈 나머지 구함
				answer += (char)('a' + (ch+n-'a')%26);
			}else { // 대문자면
				answer += (char)('A' + (ch+n-'A')%26);
			}
		}
		return answer;
	}
}
