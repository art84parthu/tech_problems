package coding.interviews.trees;

public class BSTLookup {
	public static TreeNode lookup(TreeNode root, int value){
		if(root == null) return null;
		
		if(value == root.getValue()) return root;
		
		if(value < root.getValue()){
			return lookup(root.getLeft(), value);
		}else{
			return lookup(root.getRight(), value);
		}
		
	}
	
	public static void main(String[] args){
		TreeNode root = BuildBSTree.insertBSTree(null, 5);
		root = BuildBSTree.insertBSTree(root, 4);
		root = BuildBSTree.insertBSTree(root, 10);
		root = BuildBSTree.insertBSTree(root, 3);
		root = BuildBSTree.insertBSTree(root, 1); 
		root = BuildBSTree.insertBSTree(root, 2);
		root = BuildBSTree.insertBSTree(root, 7);
		root = BuildBSTree.insertBSTree(root, 9);
		root = BuildBSTree.insertBSTree(root, 8);
		
		System.out.println("Looking up 6 in the BST");
		TreeNode.printTreeNode(lookup(root, 6));
		System.out.println("\nLooking up 9 in the BST");
		TreeNode.printTreeNode(lookup(root, 9));
	}
}
