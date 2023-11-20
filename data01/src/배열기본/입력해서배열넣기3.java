package 배열기본;

import java.util.ArrayList;
import java.util.Arrays;

public class 입력해서배열넣기3 {

	public static void main(String[] args) {
		// 입력하는 객체 필요 Scanner
		// 많은 양의 데이터를 선형으로 넣을 수 있는 객체
		// 배열을 사용

		double[] numbers = new double[5];
		numbers[0] = 11.1;
		numbers[1] = 22.2;
		numbers[2] = 33.3;
		numbers[3] = 44.4;
		numbers[4] = 55.5;

		int count = 0;
		String location = " ";
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == 22.2) {
				System.out.println("22.2의 위치는 " + i);
			}else if (numbers[i] == 33.3) {
				System.out.println("33.3의 위치는 " + i);
				count ++;
				location = location + " " + i + " ";
				list.add(i);
			}
		}
		System.out.println(count);
		System.out.println("33.3의 위치는" + location);
		System.out.println(list);
		
		for (int i = 0; i < list.size(); i++) { // 2
			int index = list.get(i); 
			numbers[index] = 333.3;
		}
		System.out.println(Arrays.toString(numbers));
	}
}
