package 비선형구조;

public class 이차원배열 {

	public static void main(String[] args) {
		int[][] num = new int[3][]; // 3은 행, 열은 미정!
		// { 
		//	{0,0,0},
		// 	{0,0,0},
		// 	{0,0,0} 
		// }
		// 2차원 배열 ==> 1차원 배열의 결합
		// {
		// 	{0,0,0},
		// 	{0,0},
		// 	{0,0,0,0,0}
		// }
		int[] row1 = { 2, 5, 3 }; // 3
		int[] row2 = { 1, 2 }; // 2
		int[] row3 = { 5, 4, 3, 2, 1 }; // 5
		num[0] = row1;
		num[1] = row2;
		num[2] = row3;
		for (int i = 0; i < num.length; i++) { // 3줄, 행개수  
			// 2차원 배열의 각 행의 열개수를 따로 세주어야 한다.
			for (int j = 0; j < num[i].length; j++) {//열개수 
				System.out.print(num[i][j]);
			}
			System.out.println();
		}
		//일차원 배열은 for문 하나만 필요! ==>i가 열계산용
		//이차원 배열은 for문 2개가 필요!
		//==> i는 행계산용, j는 한 행당 열계산용
		//프린트해보세요.!
		System.out.println(num[0][num[0].length - 1]);
		System.out.println(num[1][num[1].length - 1]);
		System.out.println(num[2][2]);
	}
}