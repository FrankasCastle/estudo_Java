public class Exercicio11Booleans {
    public static void main (String[] args){
        
        boolean isJavaFun = true;
        boolean isVegetablesTasty = false;

        System.out.println(isJavaFun);
        System.out.println(isVegetablesTasty);

        int x = 10, y = 9;

        System.out.println(x > y);
        System.out.println(x == 10);
        System.out.println(x == 15);

        int myAge = 25;
        int votingAge = 18;

        System.out.println(myAge >= votingAge);
        
        // Example
        
        if (myAge >= votingAge) {
            System.out.println("Old enough to vote!");
        } else {
            System.out.println("Not old enough to vote.");
        }
    
    }
}