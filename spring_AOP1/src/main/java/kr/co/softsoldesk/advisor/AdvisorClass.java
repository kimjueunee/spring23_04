package kr.co.softsoldesk.advisor;

import org.aspectj.lang.ProceedingJoinPoint;

public class AdvisorClass {
	
	public void beforMethod() {
		System.out.println("beforeMethod 호출");
	}
	
	public void afterMethod() {
		System.out.println("afterMethod 호출");
	}
	
	public Object aroundMethod(ProceedingJoinPoint pjp) throws Throwable {
		
		
		
		Object obj=pjp.proceed();
		
		return obj;
		
	}
	
	public int aroundIntMethod(ProceedingJoinPoint pjp) throws Throwable {
		
		int a1=(Integer)pjp.proceed();
		
		System.out.println("aroundIntMethod 호출2");
		
		return a1;
		
	}
	
	//정상적으로 끝났을 때
	public void afterReturningMethod() {
		System.out.println("afterReturningMethod 메소드 => 정상종료");
	}
	
	//예외가 발생할때 실행되는 메서드
	public void afterThrowingMethod() {
		System.out.println("afterThrowingMethod 메소드 => 예외발생");
	}


}
