package treeImplementation;

public class Node {
	int key;
	Node left;
	Node right;
	public Node (int key) {
		this.key=key;
	}
	public Node(int key, Node left, Node right) {
		super();
		this.key = key;
		this.left = left;
		this.right = right;
	}
	
}
