package 정리문제;

public class truck extends car{
	public int weight;
	public boolean move;
	
	public truck (String color, int price, String developer, int count, int weight, boolean move) {
		super(color, price, developer, count);
		this.weight = weight;
		this.move = move;
	}

	@Override
	public String toString() {
		return "트럭 [무게 = " + weight + ", 이동 여부 = " + move + ", 색상 = " + color + ", 가격 = " + price + ", 수량 ="
				+ count + "]";
	}
}
