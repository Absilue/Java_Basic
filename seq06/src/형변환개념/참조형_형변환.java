package 형변환개념;

import java.util.ArrayList;

import javax.swing.JButton;

public class 참조형_형변환 {

	public static void main(String[] args) {
		// 참조형 형변환은 상속관계에서만 가능
		ArrayList list = new ArrayList();
		// ArrayList는 가변길이, 타입이 여려개일 때 사용
		// list = {a, b, c};
		// list = {b, c};
		// 데이터 변경이 있을때 데이터들의 자리를 옮김
		// 데이터 변경이 너무 많을 때 사용하기에는 불편
		list.add("String");
		// String(작은 저장공간) --> Object(큰 저장공간) 
		// 자동으로 Object 타입으로 변환되서 들어감(자동 형변환)
		list.add(100);
		// Integer(작은 저장공간) --> Object(큰 저장공간)
		System.out.println(list);
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println("값 >> " + list.get(i));
		}
		// list에 있는 데이터를 꺼내서 변수에 넣기
		String s = (String)list.get(0);
		// Object(큰 저장공간) --> String(작은 저장공간)
		// cpu가 강제로 String 타입으로  변환해서 변수에 넣어줌(강제 형변환 = Casting)
		
		list.add(new JButton("버튼 1"));
		JButton b1 = (JButton)list.get(2);
		// Object(큰 저장공간) --> JButton(작은 저장공간)
	}

}
