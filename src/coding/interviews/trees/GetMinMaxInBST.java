package coding.interviews.trees;

public class GetMinMaxInBST {
	public static Integer getMinimum(TreeNode root){
		if(root == null)return null;
		
		if(root.left == null){
			return root.value;
		}else{
			return getMinimum(root.left);
		}
	}
	
	public static Integer getMaximum(TreeNode root){
		if(root == null)return null;
		
		if(root.right == null){
			return root.value;
		}else{
			return getMaximum(root.right);
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
		root = BuildBSTree.insertBSTree(root, 8);
		
		System.out.println("Minimum in the tree = " + getMinimum(root));
		System.out.println("Maximum in the tree = " + getMaximum(root));
	}
}
