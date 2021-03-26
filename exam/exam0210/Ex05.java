package kr.green.exam0210;

/*
문제 5] 남은퇴근시간 계산기
현우는 성인이되어 회사에입사했다.
하지만 들어간기업이 하필 할일없는 중소기업이라
퇴근시간까지 놀다가 퇴근시간에 퇴근하는것이 일상화가되어버렸다..
현우는 심심한지라 좀더효율적으로놀기위해
현재부터 퇴근시간까지 남은시간을 알려주는 계산기를 만들어
계산적으로놀고싶었다 우리가현우를 도와주자!!
(참고로 현우의퇴근시간은 17시30분이다)
input: 현재시간
output: 
남은시간 : hh:mm:ss
or
남은시간 : s
심화버젼 : 이쁘게꾸며보자!
*/
public class Ex05 {
	public static void main(String[] args) {
		example("17:29:30");
		example("17:28:30");
		example("15:28:30");
	}

	public static void example(String time) {
		String[] startTime = time.split(":"); // 시분초로 나누기
		String[] endTime = "17:30:00".split(":");
		// 초로 변경
		int start = Integer.parseInt(startTime[0])*3600 + Integer.parseInt(startTime[1])*60 + Integer.parseInt(startTime[2]);
		int end = Integer.parseInt(endTime[0])*3600 + Integer.parseInt(endTime[1])*60 + Integer.parseInt(endTime[2]);
		// 계산
		System.out.println("남은시간 : " + (end-start) + "초");

		// 심화버전
		int hh = (end-start)/3600;
		int mm = (end-start)%3600/60;
		int ss = (end-start)%60;
		System.out.println("남은시간 : " + String.format("%02d:%02d:%02d", hh,mm,ss));
		
	}
}
