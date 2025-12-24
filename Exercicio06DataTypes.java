public class Exercicio06DataTypes{
    public static void main (String[] args){
        
        /* Data types are divided in two groups:
        Primitive data types - byte, short, int, long,
        float, double, boolean and char.
        Non-primite data types - String, Arrays and Classes */

        // byte can store numbers from -128 to 127.

        byte byteNum = 100;
        System.out.println(byteNum);

        // short can store numbers from -32768 to 32767.

        short shortNum = 5000;
        System.out.println(shortNum);

        /* int can store numbers from 2147483648 to 
        2147483647.
        In general, int data type is the preferred data
        type when create variables with a numeric value. */

        int intNum = 100000;
        System.out.println(intNum);

        // long is a bf number, LoL.
        // Note that you should end the value with an "L"

        long longNum = 15000000000L;
        System.out.println(longNum);

        /*float and double:
        float has a precision of about 6-7 decimal digits.
        double has a precision around 16 digits.
        Therefore, double is safer for most calculations. */

        /*A floating point number can also be scientific
        number with an "e" to indicate the power of 10: */

        float f1 = 35e3f;
        double d1 = 12E4d;
        System.out.println(f1);
        System.out.println(d1);

        /* Boolean Types
        Java has a boolean data type, which can only
        take the values 'true' or 'false': */

        boolean isJavafun = true;
        boolean isVegetablesTasty = false;
        System.out.println(isJavafun);
        System.out.println(isVegetablesTasty);

        /*Characters
        The char data type is used to store a single
        character. The character must be surrounded by
        single quotes, like 'A' or 'c'. */

        char myGrade = 'B';
        System.out.println(myGrade);

        /* We can also use ASCII values.*/

        char myVar1 = 65, myVar2 = 66, myVar3 = 67;
        System.out.println(myVar1);
        System.out.println(myVar2);
        System.out.println(myVar3);

        // Real-Life Example

        int items = 50;
        float costPerItem = 9.99f;
        float totalCost = items * costPerItem;
        char currency = '$';

        System.out.println("Number of items: " + items);
        System.out.println("Cost per item: " + costPerItem + currency);
        System.out.println("Total cost = " + totalCost + currency);

        /* var:
        'var' lets Java infer the variable type, but it
        is not recommended because it makes the code less
        clear and harder to understand. */

        var intNumber = 5;
        System.out.println(intNumber);

        
    
    }
}