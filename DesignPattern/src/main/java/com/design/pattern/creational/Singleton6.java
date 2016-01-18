package com.design.pattern.creational;

public class Singleton6{
	private Singleton6(){ }
	private static volatile Singleton6 instance;

	public static Singleton6 getInstance(){
		if (instance == null){
			synchronized (Singleton6.class){
				if (instance == null){
					instance = new Singleton6();
				}
			}
		}
		return instance;
	}
}