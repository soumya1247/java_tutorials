package com.springexample.demo.examples.c1;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Component
@Service
public class BusinessCalculationService {

	private DataService dataService;
	
//	public BusinessCalculationService(DataService dataService) {
//		super();
//		this.dataService = dataService;
//	}
	
	public BusinessCalculationService(@Qualifier("MySqlQualifier") DataService dataService) {
		super();
		this.dataService = dataService;
	}
	
	public int findMax() {
		return Arrays.stream(dataService.retriveData()).max().orElse(0);
	}
}
