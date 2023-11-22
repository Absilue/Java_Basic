package 배열복습;

import java.util.Arrays;
import java.util.Scanner;

public class 아이스아메리카노 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		
		Solution3 s = new Solution3();
		int[] result = s.solution(num1);
		 System.out.println(Arrays.toString(result));
		sc.close();
	}
}

class Solution3 {
    public int[] solution(int money) {
    	int price = 5500;
    	int coffee = money / price;
        int[] answer = {coffee, money - (coffee*price)};
        return answer;
    }
}