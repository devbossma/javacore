package ControlFlowStatements;
/*
* The if-then statement is the most basic of all the control flow statements.
* It tells your program to execute a certain
* section of code only if a particular test evaluates to true. For example
* */
public class ifStatement {


    public static void ifStatement(){
    // Syntax:
    // if(some-condition == true) then { do something}
    // Implimentation:
        System.out.println("************** if then statement ****************");

        int min_age = 18;
        int age_given_by_an_user = 35;
        if(age_given_by_an_user >= min_age){
            System.out.println("Welcome adult!");
        }
    }
    public static void ifThenElse(){
        // Syntax:
        // if(some-condition == true) then {
        // do something
        // }else{
        //  do something else if the condition is false
        // }
        System.out.println("************** if then else statement ****************");
            // Implimentation:

            int min_age = 18;
            int age_given_by_an_user = 17;
            if(age_given_by_an_user >= min_age){
                System.out.println("Welcome adult!");
            }else{
                System.out.println("Sorry! you're not adult enough to make this operation");
            }

    }
    public static void ifThenElseif() {
        // Syntax:
        // if(first condition == true) then {
        //      do something if the first condition is true
        // }elseif(second condition == true) then {
        //  do something  if the second condition is true
        // }else then {
        //      do something if the first and second conditions are both false
        // }
        System.out.println("************** if then else-if statements ****************");
        // Implementation:

        int min_age = 18;
        int max_age = 50;
        int age_given_by_an_user = 17;
        if(age_given_by_an_user < min_age){
            System.out.println("\"Sorry! you're not adult enough to play this Game\"");
        }else if (age_given_by_an_user >= min_age && age_given_by_an_user <= max_age){
            System.out.println("Welcome to your new gaming experience");
        }else {
            System.out.println(" Are you sur you wanna play this game?");
        }
    }

}
