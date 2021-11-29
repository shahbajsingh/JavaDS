package data_structures.stack;

import data_structures.linked_list.LinkedList;

public class LinkedStack<T> extends LinkedList<T>
    {
        public LinkedStack()
        {
            super();
        }

        public void push(T value)
        {
            super.addNodeFirst(value);
        }

        public T peek()
        {
            return super.getHead().getData();
        }

        public T pop()
        {
            T popped = peek();
            super.removeNode(getElementAtIndex(0));
            return popped;
        }

        @Override
        public String toString()
        {
            return super.toString();
        }

    }
