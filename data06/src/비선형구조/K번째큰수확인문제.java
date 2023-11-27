package 비선형구조;

import java.util.Arrays;
import java.util.TreeSet;

public class K번째큰수확인문제 {

	public static void main(String[] args) {
		int[] n1 = {22, 33, 66, 11, 10, 15};
		System.out.println(Arrays.toString(n1));
		Arrays.sort(n1);
		System.out.println(Arrays.toString(n1));
		System.out.println(n1.length);
		System.out.println(n1[n1.length-1]);
		System.out.println(n1[n1.length-2]);
		//System.out.println(n1[n1.length-k]);
		
		int k = 3;
		int arr[] = {22, 22, 44, 11, 11, 33, 55, 66, 20, 10, 30, 55};
		TreeSet<Integer> tree = new TreeSet<Integer>();
		for (int i = 0; i < arr.length; i++) {
			tree.add(arr[i]);
		}
		System.out.println(tree);
		System.out.println(tree.size());
		System.out.println(tree.first());//제일작은거 
		System.out.println(tree.last());//제일큰수 
		System.out.println(tree.lower(20));
		System.out.println(tree.higher(20));
		Object[] arr2 = tree.toArray();
		System.out.println(arr2[arr2.length-k]);
	}
}
