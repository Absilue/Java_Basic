package 복습;

public class 제어문_확인문제3_2_풀이 {

	public static void main(String[] args) {
		int age = 100;
		int age2 = age + 1;
		
		// String result = "";
		// if (age2 > 100) {
		// 	result = "이제부터 시작";
		// }else {
		// 	result = "아직 젊어요";
		// }
		
		String result = "아직 젊어요";
		// if문이 else일때 초기값을 넣어놓으면
		// if문이 true일때 result의 값만 넣어주면 되므로 코딩이 간단해짐
		// 개발자들이 더 선호하는 코드
		if (age2 > 100) {
			result = "이제부터 시작";
		}
		
		
		System.out.println(result);
	}

}
