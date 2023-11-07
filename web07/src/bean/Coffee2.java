package bean;

public class Coffee2 {
	String name;
	int price;
	public static Coffee2 coffee2;

	public static Coffee2 getInstanc() {
		if (coffee2 == null) {
			coffee2 = new Coffee2("카페라떼", 4000);
		}
		return coffee2;
	}

	public Coffee2(String name, int price) {
		this.name = name;
		this.price = price;
	}
}
