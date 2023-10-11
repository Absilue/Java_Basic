package 상속_응용;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 스레드그래픽 extends JFrame{

		//		public void go() {
		//			
		//		}
		// 객체 생성시 자동호출하는 생성자 메서드를 만들어주면 됨
		// static이 많은 메서드는 실제 코딩에서 잘 사용하지 X
	
	JLabel count, image, day;
	// 라벨은 전역변수로 선언
	// 선언 위치에 따라 사용위치가 결정됨

	public 스레드그래픽() {
		setTitle("나의 pc방 모니터링 서비스");
		setSize(800, 300);
		count = new JLabel("카운터 들어가는 자리");
		image = new JLabel("이미지 들어가는 자리");
		day = new JLabel("시간 들어가는 자리");
		Font font = new Font("긱블말랑이체", Font.BOLD, 30);
		
		count.setFont(font);
		image.setFont(font);
		day.setFont(font);
		
		
		// 기본적으로 위치를 지정해주지 않으면
		// Jframe은 BorderLayout으로 설정되어 있음
		// BorderLayout은 동서남북 + 가운데 중 설정 가능
		add(count, BorderLayout.WEST);
		add(image, BorderLayout.EAST);
		add(day, BorderLayout.SOUTH);
		
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		스레드그래픽 name = new 스레드그래픽();
		
	}
	// 카운터스레드에 내용을 복사해서 가져옴
	// 클래스안에 클래스를 끼워 넣을 수 있음 --> 전역변수를 사용하기 위해
	// 안쪽 클래스(inner 클래스)
	public class 카운터스레드 extends Thread{
		// run(), start() ...
		
		@Override
		public void run() {
			// 동시에 처리하고 싶은 내용 작성
			for (int i = 500; i >= 0; i--) {
				// System.out.println("카운터 " + i);
				count.setText("카운터 " + i);
				// count란 변수는 스레드_프로그래밍1에만 정의되어 있으므로 다른 class에서 사용 X
				try {
					Thread.sleep(1000);
					// 단위가 ms이므로 1000 = 1초
					// 외부의 자원(cpu)을 연결할때는 어떻게 처리할지 명시해줘야 함
				} catch (InterruptedException e) {
					e.printStackTrace();
					// catch할 여러 상황들 작성
					// 에러 출력
				}
			}
		}
	}

	
	public class 배열스레드 extends Thread{
		// run(), start() ...
		
		@Override
		public void run() {
			// 동시에 처리하고 싶은 내용 작성
			String [] list = {"1.png", "2.png", "3.png", "4.png", "5.png"};
			for (int i = 0; i < list.length; i++) {
				if(i ==4) {
					i =-1;
				}
				// System.out.println("이미지 " + list[i]);
				// image.setText("이미지 >> " + list[i]);
				ImageIcon icon = new ImageIcon(list[i]);
				image.setIcon(icon);
				try {
					Thread.sleep(5000);
					// 5000ms = 5초
				} catch (InterruptedException e) {
					e.printStackTrace();

				}
			}
		}
	}
	
	public class 시각스레드 extends Thread{
		
		@Override
		public void run() {
			// 동시에 처리하고 싶은 내용 작성
			for (int i = 500; i >= 0; i--) {
				java.util.Date date = new java.util.Date();
				// System.out.println("시각 " + date);
				day.setText("시각 " + date);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}


} // class
