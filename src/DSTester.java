import data_structures.array_list.ArrayList;
import data_structures.binary_search_tree.BinarySearchTree;

public class DSTester
    {

        public static void main(String[] args)
        {
            ArrayList<Integer> arr = new ArrayList<>(10);
            arr.add(1);
            arr.add(2);
            arr.add(3);
            arr.add(4);
            arr.add(5);
            arr.remove(3);

            System.out.println(arr.toString());
        }

    }
