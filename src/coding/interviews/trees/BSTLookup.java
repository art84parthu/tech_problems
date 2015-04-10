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
}
