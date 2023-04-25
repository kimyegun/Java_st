package ch06.sec07.exam04;

public class Car {
	
	//필드 선언
	String company = "현대자동차";
	String model;
	String color;
	int maxspeed;
	
	//생성자 선언
	Car() {}
	
	public Car(String model) {
		this.model = model;
	}

	public Car(String model, String color) {
		super();
		this.model = model;
		this.color = color;
	}

	public Car(String model, String color, int maxspeed) {
		super();
		this.model = model;
		this.color = color;
		this.maxspeed = maxspeed;
	}
	
	
	

}
