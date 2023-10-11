package 컬렉션;

import java.util.HashMap;

public class 맵연습2 {

	public static void main(String[] args) {
		// map - 맵핑시킨다(연결시킨다)
		// 키 - 값의 쌍으로 맵핑을 통해 연결시켜 저장함
		HashMap map = new HashMap();
		map.put("100번째 고객", "김데이");
		map.put("200번째 고객", "김사전");
		map.put("300번째 고객", "김구조");
		map.put("400번째 고객", "김자료");
		System.out.println(map);
		
		map.remove("200번째 고객", "김사전");
		map.replace("김구조", "김충성");
		System.out.println("고객 데이터 최신화");
		System.out.println(map);
		// HashMap은 키 - 값 쌍을 순서대로 정렬하는것이 아니라, 데이터가 입력한 순서대로 보존되지 X
	}

}
