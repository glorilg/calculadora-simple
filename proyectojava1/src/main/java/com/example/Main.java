package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("calculadora simple");
        
        double numero1;
        double numero2;
        char operacion;
        double resultado;

        Scanner scanner = new Scanner(System.in);

        System.out.println("ingrese el primer numero:");
        numero1 = scanner.nextInt();

        System.out.println("ingrese el segundo numero");
        numero2= scanner.nextInt();

        System.out.println("ingrese la operacion (+, -, *, /)");
        operacion = scanner.next().charAt(0);

        if (operacion == '+') {resultado = numero1 + numero2; } 
        else if (operacion ==  '-') {resultado = numero1 - numero2; }
        else if (operacion == '*') { resultado = numero1 * numero2; }
        else if (operacion == '/') { if (numero2 != 0) {resultado = numero1 / numero2; } 
        else { System.out.println("Error: division por cero.");
        scanner.close();
        return; }
        else { System.out.println("Error: operacion invalida.");
        scanner.close();
        return; } }
        System.out.println("El resultado es: " + resultado);
        scanner.close();
        
        if (numero1 > numero2) {System.out.println("el primer numero es mayor que el segundo"); }
        else if (numero1 < numero2) { System.out.println("el segundo numero es mayor que el primero"); }
        else { System.out.println("los numeros son iguales"); }

        if (numero1 % 2 == 0) { System.out.println("el primer numero es par"); }
        else { System.out.println("el primer numero es impar"); }
        if (numero2 % 2 == 0) { System.out.println("el segundo numero es par"); }
        else { System.out.println("el segundo numero es impar"); }

        int resultadoEntero = (int) resultado;
        System.out.println("El valor de resultadoEntero es: " + resultadoEntero);

        if (numero1 > 10 && numero2 > 10) {System.out.println("los dos numeros son positivos y mayor que 10.");
            else if (numero1 <= 0 || numero2 <= 0) {System.out.println("al menos uno de los numeros es negativo o igual a cero");
            else {System.out.println("los numeros no cumplen con ninguna de las condiciones");

            scanner.close();
        }




        

     
            
           






          
                

    





    }
}