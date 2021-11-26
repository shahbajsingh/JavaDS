import data_structures.array_list.ArrayList;
import data_structures.binary_search_tree.BinarySearchTree;

public class DSTester
    {

        public static void main(String[] args)
        {

            ArrayList<Integer> arr = new ArrayList<>();
            for(int i = 0; i < 100; i++)
                arr.add((int) (Math.random() * 100));

            System.out.println(arr);

        }

    }
