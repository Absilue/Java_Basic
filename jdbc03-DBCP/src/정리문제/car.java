	package 정리문제;
	
	public class car {
		public String color; // (+)
		int price;
		private String developer; // (-)
		protected int count; // (#)
		
		public car (String color, int price, String developer, int count) {
			this.color = color;
			this.price = price;
			this.developer = developer;
			this.count = count;
		}
		
		@Override
		public String toString() {
			return "자동차 [색상 = " + color + ", 가격 = " + price + ", 개발자 = " + developer + ", 수량 = " + count + "]";
		}
	}
