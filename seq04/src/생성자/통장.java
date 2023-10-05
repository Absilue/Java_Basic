package 생성자;

public class 통장 {
	public String name; // 이름
	public String num; // 주민번호
	public int money; // 통장잔고
	
	public  통장(String name, String num, int money) {
		this.name = name;
		this.num = num;
		this.money = money;
	}
}
