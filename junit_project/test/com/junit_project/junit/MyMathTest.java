package com.junit_project.junit;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MyMathTest {
	
	private MyMath math = new MyMath();
	
	@Test
	@DisplayName("Simple sum")
	void calculateSum_ThreeMemberArray() {		
		assertEquals(6, math.calculateSum(new int[] {1,2,3}));
	}

	@Test
	void calculateSum_ZeroLengthArray() {		
		assertEquals(0, math.calculateSum(new int[] {}));
	}
}
