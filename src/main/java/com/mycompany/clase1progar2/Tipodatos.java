/*
está clase veremos
los tipdos de datos y entradas en java
 */
package com.mycompany.clase1progar2; // esto es un paquete

public class Tipodatos { // esto es una clase

    public static void main(String[] args) { // permite ejecuta programa
        // datos primitivos
        byte byentero = 127;
        short sentero = 1200;
        int entero = 88899;
        long lentero = 99999;
        // datos con coma flotante
        float decimal = 78.5f;
        double ddouble = 8888.788;
        // datos tipo caracter
        char caracter = 'r';
        String palabra = "Hola a todos ";
        boolean decision = true;
        Integer numero = 90;
        System.out.println("-----------------------------------------------------");
        System.out.println("El dato de la variable del tipo bye es :" + byentero);
        System.out.println("El dato d el variable tipo short es :" + sentero);
        System.out.println("El dato d el variable tipo int es :" + entero);
        System.out.println("El dato d el variable tipo long es :" + lentero);
        System.out.println("______________________________________________");
        System.out.println("El tipo flotante es :" + decimal);
        System.out.println("El tipo dede dato double es :" + ddouble);
        System.out.println("------------------------------------------");
        System.out.println("La tipo de datos caracter es :" + caracter);
        System.out.println("El tipo string es :" + palabra);
        System.out.println("El tipo de booleano :" + decision);
        System.out.println("El tipo de dato integer es :" + numero);

    }
}
