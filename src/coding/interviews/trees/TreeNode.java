package coding.interviews.trees;

public class TreeNode{
	int value;
	TreeNode left;
	TreeNode right;
	
	
	public TreeNode(){
		this.value = -1;
		this.left = this.right = null;
	}
	
	public TreeNode(int val, TreeNode left, TreeNode right){
		this.value = val;
		this.left = left;
		this.right = right;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public TreeNode getLeft() {
		return left;
	}

	public void setLeft(TreeNode left) {
		this.left = left;
	}

	public TreeNode getRight() {
		return right;
	}

	public void setRight(TreeNode right) {
		this.right = right;
	}
	
	public static void printTreeNode(TreeNode node){
		if(node != null){
			System.out.print(node.value);
		}
	}
	
	
}