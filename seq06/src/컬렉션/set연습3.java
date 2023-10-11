package 컬렉션;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;

public class set연습3 {

	public static void main(String[] args) {
		HashSet lotto = new HashSet();
		// 중복된 값은 제외하고 배열을 만듬
		// 중복된 값이 포함되는 경우 5개의 값만 출력되는 문제 발생
		
		Random r = new Random();
		while(true) {
			lotto.add(r.nextInt(45)+1); // 1~45까지 랜덤한 숫자 생성
			if (lotto.size() == 6) {
				break;
			}
		}
		System.out.println("금주 로또 당첨번호는 " + lotto + "입니다");
	}

}
