package bean;

public class CompanyDTO {
	private String name;
	private String addr;
	private String tel;
	private String domain;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
	
	@Override
	public String toString() {
		return "CompanyDTO [name=" + name + ", addr=" + addr + ", tel=" + tel + ", domain=" + domain + "]";
	}
	
}
	
	
	
