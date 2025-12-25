public class Exercicio15For {
    public static void main (String [] args){

        /*Java For Loop
        When you know exactly how many times you want to loop through a
        block of code, use the 'for' loop instead of a while loop.*/

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        /*Nested Loops
        It is also possible to place a loop inside another loop. This is called
        a nested loop. The "inner loop" will be executed one time for each iteration
        of the "outer loop".
        Example: */

        for (int x = 1; x <= 2; x++) {
            System.out.println("Outer: " + x);

            for (int y = 1; y <= 3; y++) {
                System.out.println(" Inner: " + y);
            }
        }

        /* The for-each Loop
        There is also a "for-each" loop, which is used exclusively to loop through
        elements in an 'array' (or other data structures).
        Example:  */

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};

        for (String car : cars) {
            System.out.println(car);
        }

        

    }
}