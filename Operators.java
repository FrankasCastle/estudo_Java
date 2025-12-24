public class Operators {
    public static void main (String [] args) {
        /*Em java, podemos realizar operações dentro 
        de variáveis, exemplo: */
        
        int x = 100 + 50;
        System.out.println(x);

        int sum1 = 100 + 50;
        int sum2 = sum1 + 250;
        int sum3 = sum2 + sum2;

        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);

        int a = 10;
        int b = 3;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        /* ++ é um operador de incremento, exemplo:
        a = 10
        ++a = 11
        -- é um valor operador de decremento, exemplo:
        a = 10
        --a = 9 */

        /*Nas operações matetmáticas, se os valores
        forem inteiros, o resultado será um inteiro,
        se quisermos trabalhar com decimais, teremos
        de transformar em double préviamente */

        double c = 10.0d;
        double d = 3.0d;

        System.out.println(c / d);

        // Real life example, incremento e decremento

        int peopleInRoom = 0;

        // 3 people enter

        peopleInRoom++;
        peopleInRoom++;
        peopleInRoom++;
        
        System.out.println(peopleInRoom);

        // 1 person leaves

        peopleInRoom --;

        System.out.println(peopleInRoom);

    }
}