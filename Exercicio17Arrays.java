public class Exercicio17Arrays {
    public static void main (String [] args){

        /* Java Arrays
        Arrays are used to store multiple values in a single variable,
        instead of declaring separate variables for each value.
        To declarate an array, use square brackets '[]' after the type. */

        String[] flowers = {"Roses", "Daisy", "Sunflower", "Lily"};

        // That is an array of flowers.
        // We can also have an array of integers, you just need to categorize.

        /* Access the Elements of an Array
        We can access an array element by referring to the index number.
        This statement accesses the value of the first element in cars: */

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        System.out.println(cars[0]);
        
        /* Change an Array Element
        To change the value of a specific element, refer to the index number: */

        cars [0] = "Opel";
        System.out.println(cars[0]);

        /* Array Length
        To find out how many elements an array has, use the 'lenght' property. */

        System.out.println(cars.length);

        /* Loop Through an Array
        You can loop though an array using a for loop. The lenght property defines
        how many times the loop runs, allowing access to each element one by one.
        Example: */

        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }

        /* Calculate sum of elements
        Using arrays and loops together, we can calculate the sum of all elements
        in an array.
        Example: */

        int [] numbers = {1, 5, 10 ,25};
        int sum = 0;

        for (int x = 0; x < numbers.length; x++) {
            sum += numbers [x];
        }

        System.out.println("The sum is: " + sum);

        /* Access elements in a mutlti-dimensional Array
        To access an element in a two-dimensional array, use two indexes: the first
        for the row and the second for the column.
        Example: */

        int [][] myNumbers = { {1, 4, 2}, {3, 6, 8} };
        
        System.out.println(myNumbers[1][2]);
        System.out.println(myNumbers[0][1]);

        /* Change Element Values
        We can overwrite an existing element using the same two-index notation
        (row, then column).
        Example: */

        myNumbers [1][2] = 9;
        System.out.println(myNumbers[1][2]);

        /* Rows and Columns (Lengths)
        We can use 'length to get the number of rows, and 'myNumbers[row].length
        for the number of columns in a given row.
        Example:  */

        System.out.println("Rows: " + myNumbers.length);
        System.out.println("Cols in row 0: " + myNumbers[0].length);
        System.out.println("Cols in row 1: " + myNumbers[1].length);

        

    }
}