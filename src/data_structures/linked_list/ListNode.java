package data_structures.linked_list;

public class ListNode<T>
    {

        // Encapsulated private member variables are accessible only through accessor methods
        // and modified only through mutator methods

        private T data;
        private ListNode previousLink;
        private ListNode nextLink;




        public ListNode(T data)
        {
            this.data = data;
        }


        // ACCESSOR METHODS

        public T getData()
        {
            return data;
        }

        public ListNode<T> getPrevious()
        {
            return previousLink;
        }

        public ListNode<T> getNext()
        {
            return nextLink;
        }


        // MUTATOR METHODS

        public void setData(T data)
        {
            this.data = data;
        }

        public void setPrevious(ListNode<T> previousLink)
        {
            this.previousLink = previousLink;
        }

        public void setNext(ListNode<T> nextLink)
        {
            this.nextLink = nextLink;
        }

        @Override
        public String toString()
        {
            return data.toString();
        }


    }
