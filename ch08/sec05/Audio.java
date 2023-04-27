package ch08.sec05;

public class Audio implements RemoteControl {
	
	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("Audio를 켭니다.");
	}
	
	@Override
	public void turnOff() {
		System.out.println("Audio를 끕니다.");
	}
	
	@Override
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUM) {
			this.volume = RemoteControl.MAX_VOLUM;
		} else if(volume<RemoteControl.MIN_VOLUM) {
			this.volume = RemoteControl.MIN_VOLUM;
		} else {
			System.out.println("현재 Audio 볼륨" + this.volume);
		}
	}

}
	
