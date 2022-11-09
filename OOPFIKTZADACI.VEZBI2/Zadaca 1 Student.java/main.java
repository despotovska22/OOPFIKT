package oop.fikt.cas2.zad2;

public class main {
    public static void main(String[] args) {
		Student obj1 = new Student();
		
		obj1.firstName = "Anastasija";
		obj1.lastName = "Despotovska";
		obj1.index = 853;
		
		System.out.println("Podatoci za prv objekt:");
		System.out.println(obj1.firstName + " " + obj1.lastName + " " + obj1.index);
	
		Student obj2 = new Student("Filip", "Strkovski", 874);
		
		System.out.println ("Podatoci za vtor objekt:");
		System.out.println (obj2.firstName + " " + obj2.lastName + " " + obj2.index);
	}
}

