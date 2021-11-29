package data_structures;

public class Node<T>
    {

        private T data;
        private Node left;
        private Node right;

        public Node(T data)
        {
            this.data = data;
        }


        // ACCESSOR METHODS

        public T getData()
        {
            return data;
        }

        public Node<T> getLeft()
        {
            return left;
        }

        public Node<T> getRight()
        {
            return right;
        }


        // MUTATOR METHODS

        public void setData(T data)
        {
            this.data = data;
        }

        public void setLeft(Node<T> left)
        {
            this.left = left;
        }

        public void setRight(Node<T> right)
        {
            this.right = right;
        }

        @Override
        public String toString()
        {
            return data.toString();
        }

    }
