package data_structures.array_list;

public class ArrayList<T> implements ArrayListInterface<T>
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

        @Override
        public void add(T val)
        {
            if(elementCount == capacity)
                grow();

            arr[elementCount] = val;
            elementCount++;
        }

        @Override
        public void grow()
        {
            capacity *= 2;
            T[] newArr = (T[]) new Object[capacity];
            System.arraycopy(arr, 0, newArr, 0, elementCount);

            this.arr = newArr;
        }

        @Override
        public void remove(T val)
        {
            int[] indices = indicesOf(val);
            for(int i = 0; i < indices.length; i++)
            {
                arr[indices[i]] = null;
                elementCount--;
            }
            removeNulls();
        }

        public T elementAtIndex(int index)
        {
            return arr[index];
        }

        @Override
        public int[] indicesOf(T val)
        {
            try
            {
                removeNulls();
                if (instancesOf(val) >= 1)
                {
                    int[] indices = new int[instancesOf(val)];
                    for (int i = 0, j = 0; i < arr.length; i++)
                    {
                        if ((j < indices.length) && (arr[i].equals(val)))
                        {
                            indices[j] = i;
                            j++;
                        }
                    }
                    return indices;
                }
                else
                {
                    throw new ElementNotFoundException();
                }
            }
            catch (ElementNotFoundException e)
            {
                e.getMessage();
                return null;
            }
        }

        @Override
        public int indexOf(T val)
        {
            try
            {
                removeNulls();
                if (instancesOf(val) > 1)
                {
                    System.out.print("\nmultiple indices found –– " +
                                     "\nuse indicesOf() method to return array of indices\n");
                    return indicesOf(val)[0];
                }
                else if (instancesOf(val) == 1)
                {
                    return indicesOf(val)[0];
                }
                else
                {
                    throw new ElementNotFoundException();
                }
            }
            catch (ElementNotFoundException e)
            {
                e.getMessage();
                return -1;
            }
        }

        @Override
        public int instancesOf(T val)
        {
            int counter = 0;
            for(int i = 0; i < elementCount; i++)
            {
                if(arr[i].equals(val) && !arr[i].equals(null))
                    counter++;
            }
            return counter;
        }

        @Override
        public int getSize()
        {
            return elementCount;
        }

        @Override
        public boolean isEmpty()
        {
            return elementCount == 0;
        }

        private void removeNulls()
        {
            T[] newArr = (T[]) new Object[elementCount];
            for(int i = 0, j = 0; i < arr.length; i++)
            {
                if(arr[i] != null)
                    newArr[j++] = arr[i];
            }
            arr = newArr;
        }

        private boolean containsNulls()
        {
             for(int i = 0; i < arr.length; i++)
             {
                 if(arr[i] == null)
                     return true;
             }
             return false;
        }


        
        @Override
        public String toString()
        {
            removeNulls();
            String str = "[";
            for(int i = 0; i < elementCount - 1; i++)
                str += arr[i] + " | ";
            return str + arr[elementCount - 1] + "]";
        }


    }
