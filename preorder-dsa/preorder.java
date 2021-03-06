import java.util.Stack;


public class preorder {

  public static void main(String[] args) throws Exception {

    
    BinaryTree bt = new BinaryTree();
    BinaryTree.TreeNode root = new BinaryTree.TreeNode("1");
    bt.root = root;
    bt.root.left = new BinaryTree.TreeNode("2");
    bt.root.left.left = new BinaryTree.TreeNode("3");

    bt.root.left.right = new BinaryTree.TreeNode("4");
    bt.root.right = new BinaryTree.TreeNode("5");
    bt.root.right.right = new BinaryTree.TreeNode("6");

    
    bt.preOrder();

    System.out.println();

   
    bt.preOrderWithoutRecursion();

  }

}

class BinaryTree {
  static class TreeNode {
    String data;
    TreeNode left, right;

    TreeNode(String value) {
      this.data = value;
      left = right = null;
    }

    boolean isLeaf() {
      return left == null ? right == null : false;
    }

  }

  
  TreeNode root;


  public void preOrder() {
    preOrder(root);
  }


  
 
  private void preOrder(TreeNode node) {
    if (node == null) {
      return;
    }
    System.out.printf("%s ", node.data);
    preOrder(node.left);
    preOrder(node.right);
  }

 

  public void preOrderWithoutRecursion() {
    Stack<TreeNode> nodes = new Stack<>();
    nodes.push(root);

    while (!nodes.isEmpty()) {
      TreeNode current = nodes.pop();
      System.out.printf("%s ", current.data);

      if (current.right != null) {
        nodes.push(current.right);
      }
      if (current.left != null) {
        nodes.push(current.left);
      }
    }
  }

}
