package jvm;

public class StaticOverload {
	public static void main(String[] args){
		System.out.println("hw");
		Human man = new Man();
		Human woman = new Woman();
		
		StaticOverload sr = new StaticOverload();
		sr.say(man);
		sr.say(woman);
	}
	
	static abstract  class Human{}
	
	static class Man extends Human{}
	
	static class Woman extends Human{}
	
	public void say(Human guy){
		System.out.println("hi guy.");
	}
	
	public void say(Man man){
		System.out.println("hi man.");
	}
	
	public void say(Woman women){
		System.out.println("hi women.");
	}

}
