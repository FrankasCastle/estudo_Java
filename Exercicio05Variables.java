public class Exercicio05Variables {
    public static void main (String[] args){
        String name = "Mariana";
        System.out.println(name);
        
        /* I categorized a variable as a string and 
        assigned a string value to it. */
        
        int myNum = 42;
        System.out.println(myNum);

        // Here I did the same thing, but as an integer.

        /* We can also declare a variable without 
        assigning the value, and assign the value later. */

        int myNum2;
        myNum2 = 1507;
        System.out.println(myNum2);

        /* In Java, we can also update the value of an
        existing variable. */

        myNum2 = 1112;
        System.out.println(myNum2);

        /* If we add 'final' to a variable, its value
        cannot be changed. */

        final int myNum3 = 3005;
        System.out.println(myNum3);

        // To combine both text and variable, use +.

        System.out.println("Olá " + name + "!");

        /*  We can also use + to add variable to another
        variable. */

        String lastName = "Sena";
        String fullName = name + " " + lastName;
        System.out.println(fullName);

        /* In Java, the + symbol has two meanings:
        
        - For text (strings), it joins them together
        (concatenation).
        - For numbers, it adds values together. */

        int x = 5;
        int y = 6;

        System.out.println(x + y);

        // Print the value of x + y.

        /* Without parentheses, numbers are treated
        as text after the first String. */

        System.out.println("The sum is " + x + y);
        System.out.println("The sum is " + (x + y));

        /* To declare more than one variable of the same
        type, we can use comma-separated list. */

        int a = 42, b = 1507, c = 1112;
        System.out.println(a + b + c);

        /* We can also assign the same value to multiple
        variables in one line. */

        int a1, b1, c1;
        a1 = b1 = c1 = 42;
        System.out.println(a1 + b1 + c1);

        // Real life example:

        String studentName = "Lucas Santos";
        int studentID = 478;
        int studentAge = 27;
        float studentFee = 42.42f;
        char studentGrade = 'A';

        System.out.println("Student name: " + studentName);
        System.out.println("Student id: " + studentID);
        System.out.println("Student age: " + studentAge);
        System.out.println("Student fee: " + studentFee);
        System.out.println("Student grade: " + studentGrade);

        









    
    }
}