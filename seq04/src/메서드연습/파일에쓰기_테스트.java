package 메서드연습;

import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class 파일에쓰기_테스트 {

	public static void main(String[] args) {
		try {
			FileWriter file = new FileWriter("test2.txt");
			file.write("안녕하세요" + "\n");
			file.write("좋은 아침이에요" + "\n");
			file.write("점심은 드셨나요?" + "\n");
			file.close();
			//stream을 닫음
		} catch (IOException e) {
			// 에러에 대처할 내용이 들어가면 됨
			// 자세한 에러 정보도 확인이 가능
			System.out.println("에러 발생");
			e.printStackTrace();
		}
		// 파일에 텍스트를 저장할 수 있는 부품
		// " " 파일명을 반드시 입력해야함
		// 파일을 생성하고, 텍스트를 파일까지 보낼 수 있는 통로(stream)를 만듬
		
		// stream을 만드는 것은 프로그래밍하는 과정에서 위험한 상황
		// 위험한 상황이란 ==> 프로그램이 작동을 중지하는 상황
 
	}

}
