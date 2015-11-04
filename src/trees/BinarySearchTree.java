package trees;

public class BinarySearchTree
{
    //recursive
    public void insert(TreeNode rootNode, int key)
    {
        //base case
        if (rootNode == null) {
            rootNode = new TreeNode(key);
        }

        //recursive step
        if (key < rootNode.key) {
            insert(rootNode.left, key);
        } else if (key > rootNode.key) {
            insert(rootNode.right, key);
        }
    }
}

class TreeNode {
    TreeNode left;
    TreeNode right;
    TreeNode parent;
    int key;

    public TreeNode(int key) {
        this.key = key;
    }
}
