package oop.fikt.cas2.zad3;

public class Main {
	public static void main (String[] args) {
		Covek obj1 = new Covek();
		
		obj1.ime = "Anastasija";
		obj1.prezime = "Despotovska";
		obj1.mBroj = "3101002415005";
		
		System.out.println("Imeto na covekot e: " + obj1.ime + ".");
		System.out.println("Prezimeto na covekot e: " + obj1.prezime + ".");
		System.out.println("Cvekot ima maticen broj: " + obj1.mBroj + ".");
	}
}
