import data_structures.array_list.ArrayList;
import data_structures.binary_search_tree.BinarySearchTree;

public class DSTester
    {

        public static void main(String[] args)
        {

            ArrayList<Integer> arr = new ArrayList<>();
            arr.add(9);
            arr.add(5);
            arr.add(8);
            arr.add(3);
            arr.add(1);
            arr.add(4);
            arr.add(4);
            arr.add(22);
            arr.add(22);
            arr.add(4);
            arr.add(2);
            arr.add(1);

            System.out.println(arr);
            System.out.println("Instances of 4: " + arr.instancesOf(4));
            System.out.println("Indices of 4: ");
            for(int i = 0; i < arr.indicesOf(4).length; i++)
                System.out.print(arr.indicesOf(4)[i] + " ");
            System.out.println();

            arr.remove(4);

            System.out.println(arr);

        }

    }
