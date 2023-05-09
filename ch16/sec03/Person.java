package ch16.sec03;

import ch16.sec02.exam01.Workable;

public class Person {
	public void action1(Workable workable) {
		workable.work("홍길동","프로그래밍");
	}
	
	public void action2(Speakable speakable) {
		speakable.speak("안녕하세요");
	}

}
