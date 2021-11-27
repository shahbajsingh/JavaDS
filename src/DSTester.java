import data_structures.array_list.ArrayList;
import data_structures.binary_search_tree.BinarySearchTree;

public class DSTester
    {

        public static void main(String[] args)
        {

           BinarySearchTree<Integer> b = new BinarySearchTree<>();
            b.addTreeNode(4);
            b.addTreeNode(2);
            b.addTreeNode(1);
            b.addTreeNode(6);
            b.addTreeNode(9);
            b.addTreeNode(11);
            b.addTreeNode(55);
            b.addTreeNode(94);

            System.out.println(b.getRoot());

        }

    }
