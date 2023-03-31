package kr.co.softsoldesk.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

import kr.co.softsoldesk.beans.TV;

public class TVMain {

   public static void main(String[] args) {
      
//      ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/co/softsoldesk/config/beans.xml");
//      
//      TV tv1 = (TV)ctx.getBean("tv1");
//      TV tv2 = (TV)ctx.getBean("tv2");
//      
//      System.out.println("===SamsungTV===");
//      control(tv1);
//      System.out.println("===SoldeskTV===");
//      control(tv2);
//      
//      ctx.close();
//      
//      
//      
//   }
//
//   public static void control(TV v) {
//      
//      v.powerOn();
//      v.powerOff();
//      v.volumeUp();
//      v.volumeDown();
//  
	   //Spring 컨테이너 구동
	   //AbstractApplicationContext:BeanFactory+ApplicationContext
	   //GenericApplicationContext:파일과 클래스 관리 설정(xml)
	   AbstractApplicationContext ctx=new GenericApplicationContext();
	   //컨테이너로부터 필요한 객체를 요청
	   TV tv=(TV)ctx.getBean("tv1");//tv2
	   tv.powerOn();
	   tv.powerOff();
	   tv.volumeUp();
	   tv.volumeDown();
	   
	   ctx.close();
   }	   
}