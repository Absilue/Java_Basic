package 메서드기본;

public class 계산유틸리티 {
	public static void main(String[] args) {
		double num1 = 567.8998;
		double num2 = -567.8998;
		
		System.out.println(Math.abs(num2));
		// abs는 절대값
		System.out.println(Math.ceil(num2));
		// ceil은 뒤에 소수점 무조건 올림
		System.out.println(Math.floor(num2));
		// floor는 뒤에 소수점을 무조건 버림
		System.out.println(Math.round(num2));
		// round는 뒤에 소수점을 반올림해서 처리
		System.out.println(Math.sqrt(num1));
		// sqrt는 ( ) 안의 값에 루트를 씌움
		
		// 유틸리티(utility, util) - java.util.*;
		// ex) Date, Random
		
		// 핵심 유틸리티 (자주 사용되는 유틸) - java.lang.*;
		//	ex)  System, String, Math 
		// 눈에는 보이지 않지만 이미 import 되어 있음
	}
}
