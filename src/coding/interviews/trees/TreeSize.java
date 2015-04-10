package coding.interviews.trees;

public class TreeSize {
	public static int getTreeSize(TreeNode root){
		if(root == null){
			return 0;
		}
		
		return 1 + getTreeSize(root.left) + getTreeSize(root.right);
	}
	
	public static void main(String[] args){
		TreeNode root = BuildBSTree.insertBSTree(null, 5);
		root = BuildBSTree.insertBSTree(root, 4);
		root = BuildBSTree.insertBSTree(root, 10);
		root = BuildBSTree.insertBSTree(root, 3);
		root = BuildBSTree.insertBSTree(root, 1); 
		root = BuildBSTree.insertBSTree(root, 2);
		root = BuildBSTree.insertBSTree(root, 7);
		root = BuildBSTree.insertBSTree(root, 8);
		
		System.out.println("Tree Size = " + getTreeSize(root));
	}
}
