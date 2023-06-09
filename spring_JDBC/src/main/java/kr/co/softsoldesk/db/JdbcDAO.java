package kr.co.softsoldesk.db;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import kr.co.softsoldesk.beans.jdbcBean;

@Component
public class JdbcDAO {
	
	//JDBC 관리 객체를 자동 주입
	@Autowired
	private JdbcTemplate db;
	
	//Mapper 주입=>sql쿼리의 결과값 받기
	@Autowired
	private MapperClass mapper;
	
	//-------------------------------------------
	
	//저장
	public void insert_data(jdbcBean bean) {
		String sql="insert into jdbc_table(int_data, str_data) values(?,?)";
		db.update(sql,bean.getInt_data(), bean.getStr_data());
	}
	
	//검색
	public List<jdbcBean> select_data() {
		String sql="select int_data, str_data from jdbc_table";
		List<jdbcBean> list=db.query(sql, mapper);
		
		return list;
	}
	
	//업데이트
	public void update_data(jdbcBean bean) {
		String sql="update jdbc_table set str_data=? where int data=?";
		db.update(sql, bean.getStr_data(), bean.getInt_data());
	}
	
	//삭제
	public void delete_data(int int_data) {
		String sql="delete from jdbc_table where int_data=?";
		db.update(sql,int_data);
	}
}
