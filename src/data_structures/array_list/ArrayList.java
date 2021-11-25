package data_structures.array_list;

public class ArrayList<T>
    {
        private T[] arr;
        private int elementCount;
        private int capacity;

        public ArrayList()
        {
            this(10);
        }

        public ArrayList(int size)
        {
            capacity = size;
            elementCount = 0;
            arr = (T[]) new Object [capacity];
        }

        public void add(T val)
        {
            if(elementCount == capacity)
                grow();

            arr[elementCount] = val;
            elementCount++;
        }

        public void grow()
        {
            capacity *= 2;
            T[] newArr = (T[]) new Object[capacity];
            System.arraycopy(arr, 0, newArr, 0, elementCount);

            arr = newArr;
        }

        public int indexOf(T val)
        {
            for(int i = 0; i < elementCount; i++)
            {
                if(arr[i].equals(val))
                    return i;
            }
            throw new ElementNotFoundException();
        }


        @Override
        public String toString()
        {
            String str = "[";
            for(int i = 0; i < elementCount - 1; i++)
                str += arr[i] + " | ";
            return str + arr[elementCount - 1] + "]";
        }


    }
