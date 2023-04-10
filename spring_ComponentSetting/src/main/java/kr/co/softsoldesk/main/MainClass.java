package kr.co.softsoldesk.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.co.softsoldesk.beans.TestBean1;
import kr.co.softsoldesk.beans.TestBean2;
import kr.co.softsoldesk.beans.TestBean3;
import kr.co.softsoldesk.beans.TestBean4;
import kr.co.softsoldesk.beans.TestBean5;
import kr.co.softsoldesk.config.BeanConfigClass;

public class MainClass {
   
   public static void main(String[] args) {

      AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfigClass.class);
      //type
      System.out.println("-----------------type-------------------");
      TestBean1 t1=ctx.getBean(TestBean1.class);
      System.out.println("t1 : "+t1);
      //Singleton
      TestBean1 t2=ctx.getBean(TestBean1.class);
      System.out.println("t2 : "+t2);
      System.out.println();
      
      
      //이름
      System.out.println("-----------------이름-------------------");
      TestBean2 t3=ctx.getBean("t3",TestBean2.class);
      System.out.println("t3 : "+t3);
      //Singleton
      TestBean2 t4=ctx.getBean("t3",TestBean2.class);
      System.out.println("t4 : "+t4);
      
      //이름으로 여러개 주입
      System.out.println("-----------------이름으로 여러개 주입-------------------");
      TestBean2 t5=ctx.getBean("t5",TestBean2.class);
      System.out.println("t5 : "+t5);
      //Singleton
      TestBean2 t6=ctx.getBean("t6",TestBean2.class);
      System.out.println("t6 : "+t6);
      
		// Lazy 사용하여 생성자 가져오기
		System.out.println("-----------------Lazy 사용하여 생성자 가져오기-------------------");
		TestBean3 t7 = ctx.getBean(TestBean3.class);
		System.out.printf("t7 : %s\n", t7);
		// Singleton이므로 같은 주소 반환
		TestBean3 t8 = ctx.getBean(TestBean3.class);
		System.out.printf("t8 : %s\n", t8);

		// Prototype으로 가져오기
		System.out.println("-----------------Prototype으로 가져오기-------------------");
		TestBean4 t9 = ctx.getBean(TestBean4.class);
		System.out.printf("t9 : %s\n", t9);
		// 서로 다른 주소 반환
		TestBean4 t10 = ctx.getBean(TestBean4.class);
		System.out.printf("t10 : %s\n", t10);

		// @PostConstruct @PreDestroy
		System.out.println("----------------@PostConstruct @PreDestroy-------------------");
		TestBean5 t11 = ctx.getBean(TestBean5.class);
		System.out.printf("t11 : %s\n", t11);
				
       ctx.close();
      
   }
   
}
