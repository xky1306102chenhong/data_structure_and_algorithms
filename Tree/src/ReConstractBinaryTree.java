/**
 * @author Chris Chen
 * @date 2019/5/1 下午7:40
 */

public class ReConstractBinaryTree {
    public static TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        if (pre.length == 0){
            return null;
        }
        TreeNode root = new TreeNode(pre[0]);

        if(pre.length == 1){
            root.left = null;
            root.right = null;
            return root;
        }
        int rootIndexAtIn = 0;
        for(int i=0; i<in.length;i++){
            if (pre[0] == in[i]){
                rootIndexAtIn = i;
                break;
            }
        }
        if(rootIndexAtIn>0){
            int[] newPre1 = new int[rootIndexAtIn];
            for (int i=0;i<newPre1.length;i++){
                newPre1[i] = pre[i+1];
            }
            int[] newIn1 = new int[rootIndexAtIn];
            for (int i=0;i<newPre1.length;i++){
                newIn1[i] = in[i];
            }
            root.left = reConstructBinaryTree(newPre1, newIn1);
        }else{
            root.left = null;
        }


        if(pre.length - rootIndexAtIn -1>0){
            int[] newPre2 = new int[pre.length - rootIndexAtIn -1];
            for (int i=0;i<newPre2.length;i++){
                newPre2[i] = pre[rootIndexAtIn + 1+i];
            }
            int[] newIn2 = new int[in.length - rootIndexAtIn - 1];
            for (int i=0;i<newIn2.length;i++){
                newIn2[i] = in[rootIndexAtIn + 1+i];
            }

            root.right = reConstructBinaryTree(newPre2, newIn2);
        }else{
            root.right = null;
        }

        return  root;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        val = val;
    }
}
