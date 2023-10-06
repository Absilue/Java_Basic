package 스태틱;

public class worker {

	public String name;
	public int age;
	public String sex;
	public static int count;
	public static int sum;
	
	
	public  worker(String name, int age, String sex) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		count++;
		sum = sum + age;
	}


	@Override
	public String toString() {
		return "[이름 = " + name + ", 나이 = " + age + ", 성별 = " + sex + "]";
	}
	
	// 평균 나이를 구하는 메서드
	public static int ageavg() {
		// static 메서드 안에 instance한 변수를 사용하면 에러가 발생
		// --> static 메서드 안에서는 static 변수만 사용해야 함
		return sum  / count;
	}
}
