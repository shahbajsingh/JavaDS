package data_structures.binary_search_tree;

public class BinarySearchTree<T extends Comparable<? super T>>
    {

        private TreeNode<T> root;

        public BinarySearchTree()
        {
            root = null;
        }

        public BinarySearchTree(T value)
        {
            root = new TreeNode<T>(value);
        }

        public TreeNode<T> getRoot()
        {
            return root;
        }

        private TreeNode<T> addTreeNodeRecursive(TreeNode<T> current, T value)
        {
            TreeNode<T> newTreeNode = new TreeNode<>(value);

            if (current == null)
            {
                return new TreeNode<>(value);
            }

            if (newTreeNode.compareTo(current) < 0)
            {
                current.setLeftChild(addTreeNodeRecursive(current.getLeftChild(), value));
            } else if (newTreeNode.compareTo(current) > 0)
            {
                current.setRightChild(addTreeNodeRecursive(current.getRightChild(), value));
            } else
            {
                return current;
            }

            return current;
        }

        public void addTreeNode(T value)
        {
            root = addTreeNodeRecursive(root, value);
        }

        public String inOrderTraverse(TreeNode<T> node)
        {
            String str = "[";
            if(node != null)
            {
                str += inOrderTraverse(node.getLeftChild()) + " ";
                str += node.getData() + " ";
                str += inOrderTraverse(node.getRightChild());
            }

            return str + "]";
        }


    }
