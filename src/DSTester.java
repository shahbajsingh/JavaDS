import data_structures.binary_search_tree.BinarySearchTree;

public class DSTester
    {

        public static void main(String[] args)
        {
            BinarySearchTree bt = new BinarySearchTree();

            bt.addTreeNode(10);
            bt.addTreeNode(11);
            bt.addTreeNode(109);
            bt.addTreeNode(102);
            bt.addTreeNode(29);
            bt.addTreeNode(33);
            bt.addTreeNode(24);
            bt.addTreeNode(66);

            System.out.println(bt.inOrderTraverse(bt.getRoot()));

        }

    }
