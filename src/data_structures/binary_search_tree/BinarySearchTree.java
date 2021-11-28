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

            if (newTreeNode.compareTo(current) <= 0)
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

        public void addTreeNode(T val)
        {
            root = addTreeNodeRecursive(root, val);
        }

        public void add(T val)
        {
            addTreeNode(val);
        }


        public void removeTreeNode(T value)
        {

        }



        public String inOrderTraverse(TreeNode<T> node)
        {
            String str = "";
            if(node != null)
            {
                str += inOrderTraverse(node.getLeftChild());
                str += node.getData() + " | ";
                str += inOrderTraverse(node.getRightChild());
            }

            return str;
        }

        public String preOrderTraverse(TreeNode<T> node)
        {
            String str = "";
            if(node != null)
            {
                str += node.getData() + " | ";
                str += preOrderTraverse(node.getLeftChild());
                str += preOrderTraverse(node.getRightChild());
            }

            return str;
        }

        public String postOrderTraverse(TreeNode<T> node)
        {
            String str = "";
            if(node != null)
            {
                str += postOrderTraverse(node.getLeftChild());
                str += postOrderTraverse(node.getRightChild());
                str += node.getData() + " | ";
            }

            return str;
        }


    }
