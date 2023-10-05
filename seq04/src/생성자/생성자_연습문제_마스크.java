package 생성자;

public class 생성자_연습문제_마스크 {

	public static void main(String[] args) {
		마스크 mask = new 마스크("흰색", 3000, 5);
		System.out.println(
				"장바구니에 담은 마스크는 " + mask.color + "이며, 개당 가격은 " + mask.price + "원이며, 구매 갯수는 " + mask.count + "개입니다");

		마스크 mask2 = new 마스크("검은색", 6000, 8);
		System.out.println(
				"장바구니에 담은 마스크는 " + mask2.color + "이며, 개당 가격은 " + mask2.price + "원이며, 구매 갯수는 " + mask2.count + "개입니다");

	}

}
