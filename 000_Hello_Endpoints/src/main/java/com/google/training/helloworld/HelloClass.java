package com.google.training.helloworld;

public class HelloClass {
    public String message = "Hello World";

    public HelloClass () {
    	
    }
    public String getMessage() {
        return message;
    }
    public HelloClass (String name) {
        this.message = "Hello " + name + "!";
    }
    public HelloClass(String name, String period) { 
    	this.message = "Good "+period+" " + name + "!"; 
    }
    
    public HelloClass(String name, String surname, String period){
    	this.message = "Good "+period+" "+ name +" "+surname+"!";
    }
   
}
