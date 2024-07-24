package com.springexample.demo.examples.c1;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//@Component
@Repository
@Qualifier("MySqlQualifier")
public class MySqlDataService implements DataService {

	@Override
	public int[] retriveData() {
		return new int[] {1, 2, 3, 4, 5};
	}
}
