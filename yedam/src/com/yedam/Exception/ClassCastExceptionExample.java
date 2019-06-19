package com.yedam.Exception;
class Animal{
}
class Dog extends Animal{
	
}
class Cat extends Animal{
	
}
public class ClassCastExceptionExample {
	public static void main(String[] args) {
		Dog dog = new Dog();
		changeDog(dog);
		Cat cat = new Cat();
		changeDog(cat);
	}
	static void changeDog(Animal animal) {
		if(animal instanceof Dog) {
			Dog dog = (Dog) animal;
		}else {
			System.out.println("변환할 수 없습니다.");
	}
}
}
