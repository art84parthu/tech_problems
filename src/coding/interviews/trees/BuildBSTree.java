package coding.interviews.trees;

public class BuildBSTree {
	public static TreeNode insertBSTree(TreeNode root, int value){
		if(root == null){
			root = new TreeNode();
			root.setValue(value);
		}else{
			if(value <= root.getValue()){
				root.left = insertBSTree(root.left, value);
			}else{
				root.right = insertBSTree(root.right, value);		
			}
		}
		
		return root;
	}
}
