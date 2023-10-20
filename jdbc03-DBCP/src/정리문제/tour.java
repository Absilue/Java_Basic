package 정리문제;

public class tour {
	public String [] 가고싶은여행지목록 () {
		String [] list = {"제주도", "부산", "울릉도"};
		return list;
 	}
	
	public String 제일가고싶은여행지 () {
		String s = "울릉도";
		return s;
	}
	
	public int 여행지경비(int count, int price) {
		int total = count * price;
		return total;
	}
}
