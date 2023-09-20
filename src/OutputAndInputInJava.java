import java.util.Scanner;
public class OutputAndInputInJava {
    public static void output(){
        /*
        * in order to send output to standard output (screen) In Java
        *  you can simply use:
        * System.out.print("your text here.." or variableName); => It prints text or the variable value inside the quotes.
        * System.out.println(); => It prints string inside the quotes similar like print() method.
        *                          Then the cursor moves to the beginning of the next line.
        * System.out.printf(); It provides string formatting (similar to printf in C/C++ programming).
        * */

        System.out.println("Hello from 'println' methode ");
        System.out.print("Hello  from 'print' methode ");
        System.out.print("Hello from 'print2' methode ");
        System.out.printf("Hello from 'printf' methode\n");
        // Example for outputting a formatted string.
        String name = "DevBoss";
        String job = "Developer";

        System.out.printf("Hi! I'm %s and I'm a  %S. %n", name, job);

        /*
        * NB:
        * The keyword System is a class
        * The keyword out is a public static field: it accepts output data.
        */
    }
    public static void input(){
        /*
        * Java provides different ways to get input from the user.
        *** BufferedReader
        *** StringTokenizer
        *** Scanner
        * However, in this cod demo, you and i, we will use Scanner class to get input from user.
        * let's import java.util.Scanner package.
        * by writing in the import section above the expiration ( import java.util.Scanner; )
        * as a first step
        * */


        // second step:  create an object of Scanner
        Scanner input = new Scanner(System.in);

        // Now we will be able to taking inputs from the user and store them in variables.

        // but let's ask him first to inter those values:
        System.out.print(" Hello! what's your name?: ");
        String name = input.next();
        System.out.print(" HHow old are you?: ");
        int age = input.nextInt();

        System.out.printf("Welcome! Dear %s, you're  %s years old. %n", name, age);
        /*
        * NB: next() methode is for string data types
        * and nextInt() is for integers data types
        * so if try to inter a different datatype the system will throw a run time exception...
        * */

    }
}
