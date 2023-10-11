package 컬렉션;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class set연습2 {

	public static void main(String[] args) {
		ArrayList lotto = new ArrayList();
		// 고정길이, 같은 타입
		
		Random r = new Random();
		for (int i = 0; i < 6; i++) {
			int num = r.nextInt(45) +1;
			if (!lotto.contains(num)) {
				// ! = not 연산자로 조건이 반대가 됨
				// 중복값을 제외하기때문에, 중복값이 포함되면 배열이 5개만 출력이 됨
			}
			lotto.add(r.nextInt(45)+1); // 1~45까지 랜덤한 숫자 생성
		}
		System.out.println("금주 로또 당첨번호는 " + lotto + "입니다");
	}

}
