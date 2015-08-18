package com.segments.algorithm;

public class Context {
	private Ialgorithm algorithm;
	public Context(Ialgorithm algorithm){
		this.algorithm=algorithm;
	}
	public void operate(){
		this.algorithm.operate();
	}
	public void setText(String text) {
		// TODO Auto-generated method stub
		this.algorithm.setText(text);
	}
}
