package 생성자;

public class bbs사용 {

	public static void main(String[] args) {
		
		bbs bbs1 = new bbs(1, "java", "fun java", "park");
		bbs bbs2 = new bbs(2, "jsp", "fun jsp", "hong");
		bbs bbs3 = new bbs(3, "spring", "fun spring", "kim");

		bbs1.display();
		bbs2.display();
		bbs3.display();
	}

}
