package kr.green.exam0203;

public class Ex05 {
	public static void main(String[] args) {
		int birth1 = 990205;		// 4바이트
		String birth2 = "990205";   // 7*2 = 14바이트
		
		System.out.println(birth1/10000 + "년");
		System.out.println(birth1%10000/100 + "월");
		System.out.println(birth1/100%100 + "월");
		System.out.println(birth1%100 + "일");

		System.out.println(birth2.substring(0,2) + "년");
		System.out.println(birth2.substring(2,4) + "월");
		System.out.println(birth2.substring(4) + "일");
	}
}
