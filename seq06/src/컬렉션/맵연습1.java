package 컬렉션;

import java.util.HashMap;

public class 맵연습1 {

	public static void main(String[] args) {
		// map - 맵핑시킨다(연결시킨다)
		// 키 - 값의 쌍으로 맵핑을 통해 연결시켜 저장함
		HashMap map = new HashMap();
		map.put("apple", "사과");
		map.put("melon", "멜론");
		map.put("icecream", "아이스크림");
		System.out.println(map);
		// 맵핑된 데이터들은 { }안에 저장됨
		System.out.println(map.get("apple"));
		// 맵핑된 데이터들에는 순서가 없음 --> index 사용 X
		map.put("apple","청주 사과");
		// 원본 데이터를 덮어쓰게 됨
		System.out.println(map);
		map.remove("apple");
		// remove( )는 파괴형 함수
		System.out.println(map);
	
	}

}
