package kr.co.softsoldesk.beans;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class TestBean4 {

}
//IOC 컨테이너 객체를 생성할때 자동으로 객체가 생성
//기본형은 타입 주입
