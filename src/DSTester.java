import data_structures.linked_list.LinkedList;
import data_structures.queue.LinkedQueue;
import data_structures.queue.ListQueue;
import data_structures.stack.LinkedStack;

public class DSTester
    {

        public static void main(String[] args)
        {

            LinkedQueue q = new LinkedQueue();
            q.enqueue(1);
            q.enqueue(5);
            q.enqueue(4);
            q.enqueue(3);
            q.enqueue(2);
            q.dequeue();

            LinkedStack s = new LinkedStack();
            s.push(1);
            s.push(5);
            s.push(4);
            s.push(3);
            s.push(2);
            s.pop();

            System.out.println(q);
            System.out.println(s);

        }

    }
