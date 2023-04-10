package kr.co.softsoldesk.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.softsoldesk.beans.TestBean1;

public class MainClass {
   
   public static void main(String[] args) {

      ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("kr/co/softsoldesk/config/beans.xml");
     
      TestBean1 xml1=ctx.getBean("xml1", TestBean1.class);
      
      xml1.method1();
      System.out.println("--------------------------------------------");
      
      xml1.method1(100);
      System.out.println("--------------------------------------------");
      
      xml1.method1("soldesk");
      System.out.println("--------------------------------------------");
      
      xml1.method1(100, 200);
      System.out.println("--------------------------------------------");
      
      xml1.method1(100, "soft");
      System.out.println("--------------------------------------------");
      
      ctx.close();
      
   }
   
}
