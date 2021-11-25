package data_structures.array_list;

public class ElementNotFoundException extends RuntimeException
    {

        public ElementNotFoundException()
        {
            super("ElementNotFoundException");
        }

        public ElementNotFoundException(String msg)
        {
            super(msg);
        }

    }
