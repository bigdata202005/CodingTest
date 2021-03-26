package kr.green.exam0305;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/*
문제 1] 주식차트는 분,초,시,일 등의 가격 데이터를 O(open), H(high), L(low), C(close)를 가지고 봉 형태로 표시해 줍니다. 
이를 candlesticks chart라고 합니다.
그러면, 주식의 거래데이터가 아래와 가티 주어질 때 ohlc를 만듭니다.

예) 1분마다 open, high, low, close를 만듭니다.
분:초, 거래가격
1:02, 1100
1:20, 1170
1:59, 1090
2:30, 1030
2:31, 1110
2:42, 1150
2:55, 1210
2:56, 1190
3:02, 1120
3:09, 1100
4:15, 1090
4:20, 1080
4:55, 1050
4:56, 1020
4:57, 1000

[조건] 실제 주식 거래의 경우, 분당 거래 회수가 10번, 100번, 1000번 등일 수 있으므로, 
high, low를 찾을 때 되도록 전체 데이터에서 찾지 않고, 앞뒤 데이터를 비교하여 찾아주십시오.. 

답: 
open =  [1100, 1030, 1120, 1090]
high =  [1170, 1210, 1120, 1090]
low =   [1090, 1030, 1100, 1000]
close = [1090, 1190, 1100, 1000]
*/
public class Ex01 {
	public static void main(String[] args) throws FileNotFoundException {
		// 데이터를 읽어 맵에 저장
		Scanner sc = new Scanner(new File("ohlc.txt"));
		Map<String, Integer> map = new TreeMap<String, Integer>();
		while(sc.hasNextLine()) {
			String line = sc.nextLine();
			map.put(line.split(",")[0], Integer.parseInt(line.split(",")[1].trim()));
		}
		sc.close();
		// System.out.println(map);
		// 결과를 저장할 리스트 4개
		List<Integer> open = new ArrayList<Integer>();
		List<Integer> high = new ArrayList<Integer>();
		List<Integer> low = new ArrayList<Integer>();
		List<Integer> close = new ArrayList<Integer>();
		
		// 변수들
		String oldTime=""; // 이전시간
		int max=0, min=0, oldValue=0, value=0; // 최대, 최소, 이전값, 현재값
		for(String key : map.keySet() ) { // 반복
			// System.out.println(key + " : " + map.get(key));
			value = map.get(key); // 값 1개얻기
			if(oldTime.equals("")) { // 최초의 데이터라면
				oldTime = key.split(":")[0]; // 시간
				open.add(value); // 오픈시간 추가
				min = value;
				max = value;
			}
			// 시간이 바뀌었다면
			if(!key.split(":")[0].equals(oldTime)) {
				oldTime = key.split(":")[0];
				close.add(oldValue);
				open.add(value);
				low.add(min);
				high.add(max);
				min = value;
				max = value;
			}
			oldValue = value;
			if(max<value) max = value;
			if(min>value) min = value;
		}
		// 마지막 시간에대한 처리!!!
		close.add(oldValue);
		low.add(min);
		high.add(max);
		System.out.println("Open : " + open);
		System.out.println("High : " + high);
		System.out.println("low : " + low);
		System.out.println("Close : " + close);
	}
}
