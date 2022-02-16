package com.demo.dsa.trees;

public class Main {

	public static void main(String[] args) {

		TreeNode drinks = new TreeNode("Drinks");
		TreeNode hot = new TreeNode("hold");
		TreeNode tea = new TreeNode("tea");
		TreeNode coffee = new TreeNode("coffee");
		TreeNode cold = new TreeNode("cold");
		TreeNode lemonade = new TreeNode("lemonade");
		TreeNode beer = new TreeNode("beer");
		cold.addChild(beer);
		cold.addChild(lemonade);
		hot.addChild(coffee);
		hot.addChild(tea);
		drinks.addChild(cold);
		drinks.addChild(hot);

		System.out.println(drinks.print(0));

	}

}
