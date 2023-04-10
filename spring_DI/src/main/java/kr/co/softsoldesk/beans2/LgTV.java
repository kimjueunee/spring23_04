package kr.co.softsoldesk.beans2;

public class LgTV implements TV{
	
	private int price;
	private AppleSpeaker speaker;
	
	public LgTV() {
		System.out.println("LGTV 객체 생성");
	}

	public LgTV(int price, AppleSpeaker speaker) {
		this.price = price;
		this.speaker = speaker;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
		System.out.println("price : "+price);
	}

	public AppleSpeaker getSpeaker() {
		return speaker;
	}

	public void setSpeaker(AppleSpeaker speaker) {
		this.speaker = speaker;
		System.out.println("speaker : "+speaker);
	}

	public void powerOn() {
		System.out.println("LGTV --- 전원 켠다");
		System.out.println("가격 : "+price);
		
	}

	public void powerOff() {
		System.out.println("LGTV --- 전원 끈다");
		
	}

	public void volumeUp() {
		speaker.volumeUp();
		
	}

	public void volumeDown() {
		speaker.volumeDown();
		
	}

}
