package 비선형구조;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

public class 완주하지못한선수 {

	public static void main(String[] args) {

		Solution6 s = new Solution6();
		String[] all = {"leo", "kiki", "eden"};
		String[] com = {"eden", "kiki"};
		String result = s.solution(all, com);
		System.out.println(result);
	}
}

class Solution6 {
    public String solution(String[] s, String[] c) {
    	//1. 참여자 목록을 만든다. 
    			HashMap<String, Integer> list = new HashMap<>();
    			for (int i = 0; i < s.length; i++) {
    				list.put(s[i], list.getOrDefault(s[i], 0) + 1);
    			}
    			System.out.println(list);
    			//2. 완주한 선수한 선수를 체크한다.
    			for (int i = 0; i < c.length; i++) {
    				list.put(c[i], list.get(c[i]) - 1);
    			}
    			//System.out.println(list);
    			
    			//3. 완주하지 못한 선수를 답안으로 작성한다.
    			String answer = "";
    			//hashmap을 꺼낼 때는 함수를 따로써야함.
    			Set keys = list.keySet(); //{"eden", "kiki", "leo"}
    			for (Object key : keys) {
    				if(list.get(key) != 0) {
    					answer = (String)key;
    					break;
    				}
    			}
//    			for (int i = 0; i < s.length; i++) {
//    				if(list.get(s[i]) != 0) {
//    					answer = s[i];
//    					break;
//    				}
//    			}
    			//System.out.println(answer);
    			return answer;
    }
}