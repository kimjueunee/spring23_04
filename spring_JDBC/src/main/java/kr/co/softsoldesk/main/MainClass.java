package kr.co.softsoldesk.main;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.co.softsoldesk.beans.jdbcBean;
import kr.co.softsoldesk.config.BeanConfigClass;
import kr.co.softsoldesk.db.JdbcDAO;

public class MainClass {
   
   public static void main(String[] args) {
	   
	   AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(BeanConfigClass.class);
	   
	   JdbcDAO dao=ctx.getBean(JdbcDAO.class);
	   //insert
	   jdbcBean bean1=new jdbcBean();
	   bean1.setInt_data(1);
	   bean1.setStr_data("JAVA");
		/*
		 * bean1.setInt_data(4); bean1.setStr_data("SPRING");
		 */
	   
	   // dao.insert_data(bean1);
	   System.out.println("저장완료");
	   
	   
	   //update
//	   jdbcBean bean3=new jdbcBean();
//	   bean3.setInt_data(3);
//	   bean3.setStr_data("Python");
//	   dao.update_data(bean3);
//	   
	   //delete
	   dao.delete_data(2);
	   
	   //select
	   List<jdbcBean> list=dao.select_data();
	   
	   for(jdbcBean bean2:list) {
		   System.out.println("int_data : "+bean2.getInt_data());
		   System.out.println("str_data : "+bean2.getStr_data());
		   System.out.println("==================================");
	   }
	   
	   ctx.close();

      
   }
   
}
