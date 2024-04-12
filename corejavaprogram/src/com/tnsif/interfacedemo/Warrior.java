package com.tnsif.interfacedemo;

public class Warrior implements Character,Weapon{

	@Override
	public void use() {
		System.out.println("attack");
		
	}

	@Override
	public void attack() {
		System.out.println("use");
		
	}
	public static void main(String[] args) {
		Warrior w=new Warrior();
		w.use();
		w.attack();
	}

}
