package kr.co.softsoldesk.beans;

import kr.co.softsoldesk.beans2.TV;

public class SamsungTV implements TV{
   
   private int price;
   private SonySpeaker speaker;
   
   public SamsungTV() {
      System.out.println("===> SamsungTV 객체 생성");
   }
   
   public SamsungTV(SonySpeaker speaker) {
      System.out.println("===> SamsungTV(2) 객체 생성");
      this.speaker = speaker;
   }
   
   public SamsungTV(int price, SonySpeaker speaker) {
      System.out.println("===> SamsungTV(3) 객체 생성");
      this.price = price;
      this.speaker = speaker;
   }

   public void powerOn() {
     System.out.println("SamsungTV --- 전원 켠다");
     System.out.println("가격 : "+price);	
      
   }
   public void powerOff() {
	   System.out.println("SamsungTV --- 전원 끈다");
      
   }
   public void volumeUp() {
       speaker.volumeUp();
      
   }
   public void volumeDown() {
     speaker.volumeDown();
      
   }
   
}