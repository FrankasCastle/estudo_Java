public class Exercicio09Strings{
    public static void main (String[] args){

        //Strings are used for storing text.

        String greeting = "Hello";

        System.out.println(greeting);

        /*String lenght
        String in java is an object, witch means it 
        contains methods that can perform certain 
        operations on strings.
        For example, you can find the lenght of a string
        with the lenght() method: */

        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("The length of the txt string is: " + txt.length());

        /*Uppercase and Lowercase:
        The toUpperCase() method converts a string to upper
        case letters.
        The toLowerCase() converts to lower case letters. */

        String txt1 = "Hello World";
        System.out.println(txt1.toUpperCase());
        System.out.println(txt1.toLowerCase());
        
        /* indexOf()
        The indexOf() method returns the index of the first 
        occurrence of a given text.*/

        String indexOf = "Please locate where 'locate' occurs!";
        System.out.println(indexOf.indexOf("locate"));

        /* charAt()
        The charAt() method returns the specific position in a string.
        Java counts positions from zero.
        0 is the first position, 1 is the second... */

        String txt2 = "Hello";
        System.out.println(txt2.charAt(0));
        System.out.println(txt2.charAt(4));

        /* Comparing strings
        We can use equals() method to compare two strings. */

        String txt3 = "Hello", txt4 = "Hello";
        String txt5 = "Greetings", txt6 = "Great things";

        System.out.println(txt3.equals(txt4));
        System.out.println(txt5.equals(txt6));

        /* Removing Whitespace
        We can use trim() method to remove whitespace from
        the beginning and the end of a string.*/

        String txt7 = "       Hello World          ";
        
        System.out.println("Before: [" + txt7 + "]");
        System.out.println("After: [" + txt7.trim() + "]");

        /* String Concatenation
        We can use the + operator to concatenate strings, but
        we can also use the concat() method to do so. */

        String firstName = "Mariana";
        String lastName = "Sena";

        System.out.println(firstName.concat(lastName));

        /*We can also join more than two strings, and add to a 
        variable. */

        String a = "Java", b = "is", c = "fun!";
        String result = a.concat(b).concat(c);

        System.out.println(result);

        /* Special Characters
        Because strings must be written within quotes, Java will
        misunderstand this string, and generate and error:

        String txt = "We are the so-called "Vikings" from the north.";
        
        To avoid this, we use backslash escape character.
        \' results in a ', a single quote,
        \" results in a ", a double quote,
        \\ results in a \, a backslash. */

        String specString = "We are the so-called \"Vikings\" from the north.";
        
        System.out.println(specString);









    }


}