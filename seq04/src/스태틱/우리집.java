package 스태틱;

public class 우리집 {
	public static void main(String[] args) {
		딸 d1 = new 딸("우미나", "여");
		딸 d2 = new 딸("우미영", "여");
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(딸.count + "명");
		System.out.println("지갑에 남아있는 돈은 " + 딸.wallet +"원 입니다");
	}
}
