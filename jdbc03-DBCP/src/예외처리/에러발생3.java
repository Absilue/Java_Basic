package 예외처리;

public class 에러발생3 {
	public void call() throws Exception {
		// throws Exception ==> 메서드를 만든 곳에서 예외 처리를 하는것이 아니라
		// 이 메서드를 부른곳에서 각각 알아서 예외 처리를 하도록 떠넘김
			System.out.println(3/0);
	}
}
