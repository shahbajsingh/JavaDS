package data_structures.linked_list;

/*
 * LINKEDLIST<T> CLASS
 *
 * This generic class implements a doubly linked list that has methods to add nodes to the beginning or end,
 * make the list circular at its ends, remove nodes of specified values, get the index of nodes with specified
 * values, get the value of nodes at specified indexes, and get the size of the list
 */
public class LinkedList<T>
    {

        private ListNode<T> head;
        private ListNode<T> tail;
        private boolean circular;


        public void addListNodeFirst(T obj)     // Add new node with specified data to beginning of list
        {
            ListNode<T> newListNode = new ListNode<>(obj);

            if (this.isEmpty())
            {
                head = tail = newListNode;
                this.nullEnds();
            }
            else if (circular == false)
            {
                head.setPrevious(newListNode);
                newListNode.setNext(head);
                head = newListNode;
            }
            else
            {
                head.setPrevious(newListNode);
                newListNode.setNext(head);
                head = newListNode;
                circularize();
            }
        }

        public void addListNodeLast(T obj)      // Add new node with specified data to end of list
        {
            ListNode<T> newListNode = new ListNode<>(obj);

            if (this.isEmpty())
            {
                head = tail = newListNode;
                this.nullEnds();
            }
            else if (circular == false)
            {
                tail.setNext(newListNode);
                newListNode.setPrevious(tail);
                tail = newListNode;
            }
            else
            {
                tail.setNext(newListNode);
                newListNode.setPrevious(tail);
                tail = newListNode;
                circularize();
            }

        }

        public void addListNode(T obj)      // Default add method calls addListNodeLast, adds data to end of list
        {
            addListNodeLast(obj);
        }

        // Traverses list and returns true if removal of node with corresponding data was possible
        public boolean removeListNode(T val)
        {
            ListNode<T> current = head;

            if(!this.isCircular())
            {
                while (current != null)
                {
                    if (current.getData().equals(val))
                    {
                        current.getPrevious().setNext(current.getNext());
                        current.getNext().setPrevious(current.getPrevious());
                        return true;
                    }
                    current = current.getNext();
                }
            }
            else
            {
                while (current != tail)
                {
                    if (current.getData().equals(val))
                    {
                        current.getPrevious().setNext(current.getNext());
                        current.getNext().setPrevious(current.getPrevious());
                        return true;
                    }
                    current = current.getNext();
                }

                if(tail.getData().equals(val))
                {
                    tail.getPrevious().setNext(head);
                    head.setPrevious(tail.getPrevious());
                    tail = tail.getPrevious();
                    return true;
                }
            }
            return false;
        }

        public int getIndexOf(T val)
        {
            ListNode<T> current = head;
            int counter = 0;

            if(!this.isCircular())
            {
                while (current != null)
                {
                    if (current.getData().equals(val))
                        return counter;
                    current = current.getNext();
                    counter++;
                }
            }
            else
            {
                while (current != tail)
                {
                    if (current.getData().equals(val))
                        return counter;
                    current = current.getNext();
                    counter++;
                }
                if(tail.getData().equals(val))
                    return counter;
            }
            return -1;
        }

        public T getElementAtIndex(int index)
        {
            if (index > getSize())
            {
                System.out.println("LIST SIZE IS " + getSize());
                throw new NullPointerException();
            }
            else
            {
                ListNode<T> current = head;
                for(int i = 0; i < index; i++)
                    current = current.getNext();
                return current.getData();
            }
        }

        public int getSize()
        {
            if(this.isEmpty())
                return 0;

            int counter = 0;
            ListNode<T> current = head;
            while(current != tail)
            {
                counter++;
                current = current.getNext();
            }
            return counter + 1;
        }


        public ListNode<T> getHead()        // Access head node
        {
            return head;
        }

        public ListNode<T> getTail()        // Access tail node
        {
            return tail;
        }


        public void circularize()       // Links ends and circularizes the linked list
        {
            linkEnds();
            circular = true;
        }

        public void decircularize()     // Unlinks ends by nulling them and decircularizes the linked list
        {
            nullEnds();
            circular = false;
        }


        public void nullEnds()      // Set ends of list (back of head node and front of tail node) to null
        {
            head.setPrevious(null);
            tail.setNext(null);
        }

        public void linkEnds()      // Links ends of list (back of head node and front of tail node) to each other
        {
            head.setPrevious(tail);
            tail.setNext(head);
        }

        public boolean isCircular()     // Returns true if list is circular
        {
            return (circular == true);
        }

        public boolean isEmpty()        // Returns true if list is empty
        {
            return (head == null);
        }

        @Override
        public String toString()
        {

            ListNode<T> current = this.getHead();
            String str = "";

            while (current != tail)
            {
                str += current + " | ";
                current = current.getNext();
            }

            str = "[" + str + tail + "]";
            return str;

        }

    }