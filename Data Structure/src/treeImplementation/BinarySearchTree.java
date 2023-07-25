package treeImplementation;

import java.util.Queue;
public class BinarySearchTree {
	private Node root=null;
	private boolean flag;
	private int count=0;
	public boolean add(int k) {
		root=addNode(root, k);
		return flag;
	}
	private Node addNode(Node n,int k) {
		if (n==null) {
			flag=true;
			n=new Node(k);
			count++;
			return n;
		}
		if(k<n.key)n.left= addNode(n.left, k);
		else if (k>n.key)n.right= addNode(n.right, k);
		else {
			flag=false;
		}
		return n;
	}
	public int size() {
		return count;
	}
	public void levelOrder() {
		 Queue<Node> q=new java.util.LinkedList<Node>();
		 if(root!=null)q.add(root);
		 while(!q.isEmpty()) {
			 Node n=q.poll();
			 System.out.print(n.key+" ");
			 if(n.left!=null) q.add(n.left);
			 if(n.right!=null)q.add(n.right);
		 }
		 System.out.println();
	}
}
