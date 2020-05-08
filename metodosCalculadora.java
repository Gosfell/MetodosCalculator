package MetodosCalculadora;

import java.util.Scanner;

public class metodosCalculadora {
    private char option;
    private String operation;

    private static void sum(){
        double [] numbers = askForNumbers(false);
        double suma = numbers[0] + numbers [1];
        System.out.println("El total de la suma es: "+suma);
    }

    private void substract() {
        double [] numbers = askForNumbers(false);
        double resta = numbers[0] - numbers [1];
        System.out.println("El total de la resta es: "+resta);
    }

    private void divide() {
        double [] numbers = askForNumbers(true);
        double division = numbers[0]/numbers[1];
        System.out.println("El total de la division es "+division);
    }

    private void powerNumber(){
        double [] numbers = askForNumbers(false);
        double result = Math.pow(numbers[0],numbers[1]);
        System.out.println("El resultado es: "+result);
    }
}
