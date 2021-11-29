package data_structures.queue;

import data_structures.linked_list.LinkedList;

public class LinkedQueue<T> extends LinkedList<T>
    {
        public LinkedQueue()
        {
            super();
        }

        public void enqueue(T value)
        {
            super.addNode(value);
        }

        public T dequeue()
        {
            T dequeued = super.getHead().getData();
            super.removeNode(getElementAtIndex(0));
            return dequeued;
        }

        @Override
        public String toString()
        {
            return super.toString();
        }
    }
