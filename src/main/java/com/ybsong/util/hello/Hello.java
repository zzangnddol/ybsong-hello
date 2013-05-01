package com.ybsong.util.hello;

public class Hello {
	public static void main(String[] args) {
		new Hello().sayHello("Youngbae");
	}

	public void sayHello(String name) {
		System.out.println("Hello, " + name + "!!!");
	}
}
