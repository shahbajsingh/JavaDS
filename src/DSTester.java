import data_structures.array_list.ArrayList;
import data_structures.binary_search_tree.BinarySearchTree;

public class DSTester
    {

        public static void main(String[] args)
        {

            BinarySearchTree bst = new BinarySearchTree(10);
            bst.addTreeNode(50);
            bst.addTreeNode(20);
            bst.addTreeNode(77);
            bst.addTreeNode(292);
            bst.addTreeNode(29);
            bst.addTreeNode(2992);
            bst.addTreeNode(83);
            bst.addTreeNode(292);
            bst.addTreeNode(-292);
            bst.addTreeNode(-280);
            bst.addTreeNode(0);

            System.out.println(bst.inOrderTraverse(bst.getRoot()));
            System.out.println(bst.getRoot().getLeftChild());
            System.out.println(bst.getRoot().getRightChild());

        }

    }
