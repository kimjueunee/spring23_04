package kr.co.softsoldesk.main;

import java.util.List;
import java.util.Map;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.softsoldesk.beans3.CollectionBean;
import kr.co.softsoldesk.beans3.DataBean;
import kr.co.softsoldesk.beans3.TestBean;

public class MainClass3 {
	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("kr/co/softsoldesk/config/beans3.xml");
		
		TestBean t1=ctx.getBean("t1",TestBean.class);
		
		List<String> list1=t1.getList1();
		for(String str:list1) {
			System.out.println("list1 : "+str);
		}
		System.out.println("----------------------------------");
		List<Integer> list2=t1.getList2();
		for(Integer value:list2) {
			System.out.println("list2 : "+value);
		}
		System.out.println("-----------------------------------------------");
		List<DataBean> list3=t1.getList3();
		for(DataBean obj:list3) {
			System.out.println("list3 : "+obj);
		}
		System.out.println("----------------");
		
		Map<String,Object> map1=t1.getMap1();
		String a1=(String)map1.get("a1");
		Integer a2=(Integer)map1.get("a2");
		DataBean a3=(DataBean)map1.get("a3");
		DataBean a4=(DataBean)map1.get("a4");
		List<String> a5=(List<String>)map1.get("a5");
		
		System.out.println("a1 : "+a1);
		System.out.println("a2 : "+a2);
		System.out.println("a3 : "+a3);
		System.out.println("a4 : "+a4);
		
		for(String str:a5) {
			System.out.println("a5 : "+str);
		}
		
		System.out.println("----------응용------------");
		CollectionBean addr=ctx.getBean("addr",CollectionBean.class);
		List<String> addrlist=addr.getAddressList();
		for(String str:addrlist) {
			System.out.println("addrlist : "+str);
		}
		
		ctx.close();
		
		
	}

}
