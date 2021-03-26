package kr.green.exam0219;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
문제 1] 그 시간 사무실에 몇 명이 있었나?
출처: http://www.careercup.com/question?id=13817668
아마존 면접문제
A사무실에는 특정일자의 출퇴근 시간이 기록된 거대한 로그파일이 있다고 한다.
파일의 형식은 다음과 같다. (한 라인에서 앞부분은 출근시간(HH:MM:SS), 뒷부분은 퇴근시간이다)
09:12:23 11:14:35
10:34:01 13:23:40
10:34:31 11:20:10
특정시간을 입력(예:11:05:20)으로 주었을 때 그 시간에 총 몇 명이 사무실에 있었는지 알려주는 함수를 
작성하시오.
*/
public class Ex01 {
	public static void main(String[] args) {
		System.out.println(example("11:05:20"));
		System.out.println(example("10:05:20"));
		System.out.println(example("08:05:20"));
	}
	public static int example(String time) { 
		int count = 0;
		Scanner sc = null;
		try {
			 sc = new Scanner(new File("time.txt"));
			 while(sc.hasNextLine()) {
				 String[] times = sc.nextLine().split(" ");
				 //System.out.println(times[0] + ", " + times[1]);
				 //System.out.println(times[0].compareTo(time) + ", " + times[1].compareTo(time));
				 if(times[0].compareTo(time)<=0 && times[1].compareTo(time)>=0) count++;
			 }
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}finally {
			sc.close();
		}
		return count;
	}

}
