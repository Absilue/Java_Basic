package 생성자;

public class 생성자_연습문제_컴퓨터 {

	public static void main(String[] args) {
		컴퓨터 computer = new 컴퓨터(900000, "LG", 27);
		System.out.println("장바구니에 담은 모니터는 " + computer.brand + "사의 " + computer.size +
											"인치 제품이며, 제품 가격은 " + computer.price + "원 입니다");
		
		컴퓨터 computer2 = new 컴퓨터(850000, "SamSung", 29);
		System.out.println("장바구니에 담은 모니터는 " + computer2.brand + "사의 " + computer2.size +
									"인치 제품이며, 제품 가격은 " + computer2.price + "원 입니다");
	}
}
