public class OperatorsInJava {
    /*
    * Operators are special symbols that perform specific operations on:
    * one, two, or three operands, and then return a result.
    * */

    /*
    * Types of Java Operators:
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
    public static void shiftOperator(){
        /*
        * Description:
        * A shift operator performs bit manipulation on data by shifting the bits of its first operand right or left.
        * */
        int i = 24;

        // Extra:
        // The binary format of this integer (i) is  ( 11000 ),
        // you can convert any integer to binary format by using this method:  Integer.toBinaryString(int integer_x);
        // and if you want to get the int value of a binary, you can use the methode: Integer.parseInt(String binary_string);
        String binary = Integer.toBinaryString(i);
        System.out.println("********** Before applying shift operator  *************");
        System.out.printf("***************************\n|\tint: %s bits: %s   |\n***************************\n", i, binary);
        System.out.println(binary);





        /****************************************** ( >> ) Right Shift operator ***************************************************/

        // This operator right shifts the bits of the left_operand,
        // the right_operand decides the number of places to shift.
        // Syntax: left_operand  >>  right_operand
        i = i >> 2; // 11000 => (00110 or 110)
        binary = Integer.toBinaryString(i);

        System.out.println("********** after Riht shift by 2 *************");
        System.out.printf("***************************\n|\tint: %s bits: %s   |\n***************************\n", i, binary);








        /****************************************** ( << ) Left Shift operator ***************************************************/

        // This operator left shifts the bits of the left_operand,
        // the right_operand decides the number of places to shift.
        // Syntax: left_operand  <<  right_operand
        i = 24; // 11000
        i = i << 2; // 11000 => 1100000
        binary = Integer.toBinaryString(i);
        System.out.println("********** after Left shift by 2 *************");
        System.out.printf("***************************\n|\tint: %s bits: %s |\n***************************\n", i, binary);

        /*
        * if you still confused about this operators
        * think like so:
        * the right_operand is a number of places (bits)
        * you can add those places to your binary string, or you can remove them from.
        * NB: the removing or adding those places are always be applying to the end of the binary string.
        * with the left_shift (<<) we add those places as a zeros to the end.
        * with the right_shift (>>) we remove those number of bits from the end also.
        *
        * Ex: 20 <=> '10100'.
        *   I: so if the syntax is like 20 << 3.
        *       we have two (informations)
        *       1: right_operand = 3 so 3 places
        *       2: (<<) is left_shift operator,  we should ((Add)) 3 places as a zeros to the end.
        *       result:  '10100' + '000' so the whole string wil be like '10100000'
        *       and if we convert this string to int value we will get 160.
        *   II: like so, if the syntax is like 20 >> 3.
        *       we have two (informations) again.
        *       1: right_operand = 3 so 3 places. is the same like above.
        *       2: (>>) is right_shift operator, so we  should ((remove)) 3 places as a bits from the end.
        *       result:  '10(100)' - '100' so the new string wil be like '10'.
        *       and if we convert this string to int value we will get 2.
        * *********** now go back to the code above and try to replace the variable (i) by 20 and the right operend
        * *********** by 3. to get those theoretical results.
        * */



    }


}
