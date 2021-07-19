package junitproject.junitsample;

public class Calculator {
	
	  CalculatorService service;
	/*
	 * public int add(int i,int j) { return i+j; }
	 */
	  
	  public Calculator(CalculatorService service) {
		  this.service=service;
	  }
	  
	public int perform(int i,int j) {
		return service.add(i,j);
	}
}
