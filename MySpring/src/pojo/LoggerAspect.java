package pojo;

import org.aspectj.lang.ProceedingJoinPoint;

public class LoggerAspect {
	public Object log(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
		System.out.println("Start:" + proceedingJoinPoint.getSignature().getName());
		long start = System.currentTimeMillis();
		Object object = proceedingJoinPoint.proceed();
		System.out.println("ÏûºÄÊ±¼ä" + (System.currentTimeMillis() - start) + "ms");
		System.out.println("End:" + proceedingJoinPoint.getSignature().getName());
		return object;
	}
}
