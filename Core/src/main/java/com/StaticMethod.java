package com;

public class StaticMethod {
	public static void main(String[] args) {
		Cat myCat = new Cat();
		Animal myAnimal = myCat;
		Animal.testClassMethod();
		myAnimal.testInstanceMethod();
		Cat.testClassMethod();
	}
}

class Animal {
	public static void testClassMethod() {
		System.out.println("The static method in Animal");
	}
	public void testInstanceMethod() {
		System.out.println("The instance method in Animal");
	}
}

class Cat extends Animal {
	public static void testClassMethod() {
		System.out.println("The static method in Cat");
	}
	public void testInstanceMethod() {
		System.out.println("The instance method in Cat");
	}
}

