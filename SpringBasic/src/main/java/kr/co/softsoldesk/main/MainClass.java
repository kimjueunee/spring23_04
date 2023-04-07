package kr.co.softsoldesk.main;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

import kr.co.softsoldesk.beans.TestBean;

public class MainClass {

	public static void main(String[] args) {
//		test1();
//		test2();
		test3();
	}
	
	public static void test1() {
		//경로지정 객체
		ClassPathResource res=new ClassPathResource("kr/co/softsoldesk/config/beans.xml");
		//경로지정 객체를 xml생성
		XmlBeanFactory factory=new XmlBeanFactory(res);
		TestBean t1=factory.getBean("t1",TestBean.class);
		System.out.println("t1 : "+t1);
		TestBean t2=factory.getBean("t2",TestBean.class);
		System.out.println("t2 : "+t2);
	}
	
	public static void test2() {
		//외부 패키지
		FileSystemResource res=new FileSystemResource("beans.xml");
		//경로지정 객체를 xml생성
		XmlBeanFactory factory=new XmlBeanFactory(res);
		TestBean t1=factory.getBean("t2",TestBean.class);
		System.out.println("t1 : "+t1);
		TestBean t2=factory.getBean("t2",TestBean.class);
		System.out.println("t2 : "+t2);
	}
	//test1()의 확장코드
	public static void test3() {
		//자동으로 생성자 생성
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("kr/co/softsoldesk/config/beans.xml");
		TestBean t1=ctx.getBean("t1",TestBean.class);
		System.out.println("t1 : "+t1);
		TestBean t2=ctx.getBean("t1",TestBean.class);
		System.out.println("t2 : "+t2);
		//ctx.close();
	}
	//test2()의 확장코드
	public static void test4() {
		//외부 패키지
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");
		ctx.close();
	}
}
