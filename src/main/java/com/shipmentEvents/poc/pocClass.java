package com.shipmentEvents.poc;

import java.util.List;


public class pocClass {
	
	
	public String method1() {
		
		return "some strings";
	}	
	
	public Double getTotal(List<Double> elements) {
		
		Double totalValue=0.0d;
		for(Double element:elements) {
			
			totalValue= totalValue+element;
		} 
		return totalValue;
		
	}
	
	

}
