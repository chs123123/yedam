package com.yedam;

import com.yedam.hankook.*;
import com.yedam.hankook.Tire;
import com.yedam.kumho.WideTire;

public class TireExample {
	public static void main(String[] args) {
		Wheel wheel = new SnowTire();
		SnowTire snowtire = new SnowTire();
		snowtire.showType();
		WideTire wideTire = new WideTire();
		wideTire.showInfo();
		com.yedam.hankook.Tire tire1 = new com.yedam.hankook.Tire();
		com.yedam.kumho.Trie tire2 = new com.yedam.kumho.Trie();
	}
}
