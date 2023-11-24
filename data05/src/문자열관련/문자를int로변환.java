package 문자열관련;

public class 문자를int로변환 {

	public static void main(String[] args) {
		char c = '1';
		System.out.println(c - '0'); //아스키 코드 이용 
		
		int x = Integer.parseInt(c + "");
		System.out.println(x + 1);

		//String --> int
		//char --> int
		//1) 아스키 코드 ==> c - '0'
		//2) Integer.parseInt(c + "")
	}

}
