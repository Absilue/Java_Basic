package 부품사용하기;

import 부품만들기.애완동물;
import 부품만들기.전등;
import 부품만들기.전화기;

public class 내방만들기 {

	public static void main(String[] args) {
		전화기  phone = new 전화기();
		phone.카톡();
		
		전등 light = new 전등();
		light.스탠드();
		
		애완동물 pet = new 애완동물();
		pet.강아지();
	}

}
