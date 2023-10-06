package 스태틱;

public class 나의일과 {

	public static void main(String[] args) {
		Day day1 = new Day("자바공부", 10, "강남");
		System.out.println(Day.count);
		Day day2 = new Day("여행", 14, "제주");
		System.out.println(Day.count);
		Day day3 = new Day("운동", 3, "강북");
		System.out.println(Day.count);
		
		System.out.println(day1);
		System.out.println(day2);
		System.out.println(day3);
		
		
		System.out.println("총 일한 시간은 " +Day.sum + "시간");
		System.out.println("평균 일한 시간은 " + (Day.sum/Day.count)+ "시간");
		
	}

}
