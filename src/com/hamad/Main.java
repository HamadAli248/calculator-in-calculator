package com.hamad;


import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        float firstNumber = 0;
        float secondNumber = 0;
        char operator;
        double answer= 0.0;

        Scanner scanner = new Scanner(System.in);

            System.out.println("Please Enter first Value");
            firstNumber = scanner.nextFloat();

        while(true) {
            System.out.println(" Please Enter operator( + : - : * : / ) ");
            operator = scanner.next().charAt(0);
            if (operator == '+' || operator ==  '-' || operator == '*' || operator == '/' )
            break;
        }

        System.out.println("Please Enter Second Value");
        secondNumber = scanner.nextFloat();

        if (operator == '+') {
            answer = firstNumber + secondNumber;
        } else if (operator == '-'){
            answer = firstNumber - secondNumber;
        }else if (operator == '*'){
            answer = firstNumber * secondNumber;
        }else if (operator == '/'){
            answer = firstNumber / secondNumber;
        }
        System.out.println(firstNumber + " + " + secondNumber + " = " + answer);
    }
}