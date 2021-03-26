package kr.green.exam0302;

import java.util.Map;
import java.util.TreeMap;

/*
문제 1]모스부호 해독
문자열 형식으로 입력 받은 모스코드(dot: . dash:-)를 해독하여 영어 문장으로 출력하는 프로그램을 작성하시오.
글자와 글자 사이는 공백 하나, 단어와 단어 사이는 공백 두개로 구분한다.
예를 들어 다음 모스부호는 "he sleeps early"로 해석해야 한다.
.... .  ... .-.. . . .--. ...  . .- .-. .-.. -.--

모스부호 규칙 표

문자	부호	문자	부호
A	.-		N	-.
B	-...	O	---
C	-.-.	P	.--.
D	-..		Q	--.-
E	.		R	.-.
F	..-.	S	...
G	--.		T	-
H	....	U	..-
I	..		V	...-
J	.---	W	.--
K	-.-		X	-..-
L	.-..	Y	-.--
M	--		Z	--..
*/
public class Ex01 {
	public static void main(String[] args) {
		System.out.println(example(".... .  ... .-.. . . .--. ...  . .- .-. .-.. -.--"));

	}

	public static String example(String str) {
		// 모스부호 규칙
		String m[] = "A,.-,N,-.,B,-...,O,---,C,-.-.,P,.--.,D,-..,Q,--.-,E,.,R,.-.,F,..-.,S,...,G,--.,T,-,H,....,U,..-,I,..,V,...-,J,.---,W,.--,K,-.-,X,-..-,L,.-..,Y,-.--,M,--,Z,--..".split(",");
		// 맵에 저장!!!!
		Map<String, String> map = new TreeMap<String, String>();
		for(int i=0;i<m.length;i+=2) {
			map.put(m[i+1], m[i]); // 모스부호를 키로 알파벳을 값으로 저장 
		}
		System.out.println(map); // 출력
		String t[] = str.split(" "); // 넘어온 값을 공백으로 분리해서 배열
		String result = "";
		for(String s : t) { // 반복
			if(map.containsKey(s))	 // 키가 존재하면
				result += map.get(s); // 읽어서 추가
			else
				result += " "; // 아니면 공백
			
		}
		return result.toLowerCase();
	}
}
