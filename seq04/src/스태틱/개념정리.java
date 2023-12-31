package 스태틱;

public class 개념정리 {
	//	1. 생성자는 왜(언제) 쓰는가?
	//	>> 생성자는 객체를 초기화하고 생성할때 사용
	//      객체가 생성될 때 필요한 초기화 작업을 수행하기 위해 생성자를 사용
	//		  객체 생성시 처리하고 싶은 내용을 넣을 때(멤버 변수 초기화)

	//	2. 생성자는 메서드이다
	//	>> O

	//	3. 생성자는 반드시 클래스이름과 동일해야 한다
	//	>> O

	//	4. 생성자는 동일한 이름으로 여러개 만들 수 있다
	//	>> O
	
	//	5. 생성자를 여러개 만들 수 있다고 한다면 조건은?
	//	>> 생성자의 매개변수 목록을 서로 다르게 정의해야함
	// 	 (입력 파라메터가 달라야 함 - 타입, 순서, 개수)
		
	//	6. 생성자를 나타내는 영어는?
	//	>> Constructor

	//	7. 생성자를 제공하는 입력값으로만 객체를 생성할 수 있다
	//	>> O

	//	8. static은 실행시 객체를 생성하지 않아도 언제든 접근이 가능하다
	//	>> O

	//	9. static 메서드는 객체를 생성한 후, 메서드에 접근이 가능하다
	//	>> X 객체를 생성하지 않아도, 클래스 이름을 통해 메서드에 접근 가능

	//	10. 일반 메서드와 static 메서드의 차이점은 객체생성 여부이다
	//	>> O 일반 매서드는 객체를 생성한 후에 호출이 가능하지만, static 메서드는 그럴 필요 X

	//	11. static 변수와 instance 변수와의 차이점, 같은점을 각각 쓰시오
	//	>> 차이점 - static 변수는 모든 개체가 하나의 값을 공유
	//					  instance 변수는 객체마다 별도의 값을 가짐
	//	>> 같은점 - class에 속한 멤버 변수, 클래스 or 객체 내부에서 사용됨
	
	//	12. static 변수가 위치하는 T자형 메모리의 위치는?
	//	>> 원본 영역, 메서드 영역, ㄴㄴ

	//	13. 다음 오른쪽과 같이 객체 생성시 생서되는 힙영역의 메모리 크기를 구하시오.
	//		  원본 영역의 전역변수의 메모리 크기를 구하시오.
	//		  public class Car{
	//		 	Car c = new Car(100, 1000);
	//		 	int size;
	//		 	int price;
	//		 	static int count;
	//		 	static final PI = 3.14;		 	
	//	}
	//	>> =힙영역=
	//      static 변수인 count와 PI는 객체가 생성될 때 새로운 메모리 할당 X
	//      size와 price만 int란 변수타입을 가지므로 4+4 = 8byte
	
	//      =원본 영역=
	//		  모든 전역변수를 계산 => size price count PI => 20byte
}
