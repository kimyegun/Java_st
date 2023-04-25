package ch06.sec08;

public class Computer {

	//가변길이
	int sum(int ... values) {
		
		int sum =0;
		
		for (int i = 0; i< values.length; i++) {
			sum+= values[i];
		}
		
		return sum;
	}
}
