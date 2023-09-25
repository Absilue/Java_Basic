package 배열응용;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class 배열_정리문제2 {
	public static void main(String[] args) {
		String[] a = new String[5];
		String[] b = new String[5];
		String[] c = new String[5];

		for (int i = 0; i < 5; i++) {
			String n = JOptionPane.showInputDialog("좋아하는 여행지 5개를 입력하세요");
			a[i] = n;
		}
		System.out.println("가고 싶은 여행지는 ");
		for (String n : a) {
			System.out.println(n);
		}

		System.out.println();

		for (int j = 0; j < 5; j++) {
			String m = JOptionPane.showInputDialog("좋아하는 색깔 5개를 입력하세요");
			b[j] = m;
		}
		System.out.println("좋아하는 색깔은 ");
		for (String m : b) {
			System.out.println(m);
		}

		System.out.println();

		for (int k = 0; k < 5; k++) {
			String u = JOptionPane.showInputDialog("좋아하는 연예인 5명을 입력하세요");
			c[k] = u;
		}
		System.out.println("좋아하는 색깔은 ");
		for (String u : c) {
			System.out.println(u);
		}
	}
}
