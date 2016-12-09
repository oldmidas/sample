package kr.jhta.map;

import java.util.Date;
import java.util.HashMap;

public class HashMapDemo4 {
	public static void main(String[] args) {
		/*
		 * 서로 다른 타입의 값을 담는 Map객체 만들기
		 * 값의 타입이 String, Integer, Double, Date, 혹은 기타 객체
		 */
		HashMap<String, Object> map = new HashMap<>();
		map.put("name", "홍길동");	 //<String, String>
		map.put("age", 30);			 //<String, Integer>
		map.put("weight", 68.9);	 //<String, Double>
		map.put("birth", new Date());//<String, Date>
		
		String value1 = (String)map.get("name");
		
		Integer value2 = (Integer)map.get("age");
		int value22 = (Integer)map.get("age");	// auto-unboxing
		
		Double value3 = (Double)map.get("weight");
		double value33 = (Double)map.get("weight");	// auto-unboxing
		
		Date value4 = (Date)map.get("birth");
		// key에 해당하는 값을 꺼낼 때 적합하지 않은 데이터타입을 지정해도 
		// 컴파일 과정에서 에러가 표시되지 않는다.
		// String value44 = (String)map.get("birth"); <- ClassCastingException

		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value22);
		System.out.println(value3);
		System.out.println(value33);
		System.out.println(value4);
		
	
	}
}
