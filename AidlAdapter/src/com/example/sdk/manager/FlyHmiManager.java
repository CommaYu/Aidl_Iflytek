package com.example.sdk.manager;

public class FlyHmiManager {
	// 饿汉式单例模式
	private static FlyHmiManager instance = new FlyHmiManager();
	private FlyHmiManager(){}
	public static FlyHmiManager getInstance(){
		return instance;
	}
}
