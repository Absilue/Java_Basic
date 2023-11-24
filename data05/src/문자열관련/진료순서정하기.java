package 문자열관련;

public class 진료순서정하기 {
	public static void main(String[] args) {
		Solution10 s = new Solution10();
		
	}
}

class Solution10 {
	public int [] solution(int[] emergency) {
		int[] answer = new int[emergency.length];
		for (int i = 0; i < emergency.length; i++) {
			answer[i] = 1;
		}
		
		for (int i = 0; i < answer.length; i++) {
			for (int j = 0; j < answer.length; j++) {
				if(emergency[i] < emergency[j]) {
					answer[i]++;
				}
			}
		}
		return answer;
	}
}
