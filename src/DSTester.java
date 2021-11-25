import data_structures.binary_tree.BinaryTree;

public class DSTester
    {

        public static void main(String[] args)
        {
            BinaryTree bt = new BinaryTree();

            for(int i = 20; i > 0; i--)
            {
                bt.addTreeNode(i);
            }

            System.out.println(bt.inOrderTraverse(bt.getRoot()));

        }

    }
