package com.codewnw.jm3190309.endtoend.aspect;

import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import com.codewnw.jm3190309.endtoend.model.Person;

@Component
@Aspect
public class LoggingAspect {

	@Pointcut("execution (* com.codewnw.jm3190309.endtoend.rest.PersonRestController.getPerson(..))")
	public void getPersonMethod() {
	}

	@Pointcut("execution (* com.codewnw.jm3190309.endtoend.*.*.*(..))")
	public void allMethodsInRestPackage() {
	}

	@Pointcut("execution (* com.codewnw.jm3190309.endtoend.*.*.get*(..))")
	public void getMethodsInRestPackage() {
	}

//	@Before(value = "getPersonMethod()")
	@Before(value = "allMethodsInRestPackage()")
	public void runningBeforeGetPersonMethod(JoinPoint joinPoint) {
		System.out.println(
				">> " + joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName());
	}

//	@After(value = "getPersonMethod()")
	@After(value = "allMethodsInRestPackage()")
	public void runningAfterGetPersonMethod(JoinPoint joinPoint) {
		System.out.println(
				"<< " + joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName());
	}

	@AfterReturning(value = "getMethodsInRestPackage()", returning = "retrunValue")
	public void runningAfterGetPersonMethod2(Object retrunValue) {
		if (retrunValue instanceof Person) {
			System.out.println((Person) retrunValue);
		}else if(retrunValue instanceof List) {
			List<Person> persons = (List<Person>)retrunValue;
			System.out.println(persons);
		}
	}
	
	@AfterThrowing(value = "getMethodsInRestPackage()", throwing = "ex")
	public void runningAfterGetPersonMethod2(Exception ex) {
		System.out.println(ex.getMessage());
	}
	
	@Around(value = "getPersonMethod()")
	public Object abc(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
		System.out.println(">> Around");
		Object obj = proceedingJoinPoint.proceed();
		if(obj instanceof Person) {
			Person p = (Person)obj;
			p.setName("Sachin Tendulkar");
		}
		return obj;
	}

}
