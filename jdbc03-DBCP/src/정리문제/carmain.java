package 정리문제;

import 정리문제.car;;

public class carmain {

	public static void main(String[] args) {
		car car2 = new car("Red", 100000, "Choi", 2);
		System.out.println(car2);
		
		truck car3 = new truck("Red", 400000, "Choi", 1, 500, true);
		System.out.println(car3);
	}

}
