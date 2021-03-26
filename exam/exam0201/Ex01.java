package kr.green.exam0201;
/*
문제 1] 3이 나타나는 시간을 전부 합하면?
디지털 시계에 하루동안(00:00~23:59) 3이 표시되는 시간을 초로 환산하면 
총 몇 초(second) 일까요?
디지털 시계는 하루동안 다음과 같이 시:분(00:00~23:59)으로 표시됩니다.
 */
public class Ex01 {
	public static void main(String[] args) {
		System.out.println(example1(3));
	}
	
	public static int example1(int num) {
		int sec = 0;
		int sec2 = 0;
		for(int h=0;h<24;h++) {
			for(int m=0;m<60;m++) {
				if(h/10==3 || h%10==3 || m/10==3 || m%10==3) {
					sec2 += 60;
				}
				// 문자열.indexOf(찾는문자열) : 위치를 알려준다. 없으면 -1을 리턴한다.
				if((""+h+m).indexOf(num+"")!=-1) { // 시간이나 분에 3이 들어가면
					sec += 60; // 60씩 더한다.
				}
			}
		}
		System.out.println(sec + " : " + sec2);
		return sec;
	}
}
