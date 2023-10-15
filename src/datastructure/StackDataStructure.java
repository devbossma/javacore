package datastructure;

import java.util.Stack;

public class StackDataStructure {
    public static void stackImplementation(){
        // last in first out ( LIFO )
        // declaration:
        Stack<Integer> index = new Stack<>();

        // check if stack is empty:
        //System.out.println("stack is empty: "+ index.empty());

        // Adding items to the stack
        index.push(0);
        index.push(1);
        index.push(2);
        index.push(3);

        //System.out.println("stack is empty: ( after pushing 4 items) "+ index.empty());
        // size of stack
        //System.out.println( "Size of the stack: " + index.size());

        Stack<String> tickets = new Stack<>();
        tickets.push("tck-00001");
        tickets.push("tck-00002");
        tickets.push("tck-00003");
        tickets.push("tck-00004");
        System.out.println(tickets);
        // reading the last item in the stack:
        System.out.println("last item "+tickets.peek());
        // removing last item from the stack and assigned it to a variable:
        String lastitem = tickets.pop();


        System.out.println("last item poped "+ lastitem);
        System.out.println("last item peeked "+tickets.peek());
        System.out.println(tickets);
        // searching for an item in the stack:
        // return the position of the item if exists, starts counting from the last item in the stack
        // if not exists the returned value will be -1.
        System.out.println(tickets.search("tck-00003"));

        // let's get the item at a specific index:
        // the indexes starts from the first item in te stack.
        System.out.println(tickets.get(0));
        //Or
        System.out.println(tickets.elementAt(0));

        // looping through te stack:
        tickets.forEach(t -> System.out.println(t));

        // we  can use add methode also to add items to the stack:
        tickets.add("tck-00004");
        System.out.println(tickets.peek());
        System.out.println(tickets);

        // or adding objects:
        tickets.addElement(new String("tck-00005"));
        System.out.println(tickets);

        // clearing the whole stack:
        tickets.clear();
        System.out.println(tickets);

        // the capacity of a stack is started by 10 once you reach this capacity the stack will double the previous capacity.
        System.out.println("the initial capacity: "+tickets.capacity());
        for (int i = 1; i <12; i++) {
            tickets.push("tck-0000"+i);
        }
        System.out.println("Capacity after adding more then 11 items: " +tickets.capacity());
        for (int i = 11; i <22; i++) {
            tickets.push("tck-0000"+i);
        }
        System.out.println("Capacity after adding additional 11 items: " +tickets.capacity());


        System.out.println(tickets.size());



        // another methode to check whether if an object exists or not.
        System.out.println(tickets.contains("tck-00005"));


        // Coping stack to an array.
        String[] ticketsArray= new String[tickets.size()];
        tickets.copyInto(ticketsArray);

        /*for (int i = 0; i < ticketsArray.length; i++) {
            System.out.println(ticketsArray[i]);
        }*/
        System.out.println(tickets.elements());














    }
}
