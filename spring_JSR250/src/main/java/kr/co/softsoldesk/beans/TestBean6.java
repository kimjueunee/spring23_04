package kr.co.softsoldesk.beans;

import javax.annotation.Resource;

public class TestBean6 {
	
	
	@Resource(name="data1")
	private DataBean1 data100;
	
	@Resource(name="data2")
	private DataBean2 data200;
	
	public DataBean1 getData1() {
		return data100;
	}
	
	public DataBean2 getData2() {
		return data200;
	}
	
	

}
