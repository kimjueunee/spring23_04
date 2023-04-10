package kr.co.softsoldesk.main;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.co.softsoldesk.beans.jdbcBean;
import kr.co.softsoldesk.config.BeanConfigClass;
import kr.co.softsoldesk.mapper.MapperInterface;

public class MainClass {
   
   public static void main(String[] args) {
	   
	   AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(BeanConfigClass.class);
	   
	   MapperInterface mapper=ctx.getBean("test_mapper",MapperInterface.class);
	   /*
	   //insert
	   jdbcBean bean2=new jdbcBean();
	   bean2.setInt_data(12);
	   bean2.setStr_data("Project Setting");
	   mapper.insert_data(bean2);
	   System.out.println("저장 완료");
	   */
	   
	   //select
	   List<jdbcBean> list=mapper.select_Data();
	   for(jdbcBean bean1:list) {
		   System.out.println("int_data : "+bean1.getInt_data());
		   System.out.println("str_data  : "+bean1.getStr_data());
		   System.out.println("----------------------------------");
	   }
	   
	   	//update
	   	jdbcBean bean3 = new jdbcBean();
		bean3.setInt_data(100);
		bean3.setStr_data("문자열300");
		mapper.update_data(bean3);   
		
		//delete
		mapper.delete_data(100);    
		
	   
	   ctx.close();

      
   }
   
}
