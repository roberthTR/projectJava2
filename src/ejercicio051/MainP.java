package ejercicio051;

import javax.swing.*;

public class MainP {

    public static void main(String args[]){

        
        {
        double valorPTA;
        double valorEMC;
        double valorEFC;

            valorPTA = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el PTA: "));

            valorEMC = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el EMC: "));

            valorEFC= Double.parseDouble(JOptionPane.showInputDialog("Ingrese el EFC: "));

            PromedioN promedioN = new PromedioN(valorPTA, valorEMC, valorEFC);
        
        //promedioN.setPTA(valorPTA);
        //promedioN.setEMC(valorEMC);
        //promedioN.setEFC(valorEFC);

        System.out.println(promedioN.Promedio());
        }
    }
    
}
