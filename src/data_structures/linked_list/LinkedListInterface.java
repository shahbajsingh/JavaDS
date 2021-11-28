package data_structures.linked_list;

public interface LinkedListInterface<T>
    {

        void addNodeFirst(T value);

        void addNodeLast(T value);

        boolean removeNode(T value);

        int getIndexOf(T value);

        T getElementAtIndex(int index);

        int getSize();

        ListNode<T> getHead();

        boolean isEmpty();

    }
