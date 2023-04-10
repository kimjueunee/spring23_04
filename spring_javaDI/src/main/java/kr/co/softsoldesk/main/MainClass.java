package kr.co.softsoldesk.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.softsoldesk.beans.TestBean1;
import kr.co.softsoldesk.beans.TestBean2;
import kr.co.softsoldesk.beans.TestBean3;
import kr.co.softsoldesk.beans.TestBean4;
import kr.co.softsoldesk.config.BeanConfigClass;

public class MainClass {
   
   public static void main(String[] args) {
      
      System.out.println("===============XML===============");
      ClassPathXmlApplicationContext ctx1 = new ClassPathXmlApplicationContext("kr/co/softsoldesk/config/beans.xml");
      
      System.out.println("객체 메모리 할당 받기");
      TestBean1 xml1 = ctx1.getBean("xml1", TestBean1.class);
      System.out.println("xml1 : " + xml1);
      
      System.out.println("객체 메모리 싱글톤");
      TestBean1 xml11 = ctx1.getBean("xml1", TestBean1.class);
      System.out.println("xml11 : " + xml11);
      System.out.println();
      
      System.out.println("lazy-init값이 true이므로 호출 시 생성자 반환");
      TestBean2 xml2 = ctx1.getBean("xml2", TestBean2.class);
      System.out.println("xml2 : " + xml2);
      TestBean2 xml22 = ctx1.getBean("xml2", TestBean2.class);
      System.out.println("xml22 : " + xml22);
      System.out.println();
      
      System.out.println("prototype값이 true이므로 호출 시 생성자 반환");
      TestBean3 xml3 = ctx1.getBean("xml3", TestBean3.class);
      System.out.println("xml3 : " + xml3);
      TestBean3 xml33 = ctx1.getBean("xml3", TestBean3.class);
      System.out.println("xml33 : " + xml33);
      System.out.println();
      
      ctx1.close();
      System.out.println();
      
      System.out.println("===============JAVA===============");
      AnnotationConfigApplicationContext ctx2 = new AnnotationConfigApplicationContext(BeanConfigClass.class);
      
      System.out.println("객체 메모리 할당 받기");
      TestBean1 java1 = ctx2.getBean("java1", TestBean1.class);
      System.out.println("java1 : " + java1);
      
      System.out.println("객체 메모리 싱글톤");
      TestBean1 java11 = ctx2.getBean("java1", TestBean1.class);
      System.out.println("java11 : " + java11);
      System.out.println();
      
//      System.out.println("메서드 이름으로 객체 받기");
//      TestBean1 java500 = ctx2.getBean("java500", TestBean1.class);
//      System.out.println("java500 : " + java500);
      
      System.out.println("Annotation name으로 객체 받기");
      TestBean1 java600 = ctx2.getBean("java600", TestBean1.class);
      System.out.println("java600 : " + java600);
      System.out.println();
      
      System.out.println("lazy-init값이 true이므로 호출 시 생성자 반환");
      TestBean2 java2 = ctx2.getBean("java2", TestBean2.class);
      System.out.println("java2 : " + java2);
      TestBean2 java22 = ctx2.getBean("java2", TestBean2.class);
      System.out.println("java22 : " + java22);
      System.out.println();
      
      System.out.println("prototype값이 true이므로 호출 시 생성자 반환");
      TestBean3 java3 = ctx2.getBean("java3", TestBean3.class);
      System.out.println("java3 : " + java3);
      TestBean3 java33 = ctx2.getBean("java3", TestBean3.class);
      System.out.println("java33 : " + java33);
      System.out.println();
      
      System.out.println("-Primary=true : 클래스 중복시 사용하여 정상값 가져오기");
      TestBean4 java4 = ctx2.getBean("java4", TestBean4.class);
      System.out.println("java4 : " + java4);
      System.out.println();
      
      ctx2.close();
      
   }
   
}
