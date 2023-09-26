package 배열응용;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class 여행문제 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] now_place = new String[3];
		String[] fu_place = new String[3];
		int same = 0;

		for (int i = 0; i < 3; i++) {
			now_place[i] = JOptionPane.showInputDialog("올해 가고싶은 여행지를 입력하세요");
		}

		for (int i = 0; i < fu_place.length; i++) {
			fu_place[i] = JOptionPane.showInputDialog("내년에 가고싶은 여행지를 입력하세요");
		}
		
		for (int j = 0; j < fu_place.length; j++) {
			if (now_place[j].equals(fu_place[j])) {
				same++;
			}
		} System.out.println("같은 여행지는 " + same + "번 입력했습니다");
	}

}
