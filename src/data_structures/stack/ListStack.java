package data_structures.stack;

import data_structures.array_list.ArrayList;

public class ListStack<T> extends ArrayList<T>
    {

        public ListStack()
        {
            super();
        }

        public void push(T value)
        {
            super.add(value);
        }

        public T peek()
        {
            return super.elementAtIndex(super.getSize() - 1);
        }

        public T pop()
        {
            T popped = peek();
            super.removeLast();
            return popped;
        }

        @Override
        public String toString()
        {
            return super.toString();
        }

    }
