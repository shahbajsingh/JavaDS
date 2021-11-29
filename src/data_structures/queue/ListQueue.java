package data_structures.queue;

import data_structures.array_list.ArrayList;

public class ListQueue<T> extends ArrayList<T>
    {

        public ListQueue()
        {
            super(10);
        }

        public ListQueue(int size)
        {
            super(size);
        }

        public void enqueue(T value)
        {
            super.add(value);
        }

        public void dequeue()
        {
            if(!super.isEmpty())
                this.remove(elementAtIndex(0));
        }

        @Override
        public String toString()
        {
            return super.toString();
        }

    }
