package aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggerAspect2 {
	@Around(value = "execution(* service.ProductService2.*(..))")
	public Object log(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
		System.out.println("start:" + proceedingJoinPoint.getSignature().getName());
		long start = System.currentTimeMillis();
		Object object = proceedingJoinPoint.proceed();
		System.out.println("ÏûºÄÊ±¼ä" + (System.currentTimeMillis() - start) + "ms");
		System.out.println("end:" + proceedingJoinPoint.getSignature().getName());
		return object;
	}
}
