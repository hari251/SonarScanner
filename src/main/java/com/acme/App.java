package com.acme;

public class App {
    public String getGreeting() {
		//System.out.println(new App().getGreeting());
	//return ;    
        return "Hello world.";
		
    }

    public static void main(String[] args) {
	//System.out.println(new App().getGreeting());
        System.out.println(new App().getGreeting());
    }
}
