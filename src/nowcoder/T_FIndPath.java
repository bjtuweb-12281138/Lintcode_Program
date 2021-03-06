package nowcoder;

import java.util.ArrayList;
import java.util.Stack;

public class T_FIndPath {
    /**
     * 题目描述
     * 输入一颗二叉树和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。
     * 路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。
     * */
    //存储节点的值
    public ArrayList<Integer> list = new ArrayList<Integer>();
    //存储路径
    public ArrayList<ArrayList<Integer>> listAll = new ArrayList<ArrayList<Integer>>();

    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        if (root == null) return null;

        list.add(root.val);
        target -= root.val;
        if (root.left == null && root.right == null) {
            if (target == 0) {
                listAll.add(new ArrayList<Integer>(list));
            }
        }

        FindPath(root.left,target);
        FindPath(root.right,target);

        list.remove(list.size()-1);

        return listAll;
    }
}
