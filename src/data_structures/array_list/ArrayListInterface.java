package data_structures.array_list;

public interface ArrayListInterface<T>
    {

        void add(T value);

        void grow();

        void remove(T value);

        int indexOf(T value);

        int[] indicesOf(T value);

        int instancesOf(T value);

        int getSize();

        boolean isEmpty();
        

    }
