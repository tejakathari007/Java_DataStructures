package com.demo.dsa.hashing;

public class Main {

	public static void main(String[] args) {
		DirectChaining d = new DirectChaining(15);
		d.insertHashTable("sword");
		d.insertHashTable("sword");
		d.insertHashTable("test");
		d.delete("sword");
		d.display();

//		LinkedList<String> list = new LinkedList<>();
//		list.add("teja");
//		list.add("kathari");
//		list.add("last");
//
//		list.forEach((value) -> {
//			System.out.println(value);
//
//		});

	}
}
