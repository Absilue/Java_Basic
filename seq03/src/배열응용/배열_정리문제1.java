package 배열응용;

public class 배열_정리문제1 {

	public static void main(String[] args) {
		int [] a = new int [1000];
		a[0] = 1000;
		a[1] = 2000;
		a[2] = 3000;
		a[a.length-1] = 5000;
		
		for (int i : a) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		System.out.println();

		double [] b = new double [300];
		b[0] = 10.1;
		b[1] = 20.2;
		b[2] = 30.2;
		b[b.length-1] = 50.5;
		
		for(double i : b) {
			System.out.print(i + " ");
		}
	}

}
