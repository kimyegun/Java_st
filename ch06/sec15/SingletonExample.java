package ch06.sec15;

public class SingletonExample {

	public static void main(String[] args) {
		// 싱글톤
		
		Singleton obj1 = Singleton.getInstancer();
		Singleton obj2 = Singleton.getInstancer();
		
		if(obj1 == obj2) {
			
			System.out.println("같은 Singleton 객체입니다.");
		} else {
			System.out.println("다른 Singleton 객체입니다.");
		}

	}

}

