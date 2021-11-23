package com.mycompany.clase1progar2;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class entrada { // el porcentaje del examen final es 30%
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); // Scanner entrada por teclado
        double examenfinal;
        String nombre;
        String direccion;
        int nota;
        direccion = JOptionPane.showInputDialog("Digite la direccion del cliente");
        nota=Integer.parseInt(JOptionPane.showInputDialog("Digite la nota del estudiante")); 
        System.out.println("Ingrese nombre del alumno");
        nombre = entrada.nextLine();
        System.out.println("Ingrese nota final con base a 100 ");
        examenfinal = entrada.nextDouble();
        examenfinal *= 0.30;
       System.out.println(nombre + " tiene una nota en examen fianl de:" + examenfinal);
        JOptionPane.showMessageDialog(null, " La direccion es :" + direccion
                + " \n la nota es :" + nota);
    }
}
