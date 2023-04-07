package kr.co.softsoldesk.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

public class TestBean1 {
	
	private int data1;
	private DataBean1 data2;
	//자동 주입을 변수에 설정한다.getter만 추가
	//자동으로 setter메서드가 추가되어 setter로 주입을 완료함
	@Autowired
	private DataBean1 data3;
	
	@Autowired
	@Qualifier("obj4") //정의되어 있지 않으면 obj5와 같은 주소로 인식하여 ERROR 발생
	private DataBean2 data4;
	
	@Autowired
	@Qualifier("obj5")
	private DataBean2 data5;
	
	//required=false : DataBean2라는 클래스가 없으면 무시 있으면 자동주입
	@Autowired(required=false)
	@Qualifier("obj6")
	private DataBean2 data6;

	//=============================================================

	public int getData1() {
		return data1;
	}
	//@Required는 5.0이상에서는 지향아므로 생성자를 통하여 필수 속성 주입을 권장함
	/*
	 * public TestBean1(int data1) { this.data1=data1; }
	 */

	@Required //반드시 주입해야하는 속성 스프링버젼 5.0이하에서만 가능
	public void setData1(int data1) {
		this.data1 = data1;
	}

	public DataBean1 getData2() {
		return data2;
	}

	public void setData2(DataBean1 data2) {
		this.data2 = data2;
	}

	public DataBean1 getData3() {
		return data3;
	}

	public void setData3(DataBean1 data3) {
		this.data3 = data3;
	}

	public DataBean2 getData4() {
		return data4;
	}

	public void setData4(DataBean2 data4) {
		this.data4 = data4;
	}

	public DataBean2 getData5() {
		return data5;
	}

	public void setData5(DataBean2 data5) {
		this.data5 = data5;
	}

	public DataBean2 getData6() {
		return data6;
	}

	public void setData6(DataBean2 data6) {
		this.data6 = data6;
	}
	
	
	

}
