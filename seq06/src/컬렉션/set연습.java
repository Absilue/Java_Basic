package 컬렉션;

import java.util.Arrays;
import java.util.Random;

public class set연습 {

	public static void main(String[] args) {
		int [] lotto = new int [6];
		// 고정길이, 같은 타입
		
		Random r = new Random();
		for (int i = 0; i < lotto.length; i++) {
			lotto[i]=r.nextInt(45)+1; // 1~45까지 랜덤한 숫자 생성
		}
		System.out.println("금주 로또 당첨번호는 " + Arrays.toString(lotto) + "입니다lotto[0]=r.nextInt(45)+1; // 1~45까지 랜덤한 숫자 생성");
	}

}
