package 메서드연습;

import java.util.ArrayList;

public class 계산기 {
	public void add(int x, int y) {
		// void == return이 없다
		int sum = x + y;
		System.out.println("계산 결과는 " + sum + "원");
	}
	
	public int add2(int x, int y) {
		int sum = x + y;
		return sum;
		// return을 사용하기 위해 public void ==> public int
		// return을 사용하지 않으면 계산결과를 다시 sum에 저장 불가
	}
	
	public int mul(int x, int y) {
		int mul = x * y;
		return mul;
		// return을 사용하기 위해 public void ==> public int
		// return을 사용하지 않으면 계산결과를 다시 sum에 저장 불가
	}
	
	public int [] array() {
		int [] arr = {1, 2, 3};
		return arr;
		// 참조형 변수(주소), 100
		// return을 사용하기 위해 public void ==> public int
	}
	
	public double [] array2() {
		double [] arr2 = {11.1, 22.2, 33.3};
		return arr2;
	}
	
	public int result() {
		int result = 0;
		return result;
	}
	
	public void get1() {
		MemberVO bag = new MemberVO(); // bag 생성
		bag.setId("win"); 
		// 힙영역에 있는 id변수에 win을 넣음
		bag.setPw("1234");
		bag.setName("win");
		bag.setTel("011");
		System.out.println(bag);
	}
	
	public MemberVO get2(String id, String pw, String name, String tel) {
		MemberVO bag = new MemberVO(); // bag 생성
		bag.setId(id); 
		// 힙영역에 있는 id변수에 win을 넣음
		bag.setPw(pw);
		bag.setName(name);
		bag.setTel(tel);
		return bag;
	}
	
	public ArrayList get3(String name, int age) {
		ArrayList list = new ArrayList();
		list.add(name);
		list.add(age);
		return list;
	}
	
	public String get4(String name, int age) {
		String s = "제 이름은 " + name + "이고, 나이는 " + age + "살 입니다";
		return s;
	}
}
