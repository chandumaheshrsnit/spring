package com.luv2code.springdemo;

public class BaseballCoach implements Coach{

	public String getDailyWorkout(){
		return "spend 30 min on batting";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}
}
