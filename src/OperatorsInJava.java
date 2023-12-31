import java.util.Scanner;

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
    public static void bitwiseOperator(){
        /*
        * Definition:
        *       A bitwise operator in Java is a symbol/notation that performs a specified operation on standalone bits,
        *  taken one at a time. It is used to manipulate individual bits of a binary number,
        *  and can be used with a variety of integer types – char, int, long, short, byte.
        * */
        int a = 23; // 10111
        int b = 21; // 10101

        String binary_a = Integer.toBinaryString(a);
        String binary_b = Integer.toBinaryString(b);
        System.out.printf("***************************\n|\tint: %s Binary: %s   |\n***************************\n", a, binary_a);
        System.out.printf("***************************\n|\tint: %s Binary: %s   |\n***************************\n", b, binary_b);


        /***************************** & (Bitwise AND) *************************/
        // This operator takes two numbers as operands and does AND on every  bit of two numbers.
        // EX  : 1 & 1 = 1
        // but : 1 & 0 = 0 or 0 & 0 = 0
        // like: (true and true) is true
        // but:  (true and false) is false.

        // SO:

        // 23   => 10111
        // &    => &&&&&
        // 21   => 10101
        //         -----
        //result=> 10101 => 21
        System.out.println("******** & (Bitwise AND) ********");
        System.out.println ( a&b );

        /***************************** | (Bitwise OR) *************************/
        // This operator takes two numbers as operands and does OR on every  bit of two numbers.
        // EX  : 1 | 1 = 1 or 1 | 0 = 0
        // but : 0 | 0 = 0
        // like: (true or true) is true or (true or false) is also true.
        // but:  (false and false) is  always false.

        // SO:

        // 23   => 10111
        // |    => |||||
        // 21   => 10101
        //         -----
        //result=> 10111 => 23
        System.out.println("******** | (Bitwise OR) ********");
        System.out.println ( a|b );

        /***************************** ^ (Bitwise XOR) *************************/
        // This operator takes two numbers as operands and does XOR on every  bit of two numbers.


        // 23   => 10111
        // ^    => ^^^^^
        // 21   => 10101
        //         -----
        //result=> 00010 => 10 (In Binary) => 2 (In decimal)
        System.out.println("******** ^ (Bitwise XOR) ********");
        System.out.println ( a^b );


        /***************************** ~ (Bitwise NOT) *************************/
        // This operator takes one number as an operand and does invert all bits of that number.
        int d = 5;
        // 5   =>  0101
        //         -----
        //result=>  1010 => = 10 (In decimal) but the Compiler will give the second complement of that number,
        //                                     the second complement of 10 will be -6.
        System.out.println("******** ~ (Bitwise NOT) ********");
        System.out.println ( ~d );
    }
    public static void ternaryOperator(){
        /*
        * Description:
        *       Ternary operator is a conditional operator,
        *       it reduces the line of code while performing the conditional or comparisons.
        *       It is the replacement of if-else or nested if-else statements.
        *       It is also referred to as inline if, conditional operator, or ternary if.
        *       (we will discuss more about conditional statements topic later on)
        * */

        // Syntax : ( Condition ) ? ( Statement1 ) : ( Statement2 );

        /*
        * so this syntax: if(condition) {
        *                    do Statement1;
        *                  }else {
        *                    do Statement2
        *                  }
        *
        *
        * Becomes        : ( Condition ) ? ( Statement1 ) : ( Statement2 );
        *
        * */
        // Exercise and Implementation:
        /*
        *so let's make a greeting program that greets a user by his gender and name:
        * if the user's gender is male the program will say       => "Welcome Mr. user_name"
        * and if the user's gender is female the program will say => "Welcome, Ms. user_name"
        * */
        String user_name;
        String gender;
        Scanner input = new Scanner(System.in);

        System.out.print(" Hello! what's your name?: ");
        user_name = input.next();
        System.out.print("'male' Or 'female': ");
        gender = input.next();
        String greeting_male = "Welcome, Mr. ";
        String greeting_female= "Welcome, Ms. ";
        System.out.println(gender);
        String greeting_message = (gender.equals("male")) ? greeting_male : greeting_female;

        System.out.printf(greeting_message + user_name);



    }
    public static void relationalOperator(){
        /*
        * Description:
        *   Relational operators compares two numbers and returns a boolean value.
        *   Those operators are used to define a relation or test between two operands.
        * */
        int  a = 100;
        int  b = 200;

        /***************  < (Less than) ********************************/
        System.out.println ( a < b );

        /***************  > (Greater than) ******************************/
        System.out.println(  a > b );

        /***************  <= (Less than or equal to) ********************/
        System.out.println ( a <= b );

        /***************  >= (Greater than or equal to) ******************/
        System.out.println (a >= b );

        /***************  == (Equal to) **********************************/
        System.out.println ( a == b );

        /***************  != (Not equal to) ******************************/
        System.out.println ( a != b );
    }


}
