package 생성자;

public class 수강신청 {
	public String subject;
	public String time;
	public String name;
	
	public 수강신청(String subject, String time, String name) {
		this.subject = subject;
		this.time = time;
		this.name = name;
	}

	// 멤버 변수들을 toString()으로 재정의
	@Override
	public String toString() {
		return "수강신청 [subject = " + subject + ", time = " + time + ", name = " + name + "]";
	}
}
