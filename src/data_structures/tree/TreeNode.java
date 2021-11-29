package data_structures.tree;

public class TreeNode<T extends Comparable<? super T>> implements Comparable<TreeNode<T>>
    {

        private T data;
        private TreeNode<T> left;
        private TreeNode<T> right;

        public TreeNode(T data)
        {
            this.data = data;
            left = null;
            right = null;
        }
        


        // ACCESSOR METHODS

        public T getData()
        {
            return data;
        }

        public TreeNode<T> getLeftChild()
        {
            return left;
        }

        public TreeNode<T> getRightChild()
        {
            return right;
        }

        // MUTATOR METHODS

        public void setData(T data)
        {
            this.data = data;
        }

        public void setLeftChild(TreeNode<T> leftChild)
        {
            left = leftChild;
        }

        public void setRightChild(TreeNode<T> rightChild)
        {
            right = rightChild;
        }

        @Override
        public String toString()
        {
            return data.toString();
        }


        @Override
        public int compareTo(TreeNode<T> obj)
        {
            if(this.getData().compareTo(obj.getData()) < 0)
                return -1;
            else if (this.getData().compareTo(obj.getData()) > 0)
                return 1;
            return 0;

        }
    }
