package 생성자;

public class 컴퓨터 {
	// 멤버변수
	 public int price; //제품 가격
	 public String brand; // 제조회사
	 public int size; // 모니터 크기
	 
	 // 멤버변수값 초기화 역활
	 // this를 붙여주는 순간 전역변수로 인식함 
	 public 컴퓨터(int price, String brand, int size) {
		this.price = price;
		this.brand = brand;
		this.size = size;
	}
}
