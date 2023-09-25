package 제어문_순차문;

import java.util.Scanner;

public class Scanner연습 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Scanner란 부품은 입력받을 수 있는 대상을 반드시 ( ) 안에 넣어줘야 사용가능
		// System.in은 시스템에서 정한 기본 입력(input)장치 - 키보드
		// System.out은 시스템에서 정한 기본 출력(output)장치 - 모니터
		
		// new로 자동완성하고 빨간 밑줄이 생기는 경우 - 부품의 위치를 못 찾음
		// 빨간 밑줄이 생긴 단어를 선택 후, 첫번째 import를 선택하여 문제 해결
		
		System.out.print ("이름을 입력하세요");
		// println에서 ln을 빼면 줄을 바꾸지 않음
		
		String name = sc.next(); 
		//String으로 입력한 값을 가지고 옴
		
		System.out.print ("나이를 입력하세요");
		
		int age = sc.nextInt();
		// 모든 String 값을 int로 변환시켜줌 
		
		System.out.print ("몸무게를 입력하세요");
		
		double weight = sc.nextDouble();
		// 모든 String 값을 int로 변환시켜줌 
		
		System.out.print ("저녁을 먹었나요?");
		
		Boolean dinner = sc.nextBoolean();

		System.out.print ("나의 좌우명은?");
		
		sc.nextLine();
		// 이전에 nextDouble을 사용한 후 nextLine을 사용하는 경우
		// ('\n')이 남아있어 의도치않게 비어있는 문자열을 받을 수 있으므로
		// sc.nextLine(); 을 입력하여 개행 문자를 소비해야함
		
		String way = sc.nextLine();
		
		System.out.println ("당신의 이름은 " + name);
		System.out.println ("당신의 나이는 " + (age-5) + "살입니다");
		System.out.println ("당신의 몸무게는 " + (weight-10) + "kg입니다");
		System.out.println ("나는 저녁을 " + dinner + "했습니다");
		System.out.println ("나의 좌우명은 " + way + " 입니다.");		
		
	}

}
