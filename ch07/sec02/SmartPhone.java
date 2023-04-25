package ch07.sec02;

public class SmartPhone extends Phone {
	
	public boolean wifi;

	public SmartPhone(String model, String color) {
		super(model, color);
		this.model = model;
		this.color = color;
		
	}

	public void SetWifi (boolean wifi) {
		this.wifi = wifi;
		System.out.println("와이파이 상태를 변경했습니다.");
	}
	public void internet() {
	System.out.println("전화를 끝습니다.");

}
}
