package ch16.sec02.exam02;

public class ButtonExample {

	public static void main(String[] args) {
		//ok 버튼 객체 생성
		Button btnOk = new Button();
		
		//Ok 버튼 객체에 람다식(ClickListener 익명 구현 객체) 주입
		
		btnOk.setClickListener(()-> {
			System.out.println("Ok 버튼을 클릭했습니다.");
		});
		
		//Ok 버튼 클릭하기
		btnOk.click();
		
		//Cancel 버튼 객체 생성
		Button btnCancel = new Button();
		
		btnCancel.setClickListener(()-> {
			System.out.println("Cancel 버튼을 클릭했습니다.");
		});
		btnCancel.click();
	}

}
