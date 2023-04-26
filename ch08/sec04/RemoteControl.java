package ch08.sec04;

public interface RemoteControl {
	int MAX_VOLUM = 10;
	int MIN_VOLUM = 0;
	
	//추상 메소드
	void turnOn();
	void turnOff();
	void setVolume(int volume);
}
