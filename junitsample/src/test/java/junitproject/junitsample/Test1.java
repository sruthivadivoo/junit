package junitproject.junitsample;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Test1 {	
	CalculatorService service=mock(CalculatorService.class);
	Calculator c;
	
	 @BeforeEach
	 public void setup() {
		  c=new Calculator(service); 
	 }
	 
 
	@Test
	void test() {
		when(service.add(1, 2)).thenReturn(3);
		assertEquals(3,c.perform(1,2));
	}
	
	

}
