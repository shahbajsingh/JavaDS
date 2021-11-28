import data_structures.array_list.ArrayList;
import data_structures.binary_search_tree.BinarySearchTree;
import data_structures.linked_list.LinkedList;

public class DSTester
    {

        public static void main(String[] args)
        {

            LinkedList l = new LinkedList();


            l.addNode(2);
            l.addNodeFirst(5);
            l.addNode(1);
            l.addNode(3);
            l.addNode(4);

            l.circularize();
            System.out.println(l.getTail().getNext());

            l.nullifyEnds();
            System.out.println(l.getTail().getNext());

        }

    }
