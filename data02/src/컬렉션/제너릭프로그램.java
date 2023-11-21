package 컬렉션;

public class 제너릭프로그램 {

	public static void main(String[] args) {
		Truck<Integer, String> t1 = new Truck<Integer, String>();
		t1.weight = 100;
		t1.distance = "100km"; 
		
		Truck<Double, Double> t2 = new Truck<>();
		t2.weight = 130.55;
		t2.distance = 135.3;

	}

}
