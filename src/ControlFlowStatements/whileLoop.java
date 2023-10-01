package ControlFlowStatements;


    /*
     * The while statement continually executes a block of statements
     * while a particular condition is true .
     * Its syntax can be expressed as: while (expression) { statement(s) }
     * The while statement evaluates expression,
     * which must return a boolean value.
     * */
public class whileLoop {


    public static void whileStatement(){
        // Syntax:
        // while(condition == true) the do {
        //      continue do something;
        // }
        // Implementation:
        int num = 1;
        while (num <= 10){
            System.out.printf("Step number: %d", num);
            num++; // if we don't increment the value of num; we will get an infinite loop.
            System.out.println();

        }
    }
}

