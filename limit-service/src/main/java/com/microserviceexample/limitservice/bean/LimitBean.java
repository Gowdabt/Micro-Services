package com.microserviceexample.limitservice.bean;

public class LimitBean {	

	
	private int min;
	private int max;
	
	
	public int getMin() {
		return min;
	}


	public void setMin(int min) {
		this.min = min;
	}


	public int getMax() {
		return max;
	}


	public void setMax(int max) {
		this.max = max;
	}


	public LimitBean() {
		super();
	}


	public LimitBean(int min, int max) {
		this.min=min;
		this.max=max;
	}


	@Override
	public String toString() {
		return "LimitBean [min=" + min + ", max=" + max + "]";
	}
	
}
