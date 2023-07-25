package treeImplementation;

public class BinarySearchTreeTest {

	public static void main(String[] args) {
		BinarySearchTree b=new BinarySearchTree();
		System.out.println(b.add(50));
		System.out.println(b.add(30));
		System.out.println(b.add(70));
		System.out.println(b.add(10));
		System.out.println(b.add(40));
		System.out.println(b.add(60));
		System.out.println(b.add(80));
		b.levelOrder();
	}

}
