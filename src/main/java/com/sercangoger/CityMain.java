package com.sercangoger;

import java.util.logging.Logger;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cokelek.pojo.BusinessTargetObject;
import com.cokelek.pojo.FonksiyonSinifi;
import com.cokelek.pojo.Profiler;



@SuppressWarnings("deprecation")
public class CityMain {
	
	public static void main(String[] args) {
	
		ConfigurableApplicationContext confCont = new ClassPathXmlApplicationContext("SpringBeanConfig.xml");
			
		FonksiyonSinifi bussin= confCont.getBean(FonksiyonSinifi.class);
		
			bussin.metot1();
		
	}

}
