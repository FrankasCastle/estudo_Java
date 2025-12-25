public class Exercicio13Switch {
    public static void main (String[] args){

        /* Java Switch Statements
        Instead of writing many if...else statements, you can use the switch.
        The 'switch' expression is evaluated once.
        The result is compared with each 'case' value.
        If there is a match, the matching block of code runs.
        The 'break' statement stops the switch after the matching case has run.
        The 'default' statement runs if there is no match. 
        Example: */

        int day = 4;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }

        /* The break Keyword
        When Java reaches a 'break' keyword, it breaks out of the switch block.
        This will stop the execution of more code and case testing inside the block. */

        /* The default Keyword
        The 'default' keyword specifies some code to run if there is no case match.
        Example: */

        switch(day) {
            case 6:
                System.out.println("Today is Saturday");
                break;
            case 7:
                System.out.println("Today is Sunday");
                break;
            default:
                System.out.println("Looking forward to the Weekend");
        }

    }
}