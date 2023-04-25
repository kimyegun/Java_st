package ch06.sec08;

public class ComputerExample {

	public static void main(String[] args) {
		// Computer 객체 생성
		
		Computer myCom = new Computer();
		
		int result1 = myCom.sum(1,2,3);
		System.out.println("result: " + result1);
		
		int result2 = myCom.sum(1,2,3,4,5);
		System.out.println("result2: " + result2);
		
		int [] values = {1, 2, 3, 4, 5};
		int result3 = myCom.sum(values);
		System.out.println("result3: " + result3);
		
		int result4 = myCom.sum(new int[] {1,2,3,4,5});
		System.out.println("result4: " + result4);
		
		

	}

}
