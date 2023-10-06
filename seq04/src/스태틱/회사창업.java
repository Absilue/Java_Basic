package 스태틱;

public class 회사창업 {

	public static void main(String[] args) {
		worker work1 = new worker("홍길동", 25, "남");
		worker work2 = new worker("전수진", 24, "여");
		worker work3 = new worker("유미나", 26, "여");
		
		System.out.println("회사 총 직원수는 " + worker.count + "명입니다");
		System.out.println(work1);
		System.out.println(work2);
		System.out.println(work3);
		System.out.println("직원 평균 나이는 " + (worker.sum/worker.count) + "살입니다");
		// System.out.println(worker.ageavg());
	}

}
