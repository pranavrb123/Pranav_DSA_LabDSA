package binarySearchTree.Driver;

import binarySearchTree.Service.BinarySearchTreeForSum;

public class DriverClass {

	public static void main(String[] args) {

		BinarySearchTreeForSum tree = new BinarySearchTreeForSum();

		tree.insert(40);
		tree.insert(20);
		tree.insert(10);
		tree.insert(40);
		tree.insert(60);
		tree.insert(50);
		tree.insert(70);

		boolean sum = tree.isPairPresent(tree.root, tree.root, 130);
		if (!sum) {
			System.out.println("No such values are found!");
		}

	}

}
