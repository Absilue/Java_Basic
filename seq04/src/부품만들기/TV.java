package 부품만들기;

public class TV {
	// TV라는 부류의 공통적인 특징을 가지고 틀을 만들 예정
	// 속성(특징, 성질) - 채널, 볼륨 , on-off 상태 ==> 멤버 변수
	// 기능(동작) - 채널 변경, 볼륨 변경 ==> 멤버(선택했다는 의미) + 메서드(특정한 방법을 사용했다는 의미) 
	//												  ==> 멤버 메서드(멤버 함수)
	
	public int ch;
	public int vol;
	public boolean onoff;
	// 변수 앞에 public을 붙여주어 다른 package에서도 사용 가능하게 변경
	//TV tv1 = new TV () ==> 총 4개의 변수가 생성
	// 할당된 램의 크기는 주소 4 / int 4 / boolean 1 ==> 총 13byte 사용
	
	public void 채널변경() {
		System.out.println("채널을 변경");
	}
	
	public void 볼륨변경() {
		System.out.println("볼륨을 변경");
	}
}
