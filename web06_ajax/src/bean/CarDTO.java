package bean;

public class CarDTO {
	private String id;
	private String email;
	private String car;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String getCar() {
		return car;
	}
	public void setCar(String car) {
		this.car = car;
	}
	
	@Override
	public String toString() {
		return "CarDTO [id=" + id + ", email=" + email + ", car=" + car + "]";
	}
}
