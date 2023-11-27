package 비선형구조;

import java.util.ArrayList;
import java.util.TreeSet;

public class TreeSet테스트 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(100);
		list.add(500);
		list.add(400);
		list.add(300);
		list.add(200);
		System.out.println(list);
		
		//오름차순 정렬기능 + 중복제거!
		TreeSet<Integer> tree = new TreeSet<Integer>();
		tree.add(100);
		tree.add(500);
		tree.add(400);
		tree.add(300);
		tree.add(200);
		tree.add(200);
		System.out.println(tree);
	}
}