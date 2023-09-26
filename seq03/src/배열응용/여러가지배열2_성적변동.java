package 배열응용;

public class 여러가지배열2_성적변동 {

	public static void main(String[] args) {
		int [] exam1 = {77, 88, 99, 55, 70};
		int [] exam2 = {99, 100, 88, 80, 70};
		
		// 성적이 2학기에 향상된 학생의 수를 카운트해서 프린트
		int count_exam1 = 0;
		
		for (int i = 0; i < exam2.length; i++) {
			if (exam2[i] > exam1[i]) {
				count_exam1++;
			}
		} System.out.println("2학기에 성적이 더 향상된 학생의 수는 " + count_exam1 + "명입니다");
		
		int count_exam2=0;
		// 성적이 1,2학기 동일한 학생의 수를 카운트해서 프린트
		for (int i = 0; i < exam2.length; i++) {
			if(exam2[i] == exam1[i]) {
				count_exam2++;
			}else {
				
			}
		}System.out.println("1학기와 2학기의 성적이 같은 학생의 수는 " + count_exam2 + "명입니다");
	}
}
