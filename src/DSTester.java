import data_structures.linked_list.LinkedList;
import data_structures.queue.LinkedQueue;
import data_structures.queue.ListQueue;
import data_structures.stack.LinkedStack;
import data_structures.stack.ListStack;

public class DSTester
    {

        public static void main(String[] args)
        {


            ListStack<Integer> s = new ListStack<>();
            s.push(2);
            s.push(3);
            s.push(4);
            s.push(5);
            s.push(5);

            System.out.println(s.peek());
            System.out.println(s.pop());
            System.out.println(s.peek());
            s.pop();
            s.pop();
            System.out.println(s);


        }

    }
