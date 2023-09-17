public class DataTypes {
    public static void primitiveDataTypes() {
        System.out.println("**** Premetive Data Types ****");

        // ----------------- data types in java -----------------
        // link to this resources: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html


        /*
         * The byte data type is an 8-bit signed two's complement integer.
         * It has a minimum value of -128 and a maximum value of 127 (inclusive)....
         * */
        byte byte8bit; // Default Value = 0
        byte8bit = 126;
        System.out.println("byt: " + byte8bit);

        /*
         * The short data type is a 16-bit signed two's complement integer.
         * It has a minimum value of -32,768 and a maximum value of 32,767 (inclusive)....
         * */
        short short16bit; //Default Value = 0
        short16bit = 32766;
        System.out.println("short: " + short16bit);

        /*
         * By default, the (int) data type is a 32-bit signed two's complement integer,
         * which has a minimum value of -2power31 -1 and a maximum value of 2power31 -1.....
         * The number 26, in decimal
         * int decVal = 26;
         * The number 26, in hexadecimal
         * int hexVal = 0x1a;
         * The number 26, in binary
         * int binVal = 0b11010;
         * */
        int int36bit; //Default Value = 0
        int36bit = 32768;
        System.out.println("int: " + int36bit);
        int decVal = 26;
        System.out.println("The number 26, in hexadecimal: " + decVal);
        int hexVal = 0x1a;
        System.out.println("The number 26, in hexadecimal: 0x1a => " + hexVal);
        int binVal = 0b11010;
        System.out.println("The number 26, in binary: 0b11010 => " + binVal);




        /*
         * The long data type is a 64-bit two's complement integer.
         * The signed long has a minimum value of -2power63 - 1 and a maximum value of 2power63-1....
         * */
        long long64bit; //Default Value = 0L
        long64bit = 3276800L;
        System.out.println("long: " + long64bit);
        // The following example shows other ways you can use the underscore in numeric literals:
        // In Java SE 7 and later, any number of underscore characters (_) can appear anywhere between digits in a numerical literal. This feature enables you, for example.
        // to separate groups of digits in numeric literals, which can improve the readability of your code.
        long creditCardNumber = 1234_5678_9012_3456L;
        System.out.println("creditCardNumber:  " + creditCardNumber);



        /*
         * The float data type is a single-precision 32-bit IEEE 754 floating point.
         * NT: As with the recommendations for byte and short, use a float (instead of double)
         *     if you need to save memory in large arrays of floating point numbers.
         * */
        float float32bit; //Default Value = 0.0f
        float32bit = 101.458819819f;
        System.out.println("float: " + float32bit);



        /*
         * The double data type is a double-precision 64-bit IEEE 754 floating point.
         * */
        double double64bit; //Default Value = 0.0d
        double64bit = 1235.54646486854684684684684;
        System.out.println("double: " + double64bit);
        // same value as double64bit, but in scientific notation
        double64bit = 1.234e2;
        // 1.234e2 => 1.234 * 10 *10 (e=10^0 so e2 = 10^2 = 10*10 = 100)
        System.out.println("scientific notation's result: " + double64bit);
        /*
         * The boolean data type has only two possible values: true and false.
         * */
        boolean trueOrFalse; //Default Value = false
        trueOrFalse = true;
        System.out.println("boolean value: " + trueOrFalse);

        /*
         * The char data type is a single 16-bit Unicode character.
         * It has a minimum value of '\u0000' (or 0) and a maximum value of '\uffff' (or 65,535 inclusive).
         * */
        char char16bit; //Default Value = '\u0000'
        char16bit = 'Y';
        System.out.println("char value: " + char16bit);


    }
    public static void nonPremitiveData(){
        // Non-Premetive Data variables:
        System.out.println("**** Non-Premetive Data Types ****");
        // 1. String
        System.out.println("-- String Type --");
        //1.1 Definition:
            /*
            * a string is an object that represents a number of character values.
            * Each letter in the string is a separate character value that makes up the Java string object.
            * */
        // 1.2 Syntax:

        //  'String' + 'Variable_name' + '=' + '"The value"'

        String name = "yassine";
        // Or
        String name2 = new String("DevBoss");
        System.out.println(name + " " + name2);

        // 2. Arrays
        System.out.println("-- Array Type --");
        // 2.1 Definition:

        /*
        * An array is a container object that holds a fixed number of values of a single type.
        * The length of an array is established when the array is created. After creation, its length is fixed.
        * */

        // 2.2 Syntax:
        // Step 1: declares an array of char
        char[] myArray;

        // Step2: allocates memory for 7 characters
        myArray = new char[7];

        // Step3: initialize the Array's  elements
        myArray[0] = 'D';
        myArray[1] = 'e';
        myArray[2] = 'v';
        myArray[3] = 'B';
        myArray[4] = 'o';
        myArray[5] = 's';
        myArray[6] = 's';

        // this way you can find out what class type of your variable
        System.out.println( myArray.getClass()); // result wil be like : ' class [C ' in tis case Or like  ' class [I ' if you declare an array of int.
        // iterating into a myArray for printing those elements one by one:
        for (char i:myArray
             ) {
            System.out.print(i);
        }





    }
}
