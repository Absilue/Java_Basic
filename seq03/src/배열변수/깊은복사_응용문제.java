package 배열변수;

import java.util.Arrays;

public class 깊은복사_응용문제 {

	public static void main(String[] args) {
		String [] subject = {"국어", "영어", "수학", "컴퓨터", "화학"};
		int [] term1 = {44, 66, 55, 99, 88};
		int [] term2 = term1.clone();  // 깊은 복사
		term2[0] = 77;
		term2[3] = 44;
		System.out.println(Arrays.toString(term1));
		System.out.println(Arrays.toString(term2));
		
		int count_same = 0;
		for (int i = 0; i < term2.length; i++) {
			if (term1[i] == term2[i]) {
				count_same++;
			}
		} System.out.println("1학기와 2학기 성적이 동일한 과목의 수는 " + count_same);
		
		int sub_good = 0;
		for (int i = 0; i < term2.length; i++) {
			if (term1[i] < term2[i]) {
				sub_good++;
				System.out.println("2학기 성적이 오른 과목명은 " + subject[i]);
			}
		} System.out.println("2학기 성적이 오른 과목의 수는 " + sub_good);
	}

}
