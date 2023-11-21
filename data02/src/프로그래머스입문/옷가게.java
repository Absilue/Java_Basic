package 프로그래머스입문;

public class 옷가게 {
	public static void main(String[] args) {
		int price = 580000;
		Solution10 s = new Solution10();
		int result = s.solution(price);
		System.out.println(result);
	}
}

class Solution10 {
	public int solution(int price) {
		int answer = 0;
		if(price >= 500000) {
			answer = (int)(price - price * 0.2);
		}else if(price >= 300000){
			answer = (int)(price - price * 0.1);
		}else if(price >= 100000){
			answer = (int)(price - price * 0.05);
		}else {
			answer = price;
		}
		return answer;
	}
}
