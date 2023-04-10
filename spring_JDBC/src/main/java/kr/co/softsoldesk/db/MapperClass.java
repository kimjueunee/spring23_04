package kr.co.softsoldesk.db;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import kr.co.softsoldesk.beans.jdbcBean;

@Component
public class MapperClass implements RowMapper<jdbcBean>{
	
	public jdbcBean mapRow(ResultSet rs, int rowNum) throws SQLException {
		jdbcBean bean=new jdbcBean();
		bean.setInt_data(rs.getInt("int_data"));
		bean.setStr_data(rs.getString("str_data"));
		
		return bean;
	}

}
