package com.cokelek.pojo;

import org.springframework.stereotype.Component;

@Component
public class BusinessTargetObject {

	
	public String performTransaction(String arg){
		
		System.out.println("Performing Txn For : "+arg);
		return "Transaction "+arg+" Succesful";
	}
	
	
	public void merryGoAround(){
		System.out.println("Running merryGoAround for Business");
	}
	
	public void sayHello(){
		System.out.println("Merhaba Fonksiyonu Calıştırdınız");
	}
	
	public void throwException(){
		System.out.println("Business class about throw an NPE..");
		throw new NullPointerException("Throwing custom Exception");
	}
	
	
}
