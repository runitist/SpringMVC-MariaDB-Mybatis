package com.futureinfo.legacy.sample.dto;

public class SampleDto {
	private int testint;
	private String teststring;

	public int getTestint() {
		return testint;
	}

	public void setTestint(int testint) {
		this.testint = testint;
	}

	public String getTeststring() {
		return teststring;
	}

	public void setTeststring(String teststring) {
		this.teststring = teststring;
	}

	@Override
	public String toString() {
		return "SampleDto [testint=" + testint + ", teststring=" + teststring + "]";
	}
	
	
}
