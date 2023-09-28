import java.util.Arrays;
import java.util.function.IntBinaryOperator;

public class ArrayManipulation {
    /*
    * Java SE provides several methods for performing array manipulations
    * (common tasks, such as copying, sorting and searching arrays)
    * in the java.util.Arrays class.
    * */

    //1. Array.sort() method:
    // Utility: This method Sorts the specified array into ascending numerical order.
    // Syntax: Array.sort(int[] a)
    // Parameters: a - the array to be sorted
    // Implementation:
    public static void arraySort1(){
        System.out.println("************ sorting an array ************");
        int[] numbers = {30,909,9,6,2,1,3,8,9,15,65,4,10,900};

        System.out.println("The original array is: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        Arrays.sort(numbers);
        System.out.println("\nThe sorted array is: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

    }
    //Or with the
    // Syntax: Array.sort(int[] a, int fromIndex, int toIndex)

    // utility: Sorts the specified range of the array into ascending order. The range to be sorted
        // extends from the index fromIndex, inclusive, to the index toIndex, exclusive.

    // Parameters:
    //  a         - the array to be sorted
    //  fromIndex - the index of the first element, inclusive, to be sorted
    //  toIndex   - the index of the last element, exclusive, to be sorted

    public static void arraySort2(){
        System.out.println("************ sorting a specific rang of an array ************");

        int[] numbers = {30,909,9,6,2,300,3,200,9,15,65,4,1,900};

        System.out.println("The original array is: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        } // result: 30 909 9 6 2 300 3 200 9 15 65 4 1 900


        Arrays.sort(numbers, 5, 10);
        //indexes:   0  1  2 3 4  5   6  7  8  9  10  11  12   13
        //Array  :  30 909 9 6 2 (300 3 200 9 15) 65   4   1  900
        // the targeted range in this example is between two brackets.

        System.out.println("\nThe sorted array is: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
        /*Result*/
        // 30 909 9 6 2 3 4 9 15 65 200 300 1 900


        // SO you can use te same methode with other specific data types such as float[] arrays, double[] arrays, ...
    }
    public static void arraySort3(){
        // Array.ParallelSort() method:
        /*
        * Advantage :
        * parallelSort() method uses concept of MultiThreading
        * which makes the sorting faster as compared to normal sorting method.
        * */
        System.out.println("************ sorting an array Array.ParallelSort() ************");
        int[] numbers = {30,909,9,6,2,1,3,8,9,15,65,4,10,900};

        System.out.print(".......Unsorted Array: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        Arrays.parallelSort(numbers);
        System.out.print(".......sorted Array  : ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
    public static void arraySort4(){
        // Arrays.parallelPrefix() method:
        /*
         * The parallelPrefix method performs a given mathematical function on the elements of the array cumulatively,
         * and then modifies the array concurrently.
         * */
        // Syntax: Arrays.parallelPrefix(T[] array, BinaryOperator<T> op)
        // Parameters:
        // array - the array, which is modified in-place by this method
        // op    - a side-effect-free, associative function to perform the cumulation

        System.out.println("************ sorting an array with Arrays.parallelPrefix() method ************");
        int[] numbers = {3,9,8,6,2,1};

        System.out.print(".......Unsorted Array: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();



        IntBinaryOperator op = (x, y) -> x + y;
        Arrays.parallelPrefix(numbers, op);
        // or simply:
        //Arrays.parallelPrefix(numbers, (x,y) -> x+y);

        System.out.print(".......sorted Array  : ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
    public static void binarySearch(){
        /*
        *Definition:
        *       Searches the specified array of ints for the specified value using the binary search algorithm.
        *       The array must be sorted (as by the sort(int[]) method) prior to making this call.
        *       If it is not sorted, the results are undefined.
        *       If the array contains multiple elements with the specified value,
        *       there is no guarantee which one will be found.
        * */
        /*
        * Syntax: Arrays.binarySearch(int[] a, int key)
        * Parameters:
        *   a - the array to be searched
        *   key - the value to be searched for
        * */
        System.out.println("************ sorting an array with Arrays.parallelPrefix() method ************");
        int[] numbers = {30,909,6,2,1,3,8,9,15,65,4,10,900};

        Arrays.sort(numbers);
        System.out.print(".......sorted Array  : ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
        int target = 65;
        int index = Arrays.binarySearch(numbers, target);

        if (index >= 0){
            System.out.printf("The target number %d, is at the index [%d] of the sorted array\n",target,index);
        } else {
            System.out.printf(" Oops!! The target number %d, not found \n",target);
        }




    }








}
