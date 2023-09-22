public class OperatorsInJava {
    /*
    * Operators are special symbols that perform specific operations on:
    * one, two, or three operands, and then return a result.
    * */

    /*
    * Types of Java Operators:
    * Resource link: https://www.mygreatlearning.com/blog/java-operators/
    * 1. Unary Operators
    * 2. Arithmetic Operators
    * 3. Assignment Operators
    * 4. Logical Operators
    * 5. Shift Operators
    * 6. Bitwise Operators
    * 7. Ternary Operators
    * 8. Relational Operators
    * */
    public static void unaryOperator(){
        /* description:
            Unary operator requires only a single operand;
            this operator is used to increment or decrement the value,
            negating an expression or inverting a boolean value.
        */
        int a = 10;
        boolean b = true;
        System.out.println ( "****---- The starting value of  a ----****" );
        System.out.println ( a ); // the value of a = 10.

        // postfix operator (increment) or post-increment (a++)
        // works with the original values then increment it by one.
        System.out.println ( "*---- before post-incrementing a" );
        System.out.println ( a++ ); // print the original value of a (in this case: a = 10) then assign 10+1 to variable (a).
        System.out.println ( "*---- after post-incrementing a" );
        System.out.println ( a ); // now the value of a = 11.

        // prefix operator (increment) or pre-increment (++a)
        // increment the original value by one, and then continue the processing
        System.out.println ( "*---- before pre-incrementing a" );
        System.out.println ( ++a ); // print a + 1, which is 11 + 1 = 12 and assign this new value tu to (a) in the same time.
        System.out.println ( "*---- after pre-incrementing a" );
        System.out.println ( a );   // now the value of a = 12.

        // postfix operator (decrement) or post-decrement (a--)
        // works with the original values then subtract it by one.
        System.out.println ( "*---- before post-decrementing a" );
        System.out.println ( a-- ); // print the original value of a (in this case: a = 12) then assign 12-1 to variable (a).
        System.out.println ( "*---- after post-decrementing a" );
        System.out.println ( a ); // now the value of a = 11.

        // prefix operator (decrement) or pre-decrement (a--)
        // decrement the original value by one, and then continue the processing
        System.out.println ( "*---- before pre-decrementing a" );
        System.out.println ( --a ); // print a - 1, which is 11 - 1 = 10 and assign this new value tu to (a) in the same time.
        System.out.println ( "*---- after pre-decrementing a" );
        System.out.println ( a );   // now the value of a = 10.
        System.out.println ( "\n****---- The ending value of  a ----****" );
        System.out.println ( a );
        System.out.println ( "****----------------------------------****" );
        System.out.println ( "*---- before inverting the boolean value of b." );
        System.out.println ( b );
        System.out.println ( "*---- after inverting the boolean value of b." );
        System.out.println ( !b ); // This operator is used to invert a boolean value (!a).

    }
    public static void arithmeticOperator(){
        /*
        * Definition:
        * Arithmetic operators are used to performing addition,
        * subtraction, multiplication, division,
        * and modulus. It acts as a mathematical operations.
        * */
        int a = 30;
        int b = 10;
        System.out.println ( a + b ); // (+) ( Addition ) Is Used to add the value of the operands.

        System.out.print(a-b); // (–) ( Subtraction ) Is Used to subtract the right-hand operator with the left hand operator.
        System.out.print("\n");
        System.out.println ( a * b ); // (*) ( Multiplication )  Is Used to multiply the value of the operands.
        System.out.println ( a / b ); // (/) ( Division )  Is Used to divide the left hand operator with right hand operator.
        System.out.println ( a % b ); // (%) ( Modulus ) Is Used to divide the left hand operator with right hand operator.


    }
    public static void assignmentOperator(){
        /*
        * Description:  Assignment operator are used to assign new value
        *               to a variable.
         */

        int a = 20;
        int b = 10;
        int c;
        System.out.println ( c = a ); // The operator (=)  is used to assign the value on the right to the operand on the left.
        System.out.println ( b += a ); // The operator (+=) is used to add right operand to the left operand and assigns the result to the left operand.
        System.out.println ( b -= a); // The operator (-=) is used to subtract right operand from the left operand and assigns the result to the left operand.
        System.out.println ( b *= a ); // The operator (*=) is used to multiply right operand with the left operand and assigns the result to the left operand.
        System.out.println ( b /= a ); // The operator (/=) is used to divides left operand with the right operand and assigns the result to the left operand.
        System.out.println ( b ^= a ); // The operator (^=) is used to performs exponential calculation on operators and assigns value to the left operand
        System.out.println ( b %= a ); // The operator (%=) is used to divide the left-hand operator with right hand operator and assigns the result to left operand.
    }
    public static void logicalOperator(){
        /*
        * Definition:
        *           Logical operators are used to combining two or more conditions or
        *           complement the evaluation of the original condition under consideration.
        * */
        boolean a = true;
        boolean b = false;
        boolean c = true;
        boolean d = false;
        /*******************************  && (Logical AND) ************************************/
        // (&&) This operator returns True if both the operands are true, otherwise, it returns False.
        System.out.print("is (a && b)? =>  ");
        System.out.println ( a  &&  b ); // false cause (b) is false.


        System.out.print("is (a && c)? =>  ");
        System.out.println ( a  &&  c ); // true cause (c) is also true.

        /****************************** || (Logical OR) **************************************/
        // (||) This operator returns True if either the operands are true, otherwise it returns False.
        System.out.print("is (a || b)? =>  ");
        System.out.println ( a || b ); // true cause (a) is true

        /********************************************************************/
        System.out.print("is (b || d)? =>  ");
        System.out.println(b || d); // false cause ( b and d ) are both false

        /******************************  ! (Logical NOT ) **************************************/
        // (!) This operator reverses the logical state of an operand.

        System.out.println(!a);
        System.out.println(!b);
        System.out.println ( ! ( a  &&  b ));
        System.out.println ( ! ( a  ||  b ));
    }


}
