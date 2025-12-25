public class Exercicio14While {
    public static void main(String[] args){

    /* While loop
    The 'while' loop repeats a block of code as long as the specified
    condition is true.
    Example: */

    int i = 0;
    while (i < 5) {
        System.out.println(i);
        i++;
    }
    
    /* Countdown Example
    You can also use a 'while' loop to count down. This example counts
    from 3 to 1, and then prints "Happy new Year!!" at the end:
    Example: */

    int countdown = 3;

    while (countdown > 0) {
        System.out.println(countdown);
        countdown--;
    }

    System.out.println("Happy New Year!!");

    /* The Do/While Loop
    The do/while loop is a variant of the while loop. This loop will execute
    the code block once, before checking if the condition is true. Then it will
    repeat the loop as long as the condition is true. */

    int x = 0;
    do {
        System.out.println(x);
        x++;
    }
    while (x < 5);

    /* Condition is False from the Start
    If the condition is false at the start, a while loop will not run.
    A do... while loop is different: it always executes the code block
    at least once before checking the condition. */

    int n = 10;

    do {
        System.out.println("n is " + n);
        n++;
    } while (i < 5);


    }
}