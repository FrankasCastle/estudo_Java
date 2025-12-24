public class JavaTypeCasting {
    public static void main (String[] args) {
        /*Type casting: converter um tipo de valor
        para outro, por exemplo, transformar um int
        em um double. */

        int myInt = 9;
        double myDouble = myInt;
        System.out.println(myInt);
        System.out.println(myDouble);

        /*Narrowing casting: pego um tipo de valor e 
        converto diretamente na nova variavel usando
        o tipo do valor entre parenteses. Isso é 
        necessário pois caso contrário pode resultar
        em perca de dados(por exemplo, perder decimais
        quando converto um double para um int) */

        double myDouble1 = 9.78d;
        int myInt1 = (int) myDouble1;
        System.out.println(myDouble1);
        System.out.println(myInt1);

        // Exemplo de vida real

        int maxScore = 500;
        int userScore = 423;
        double percentage = (double) userScore / maxScore * 100.0d;

        System.out.println("A porcentagem de pontos do jogador é: " + percentage + "% do máximo possível.");


     }

}