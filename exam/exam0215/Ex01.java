package kr.green.exam0215;

/*
문제 1] 숫자,문자열 구별하기
문자와 숫자가섞인 문자열을 입력받을때 구별하여출력해라
*/
public class Ex01 {
	public static void main(String[] args) {
		example("c910m6ia 1ho");
	}
	public static void example(String input) {
		String number="", string="";
		for(String t : input.split("")) {
			if("0123456789".contains(t))
				number += t;
			else
				string += t;
		}
		System.out.println("int : " + number);
		System.out.println("str : " + string);
	}

}
