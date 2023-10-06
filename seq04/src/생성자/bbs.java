package 생성자;

public class bbs {
	public int no; // 번호
	public String title; // 제목
	public String content; // 내용
	public String writer; // 작가

	// 객체 생성시 4개의 멤버변수를 초기화하고 싶으면 클래스와 동일한 대문자로 시작하는 메서드 생성
	// 생성자(메서드), CONSTRUCTOIR
	// 객체생성(new)시 자동호출됨
	
	
	
	// 생성자
	public bbs(int no, String title, String content, String writer) {
		this.no = no;
		this.title = title;
		this.content = content;
		this.writer = writer;
	}
	
	// 게시물 정보 출력 메서드
	public void display() {
		System.out.println("번호 : " + no);
		System.out.println("제목 : " + title);
		System.out.println("내용 : " + content);
		System.out.println("작가 : " + writer);
		System.out.println();
	}
}
