package 변수심화;

public class 기본형심화 {

	public static void main(String[] args) {
		byte age = 127; // 1byte
		int age2 = age; // 4byte
		// 큰 byte <-- 작은 byte (자동으로 알아서 들어감)
		
		int age3 = 127;
		// byte age4 = age3;
		// 작은 byte <-- 큰 byte (불가능)
		byte age4 = (byte)age3;
		// 작은 byte <-- (작은 byte의 데이터 타입)큰 byte 
		// 강제로 byte 크기를 줄여서 넣어줘야함 (강제 타입 변환 - 강제형변환, casting)
		// 
	}

}
