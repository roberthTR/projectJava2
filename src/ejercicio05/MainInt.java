package ejercicio05;

import javax.swing.*;

public class MainInt {
    public static void main(String args[])
    {
        InteresC interesC = new InteresC();
        {
            //Los Valores se usan tipo double y no String 
            double valorCap;

            double valorTasa;

            double valorPeriodo;

            // para usar JOptionPane antes Importar libreria import javax.swing.*;
            valorCap = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el Capital: "));

            valorTasa = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el Tasa (E.Anual): "));

            valorPeriodo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el Periodo (Meses): "));

            //Obtiene los valores
            interesC.setCapital(valorCap);

            interesC.setTasa(valorTasa);

            interesC.setPeriodo(valorPeriodo);

            /***Pruebas  ---> */

           // System.out.println(interesC.TP());

           //la funcion que desear ver
          System.out.println(interesC.ImporAcumulado());

        }
    }
    
}
