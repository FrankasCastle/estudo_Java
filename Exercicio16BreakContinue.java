public class Exercicio16BreakContinue {
    public static void main (String[] args){

        /* Break
        The 'break' statement is used to exit a loop immediately.
        It can also be used to exit a switch statement.
        Example:  */

        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                break;
            }
            System.out.println(i);
        }

        /* Continue
        The 'continue' statement skips the current loop iteration and
        continues with the next iteration. 
        Example: */

        for (int x = 0; x < 10; x++){
            if (x == 4){
                continue;
            }
            System.out.println(x);
        }

        // We can also use break and continue in while loop:

        /* Real life example
        Imagine processing a list of numbers where you want to skip negative values, but
        stop completely if you find a zero: */

        int [] numbers = {3, -1, 7, 0, 9};
        for (int c : numbers) {
            if (c < 0) {
                continue; //skip negative numbers
            }
            if (c == 0) {
                break; // stop loop when zero is found
            }
            System.out.println(c);
        }

    }
}