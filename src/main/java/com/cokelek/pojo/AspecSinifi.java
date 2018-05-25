package com.cokelek.pojo;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspecSinifi {

	@Before("execution(* com.cokelek.pojo.FonksiyonSinifi.metot1())")
	public void kimiz(){
		System.out.println("Before : Kimiz Fonksiyonu calisti");
	}
	
	@After("execution(* com.cokelek.pojo.FonksiyonSinifi.metot1())")
	public void nediyon() {
		System.out.println("After : nediyon Fonksiyon calisti");
	}
}
