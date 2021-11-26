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

        public void grow()  // TO-DO: Deep copy
        {
            capacity *= 2;
            T[] newArr = (T[]) new Object[elementCount];
            System.arraycopy(arr, 0, newArr, 0, elementCount);

            this.arr = newArr;  // Does not change pointer
        }


        public void remove(T val) // TO-DO: Remove nulls from array
        {
            int[] indices = indicesOf(val);

            for(int i = indices[0]; i < indices.length; i++)
            {
                arr[indices[i]] = null;
            }

        }


        public int[] indicesOf(T val)
        {
            int[] indices = new int[capacity];
            for(int i = 0, j = 0; i < elementCount; i++)
            {
                if(arr[i].equals(val))
                {
                    indices[j] = i;
                    j++;
                }
            }
            return indices;
        }

        public int indexOf(T val)
        {
            if(instancesOf(val) > 1)
            {
                System.out.print("\nmultiple indices found –– \nuse indicesOf() method to return array of indices\n");
                return indicesOf(val)[0];
            }
            else if(instancesOf(val) == 1)
            {
                return indicesOf(val)[0];
            }
            else
            {
                throw new ElementNotFoundException();
            }
        }

        public int instancesOf(T val)
        {
            int counter = 0;
            for(int i = 0; i < elementCount; i++)
            {
                if(arr[i].equals(val))
                    counter++;
            }
            return counter;
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
