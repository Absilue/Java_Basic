package 배열기본;

public class 배열만들기_타입별로 {

	public static void main(String[] args) {
		// int, char, String, Jbutton, double, boolean
		int [] age = { 200, 150, 100, 10};
		// 4개 고정
		for (int x : age) {
			System.out.println(x + " ");
		}
		System.out.println();
		
		double [] weight = {99.9, 78.5, 88.2,  60.4};
		for (int i = 0; i < weight.length; i++) {
			System.out.println(weight[i] + " ");
		}
		System.out.println();
		for (double  d : weight) {
			System.out.println(d + " ");
		}	
		System.out.println();
			
		// 이름 =>> String [] name
		String [] name = {"최영태", "양민주", "장태훈", "임정원"};
		// String은 " "사용
		for (int j = 0; j < name.length; j++) {
			System.out.println(name[j] + " ");
		}
		System.out.println();

		// 성별 =>> char [] gender
		char [] gender = {'남', '여', '남', '여'};
		for (char g : gender) {
			System.out.println(g + " ");
		}
		// char는 ' ' 사용
		System.out.println();
		
		// 아침여부 =>> boolean [] food
		boolean [] food = {true, false, false, true};
		for (boolean t : food) {
			System.out.println(t + " ");
		}
		
		}
}

