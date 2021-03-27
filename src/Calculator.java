public class Calculator {

    private static double add(double firstNumber, double secondNumber){
        return  firstNumber+secondNumber;
    }

    private static double subtract(double firstNumber, double secondNumber){
        return firstNumber-secondNumber;
    }


    public static void main(String[] args) {
        System.out.println(add(123.55,200.30));
        System.out.println(subtract(123.55,200.30));
    }
}
