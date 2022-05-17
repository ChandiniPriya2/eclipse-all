package com.jobiak.ioc;
public class NewConnection {
	public NewConnection getConnection() {
		System.out.println("providing  new connection");
		return new NewConnection();
	}
}
