package kr.co.softsoldesk.beans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy //getBean으로 호출할때 객체가 생김
public class TestBean3 {

}
//IOC 컨테이너 객체를 생성할때 자동으로 객체가 생성
//기본형은 타입 주입
//Singleton으로 주입되며 config에 @Bean으로 등록한것과 같다
//하나만 생성하여 사용할 경우 type이 효율적
//이름으로 주입할 경우 식별자 역할을 하지만 BeanConfigClass에 여러개를 주입하여 사용하는
//것이 바람직 그러므로 이름 주입은 잘 사용되진 않는다