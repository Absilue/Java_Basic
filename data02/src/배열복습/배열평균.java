package 배열복습;

public class 배열평균 {
	
	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		Solution s = new Solution();
		double result = s.solution(numbers);
		System.out.println(result);
	}
}

class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        int sum = 0;
        for (int x : numbers) {
			sum = sum + x;
		}
        answer = (double)sum / numbers.length;
        return answer;
    }
}