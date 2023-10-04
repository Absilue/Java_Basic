package 메서드연습;

import javax.print.DocFlavor.STRING;
import javax.swing.JOptionPane;

public class 반응여부테스트 {

	public static void main(String[] args) {
		int  x =Integer.parseInt("100");
		System.out.println(x);
		
		// String y = System.out.println(x);
		// void
		
		String data = JOptionPane.showInputDialog("이름을 입력");
		// 입력한 데이터를 가져다 위에 넣기 때문에 정상 출력
		
		// JOptionPane.showMessageDialog(null, data);
		// void
	}

}
