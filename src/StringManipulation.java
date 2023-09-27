public class StringManipulation {
    /*
    *In Java, a string is an object that represents a sequence of characters.
    * It is a widely used data type for storing and manipulating textual data.
    * The String class in Java is provided as a part of the Java standard library
    * and offers various methods to perform operations on strings.
    * Strings are fundamental to Java programming and find extensive usage in various applications,
    * such as user input processing, text manipulation, output formatting, and more.
    * Understanding the characteristics and capabilities of strings in Java is essential for effective string manipulation
    * and developing robust Java applications. When working with Java strings,
    * following best practices to ensure clean and maintainable code is necessary.
    * Here are some essential best practices for string manipulation in Java.
    **/


    // I. Concatenation.
    /*
    * the process of combining two or more strings to form a new string
    * by subsequently appending the next string to the end of the previous strings.
     * */
    public static void stringConcatenation(){
        // 1. StringBuilder() method:
        System.out.println("********************** StringBuilder() method **********************");


        //NB:
            //  We can ofcourse using '+' operator to concatenate two strings But
            //  Avoid using it repeatedly when concatenating multiple strings.
            //  This can create unnecessary string objects, leading to poor performance.
            //  Instead, use StringBuilder (or StringBuffer for thread safety) to efficiently concatenate strings.

        StringBuilder finalStringBuilder = new StringBuilder();
        finalStringBuilder.append("Hello");
        finalStringBuilder.append(" Dear");
        finalStringBuilder.append(" String");
        finalStringBuilder.append(" Builder!");
        String result = finalStringBuilder.toString();
        System.out.println(result); // Hello Dear String Builder!

        //2. StringBuffer() method:
        System.out.println("********************** StringBuffer() method **********************");


        // same exemmple with StringBuffer()
            // NB: If thread safety is not a concern, use StringBuilder instead of StringBuffer.
            // StringBuilder is faster because it’s not synchronized.

        StringBuffer finalStringBuffer = new StringBuffer();
        finalStringBuffer.append("Hello");
        finalStringBuffer.append(" Dear");
        finalStringBuffer.append(" String");
        finalStringBuffer.append(" Buffer!");
        result = finalStringBuffer.toString();
        System.out.println(result); // Hello Dear String Buffer!

        //3. String.Formatting() method:
        System.out.println("********************** String.Formatting() method **********************");


        /*
        * Instead of concatenating values using the “+” operator,
        * use String formatting with placeholders (%s, %d, etc.)
        * to improve readability and maintainability.
        * */
        String name = "Yassine";
        int age = 35;
        String message = String.format("My name is %s and I'm %d years old.", name, age);
        System.out.println(message);// My name is Yassine and I'm 35 years old.



    }
    // II. String Comparison
    public static void  stringComparison(){
        //1. equals() method
        System.out.println("********************** equals() method **********************");
        String str_comp_1 = "Hello";
        String str_comp_2 = "Hello";
        String str_comp_3 = "hello";

        boolean are_equale = str_comp_1.equals(str_comp_2);
        // this methode will retun a boolean true if the two strings are identical (case sensitive)
        System.out.println(are_equale); // true
        are_equale = str_comp_1.equals(str_comp_3);
        System.out.println(are_equale);// false

        //2. equalsIgnoreCase() method.
        System.out.println("********************** equalsIgnoreCase() method **************");
        // this methode will retun a boolean true if the two strings are equals bu (case insensitive)
        are_equale = str_comp_1.equalsIgnoreCase(str_comp_3);
        System.out.println(are_equale);// true

        //3. endsWith() method:
        System.out.println("********************** endsWith() method **********************");


        // this methode will retun a boolean true if the string ends with the specific string or character
        // indicated as a parameter provided to it between two double quotes !!!!("") even if is charater also!!!.
        // (case sensitive)

        boolean endsWith = str_comp_1.endsWith("o");
        System.out.println(endsWith);// true
        endsWith = str_comp_1.endsWith("lO");
        System.out.println(endsWith);// false

        //4. startsWith() method:
        System.out.println("********************** startsWith() method **********************");

        // this methode will retun a boolean true if the string starts with the specific string or character
        // indicated as a parameter provided to it between two double quotes !!!!("") even if is charater also!!!.
        // (case sensitive)
        str_comp_3 = "Hello World!";
        boolean startsWith = str_comp_3.startsWith("H");
        System.out.println(startsWith);// true
        startsWith = str_comp_3.startsWith("he");
        System.out.println(startsWith);// false

        // We can also provide an integer (toffset) to let this method
        // start checking from a specific index in the string
        startsWith = str_comp_3.startsWith("World",6);
        System.out.println(startsWith);// true

        //5. charAt(Int: index) method
        System.out.println("********************** charAt() method **********************");
        // returns the char value of a character in a string at a given or specified index.

        char charat = str_comp_3.charAt(6);
        System.out.println(charat); // W

        //6. toUpperCase() and toLowerCase() metods
        System.out.println("********************** toUpperCase() and toLowerCase() metods **********************");

        str_comp_3= "DevOps";
        System.out.println(str_comp_3);
        System.out.println((str_comp_3.toLowerCase())); // devops
        System.out.println((str_comp_3.toUpperCase())); // DEVOPS

        //7. matches() method:
        System.out.println("********************** matches() method: **********************");

        /*
        * The matches() in java is the method of String class
        * that checks whether a string matches a given regular expression or not.
        * */
        //A regular expression or regex expression is a string pattern
        // mainly used for searching or matching operations.

        String regular_expression = "^([_a-zA-Z0-9-]+(\\.[_a-zA-Z0-9-]+)*@[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)*(\\.[a-zA-Z]{1,6}))?$";

        String email_1 = "user@domain.com";
        String  email_2 = "userdomain.com";
        String  email_3= "user@domaincom";
        String  email_4 = "user@domain.";
        String  email_5 = "@domain.com";


        String message = String.format("This Email '%s' is %b.", email_1, email_1.matches(regular_expression));
        System.out.println(message);
        message = String.format("This Email '%s' is %b.", email_2, email_2.matches(regular_expression));
        System.out.println(message);
        message = String.format("This Email '%s' is %b.", email_3, email_3.matches(regular_expression));
        System.out.println(message);
        message = String.format("This Email '%s' is %b.", email_4, email_4.matches(regular_expression));
        System.out.println(message);
        message = String.format("This Email '%s' is %b.", email_5, email_5.matches(regular_expression));
        System.out.println(message);

        //8. trim() method:
        System.out.println("**********************  trim() method **********************");
        /*
        * Definition:   This method in Java String is a built-in function that eliminates leading and trailing spaces.
        * The Unicode value of space character is '\u0020'.
        * The trim() method in java checks this Unicode value before and after the string,
        * if it exists then removes the spaces and returns the omitted string.
        *
        * */
        String original  = "     Hello, Trim methode!    ";
        System.out.printf("'%s' original sting.",original );
        System.out.print("\n");
        System.out.printf("'%s' with trim method",original.trim());
        System.out.print("\n");

        //9. lenght() method:
        System.out.println("**********************  length() method **********************");
        /* Definition: The Java String class contains a length() method that returns
        *   the total number of characters a given String contains.
        *   This value includes all blanks, spaces,
        *   and other special characters. Every character in the String is counted.
        *   so let's use it with the previous example.
        */
        System.out.printf("originl string, contains %d character.\n", original.length());
        System.out.printf("trimed string, contains %d character.\n",original.trim().length());

        // 10. split() method:
        System.out.println("**********************  split() method **********************");
        /*
        * Definition: The split() in Java is a method defined under the String class which
        * is used to break a string around the matches of the provided regular expression.
        * and it retins an array.
        * The split() in Java is used to break a string based on the provided string delimiter.
        * The string delimiters are mostly comma (','), and full stops ('.') or spaces (" ").
        *
        * */

        String str = "Java is so awesome";
        String[] parts = str.split(" "); // ["Java", "is", "so", "awesome"]
        System.out.println(str);
        for (String part:parts
             ) {
            System.out.println(part);

        }

        // 11. contains() method:
        System.out.println("**********************  contains() method **********************");

        /*
        * Definition: Use the contains() method to check if a string contains a specific substring.
        * and return a boolean type.
        * !!! (case sensitive) !!!!!
        * */
        String serchebal = "Hello World";
        System.out.println(serchebal.contains("World")); // true
        System.out.println(serchebal.contains("world")); // false

        //12. replace() & replaceAll() methods:
        System.out.println("**********************  replace() and replaceALL() methods **********************");
        /*
        * Defintion: Use the replace() or replaceAll()
        * methods to replace occurrences of a substring with another string.
        * */
        String str_1  = "Hello World!";
        System.out.println(str_1.replace("World", "Universe"));// Hello Universe!
        System.out.println(str_1.replaceAll(str_1,"Hi!"));// Hi!

        //13. campareTO() method:
        System.out.println("**********************  compareTO() method **********************");

        /*
        * Definition and Usage
        * The compareTo() method compares two strings lexicographically.
        * The comparison is based on the Unicode value of each character in the strings.
        * The method returns 0 if the string is equal to the other string.
        * */
        String str1 = "FC barçelon";
        String str2 = "FC barcelon";
        int result = str1.compareTo(str2);
        System.out.println(result);// 132

        if (result < 0) {
            // str1 is less than str2
        } else if (result > 0) {
            // str1 is greater than str2
        } else {
            // str1 is equal to str2
        }

        //14. valueOf() or toString() methods:
        System.out.println("**********************  valueOf() or toString() methods **********************");
        /*
        * Defintion: Use the valueOf() or toString() methods to convert other data types to strings.
        * */
        int number = 42;
        double doubleNumber = 123.156;
        String strNumber1 = String.valueOf(number); // "42"
        String strDoubleNumber = String.valueOf(doubleNumber);// 123.156
        System.out.println(strNumber1);
        System.out.println(strDoubleNumber);

        // Alternatively
        String strNumber2 = Integer.toString(number); // "42"
        String strDoubleNumber2 = Double.toString(doubleNumber);// 123.156








    }

}
