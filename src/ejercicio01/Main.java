package ejercicio01;

import javax.swing.*;

public class Main {

    public static void main(String[] args)
    {
        Ecuacion ecuacion = new Ecuacion();

        double valorA;
        double valorB;
        double valorC;

        valorA = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el Valor de A: "));

        valorB = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el Valor de B: "));

        valorC = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el Valor de C: "));
        
        ecuacion.setA(valorA);

        ecuacion.setB(valorB);

        ecuacion.setC(valorC);

        System.out.println(ecuacion.getDiscriminante());
    }
  
    
}