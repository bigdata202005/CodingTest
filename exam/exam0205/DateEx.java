package kr.green.exam0205;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateEx {
	public static void main(String[] args) {

		LocalDateTime now = LocalDateTime.now(); // 현재시간
		System.out.println(now);
		LocalDateTime threeYearsAfter = now.plusYears(3); // 3년 뒤 - now는 계속 현재시간
		System.out.println(threeYearsAfter);
		LocalDateTime twoDaysAgo = now.minusDays(2); // 2일 전
		System.out.println(twoDaysAgo);
		LocalDateTime twoDaysAndThreeHoursAgo = now.minusDays(2).minusHours(3); // 2일 3시간 전
		System.out.println(twoDaysAndThreeHoursAgo);
		
	    // LocalDateTime에서 필요한 내용 필요한 형식으로 뽑기
	    System.out.println(now.format(DateTimeFormatter.ofPattern("yyy-MM-dd hh:mm:ss")));
	    System.out.println(now.minusDays(1).format(DateTimeFormatter.ofPattern("yyy-MM-dd hh:mm:ss")));
	    
	    
	}
}
