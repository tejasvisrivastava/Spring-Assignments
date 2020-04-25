package com.capg.springjpa.entities;

public class Login {
	
	private static String user;
	private static String pass;
	@Override
	public String toString() {
		return "Login [user=" + user + ", pass=" + pass + "]";
	}
	public static String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public static String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}

}
