package cst;

public class Dispatcher {

	public static void main(String[] args) {

		Animal an = new Animal();
		Dog d = new Dog();
		Cat c = new Cat();
		Animal ad = new Dog();
		Animal ac =new Cat();
		if (d instanceof Animal) {
			an = d;
			System.out.println("1");
		}
		if (an instanceof Dog) {
			d = (Dog)an;
			System.out.println("2");
		}
		if(ac instanceof Dog) {
			d = (Dog)ac;
			System.out.println("3");
		}

		}

}
