package hassubtree;

/**
 * @author Chris Chen
 * @date 2019/5/7 上午11:04
 */

public class Solution {

    public static boolean HasSubtree(TreeNode root1, TreeNode root2) {
        return hasSubtree(root1, root2);
    }


    public static boolean hasSubtree(TreeNode root1, TreeNode root2) {
        if (root2 == null) {
            return false;
        } else if (root1 == null) {
            return false;
        } else {
            if (root1.val == root2.val) {
                boolean leftAns;
                if (root2.left == null) {
                    leftAns = true;
                } else {
                    leftAns = hasSubtree(root1.left, root2.left);
                }
                if (leftAns) {
                    boolean rightAns;
                    if (root2.right == null) {
                        rightAns = true;
                    } else {
                        rightAns = hasSubtree(root1.right, root2.right);
                    }
                    if (rightAns) {
                        return true;
                    } else {

                        if (hasSubtree(root1.left, root2)) {
                            return true;
                        }
                        if (hasSubtree(root1.right, root2)) {
                            return true;
                        }
                        return false;
                    }
                } else {

                    if (hasSubtree(root1.left, root2)) {
                        return true;
                    }
                    if (hasSubtree(root1.right, root2)) {
                        return true;
                    }
                    return false;
                }
            } else {

                if (hasSubtree(root1.left, root2)) {
                    return true;
                }
                if (hasSubtree(root1.right, root2)) {
                    return true;
                }
                return false;

            }
        }
    }

}

class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;
    }
}
