package kr.co.softsoldesk.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import kr.co.softsoldesk.beans.jdbcBean;

public interface MapperInterface {
	//컬럼(오라클)명과 Bean의 변수이름이 같으면 생략
	/*@Results({
		@Result(colume="int_data", property="int_data"),
		@Result(colume="str_data", property="str_data")
	})*/
	
	@Insert("insert into jdbc_table (int_data, str_data) values (#{int_data}, #{str_data})")
	   void insert_data(jdbcBean bean);
	
	@Select("select int_data, str_data from jdbc_Table")
	List<jdbcBean> select_Data();
	
	@Update("update jdbc_table set str_data = #{str_data} where int_data = #{int_data}")
	void update_data(jdbcBean bean);    

	@Delete("delete from jdbc_table where int_data = #{abc}")
	void delete_data(int int_data);
}
