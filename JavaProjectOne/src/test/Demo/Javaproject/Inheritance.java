package test.Demo.Javaproject;

class Animal {
	public void animalSound(){
		System.out.println("Animal Making Noise");
	}
}

class Dog extends Animal {
	public void animalSound(){
		System.out.println("Bow Bow!!!");
	}
}

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal obj = new Animal();
		obj.animalSound();
		obj = new Dog();
		obj.animalSound();
		obj = null;

	}

}
