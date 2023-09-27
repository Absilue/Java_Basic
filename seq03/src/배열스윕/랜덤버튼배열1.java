package 배열스윕;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class 랜덤버튼배열1 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(1000, 1000);
		f.setTitle("버튼 모음");
		f.setLayout(null);
		
		Color [] colors = {Color.red, Color.blue, Color.white, Color.black, Color.gray, Color.green, Color.orange, Color.yellow};
		
		JButton [] buttons = new JButton[500];
		Random r = new Random();
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton();
			int x = r.nextInt(1000);
			int y = r.nextInt(1000);
			int z = r.nextInt(colors.length);
			
			buttons[i].setText("버튼 " + i);
			buttons[i].setBounds(x, y, 100, 100);
			buttons[i].setBackground(colors[z]);
			buttons[i].addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// 버튼을 클릭했을때 실행되었으면 하는 내용 작성
					String s = e.getActionCommand();
					// 버튼 위에 올라가는 글자를 가지고 옴
					JOptionPane.showMessageDialog(f, s + "를 클릭하셨습니다");
				}
			});
			f.add(buttons[i]);
		}
		
		f.getContentPane().setBackground(Color.pink);
		// f.setBackground로는 배경색이 바뀌지 않음
		// JFrame은 기본적으로 투명한 배경색을 가지므로 실제 화면에 표시되지 않기 때문에
		// 따라서 f.getContentPane()으로 JFrame의 컨텐츠 패널 자체를 가져와야 함
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// JFrame의 X를 눌렀을때 자바 프로그램이 종료되는 명령어
		f.setVisible(true);
	}

}
