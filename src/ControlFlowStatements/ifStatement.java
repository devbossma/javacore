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
    public static void ifTthenElse(){
        // Syntax:
        // if(some-condition == true) then {
        // do something
        // }else{
        //  do something else if the condition is false
        // }
        System.out.println("************** if then else stetement ****************");
            // Implimentation:

            int min_age = 18;
            int age_given_by_an_user = 17;
            if(age_given_by_an_user >= min_age){
                System.out.println("Welcome adult!");
            }else{
                System.out.println("Sorry! you're not adult enough to make this operation");
            }

    }
}
