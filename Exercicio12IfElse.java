public class Exercicio12IfElse{
    public static void main (String [] args){

        /* Conditions and if Statements
        if is a statement who needs a condition that results
        in true or false
        if statements work hand-in-hand with boolean values. */

        boolean isRaining = true;

        if (isRaining){
            System.out.println("Bring an umbrella!");
        }

        /* The if statement specifies a block of code to be 
        executed if a condition is "true" */

        /* if Without Braces
        If an if statement has only one line of code, we can write it 
        without curly braces "{ }"
        Example: */

        if (20 > 18)
            System.out.println("20 is greater than 18.");

        /* Potential problem
        Whithout braces, only the first line after the if belongs to it.
        Any other lines will run no matter what, witch can lead to unexpected
        results. */

        /* The safe way
        To avoid mistakes, always use curly braces "{}". This makes it clear
        which lines belong to the if statement.
        Example: */

        int x = 20, y = 18;

        if (x > y) {
            System.out.println("x is greater than y");
            System.out.println("Both lines are part of the if");
        }

        /* The else Statement
        The else statement lets you run a block of code when the condition in the
        if statement is false
        Example: */

        boolean isRaining1 = false;

        if(isRaining1) {
            System.out.println("Bring an umbrella!");

        } else {
            System.out.println("No rain today, no need for an umbrella!");
        }

        /* Else If
        Use the else if statement to specify a new condition if the first
        condition is false.
        Example: */

        int weather = 2; // 1 = raining, 2 = sunny, 3 = cloudy

        if (weather == 1) {
            System.out.println("Bring an Umbrella.");
        } else if (weather == 2) {
            System.out.println("Wear sunglasses.");
        } else {
            System.out.println("Just go outside normally.");
        }

        /* Short Hand if...else
        it uses three operands and allows replacing simple if...else
        statements with a single line of code, using "?"
        The ? check the condition, if the condition match, it will
        output the result. */

        int time = 20;
        String result = (time < 18) ? "Good day" : "Good evening.";
        System.out.println(result);

        /*Nested Ternary
        We can nest ternary operators to handle more than two possible outcomes,
        but this can make your code harder to read: */

        int time1 = 22;
        
        String message = (time1 < 12) ? "Good Morning."
                       : (time1 < 18) ? "Good afternoon."
                       : "Good evening.";
        System.out.println(message);

        /* Nested if
        You can also place an if inside another if. This is called a nested if.
        A nested if lets you check for a condition only if another condition 
        is already true. */
        
        int a = 15, b = 25;

        if (a > 10) {
            System.out.println("a is greater than 10");

            if (b > 20) {
                System.out.println("b is also greather than 20");
            }
        }

        /* Logical Operators in Conditions
        We can combine or reverse conditions using logical operators.
        && = AND
        || = OR
        ! = NOT */



    }
}