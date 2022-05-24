package EMC.ejer02;

import java.util.Scanner;

public class MatrizInversa{

    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese la dimension de la matriz: ");
        int n = input.nextInt();
        double matriz[][]= new double[n][n];
        System.out.println("Ingrese los numeros: ");
        for(int i=0; i<n; i++)
            for(int j=0; j<n; j++)
                matriz[i][j] = input.nextDouble();
        double inversa[][] = invert(matriz);

        System.out.println("La matriz inversa es: ");

        for (int i=0; i<n; ++i) {
            for (int j=0; j<n; ++j)

            {System.out.print(inversa[i][j]+"  ");}

            System.out.println();
        }
        input.close();
    }

    public static double[][] invert(double a[][])
    {
        int n = a.length;
        double x[][] = new double[n][n];
        double y[][] = new double[n][n];
        int index[] = new int[n];
        for (int i=0; i<n; ++i)
            y[i][i] = 1;
//Usando metodo de Gauss

        gauss(a, index);

        for (int i=0; i<n-1; ++i)
            for (int j=i+1; j<n; ++j)
                for (int k=0; k<n; ++k)
                    y[index[j]][k]
                            = a[index[j]][i]*y[index[i]][k];


        // Perform backward substitutions
        for (int i=0; i<n; ++i)             {
            x[n-1][i] = y[index[n-1]][i]/a[index[n-1]][n-1];
            for (int j=n-2; j>=0; --j)                 {
                x[j][i] = y[index[j]][i];
                for (int k=j+1; k<n; ++k)
                {
                    x[j][i] -= a[index[j]][k]*x[k][i];
                }

                x[j][i] /= a[index[j]][j];
            }
        }
        return x;
    }

    public static void gauss(double a[][], int index[])  {

        int n = index.length;
        double c[] = new double[n];

        // Initialize the index
        for (int i=0; i<n; ++i)
            index[i] = i;

        for (int i=0; i<n; ++i) {
            double c1 = 0;
            for (int j=0; j<n; ++j) {
                double c0 = Math.abs(a[i][j]);
                if (c0 > c1) c1 = c0;
            }
            c[i] = c1;
        }

        int k = 0;
        for (int j=0; j<n-1; ++j) {
            double pi1 = 0;
            for (int i=j; i<n; ++i)  {

                double pi0 = Math.abs(a[index[i]][j]);
                pi0 /= c[index[i]];
                if (pi0 > pi1) {
                    pi1 = pi0;
                    k = i;
                }
            }


            int itmp = index[j];
            index[j] = index[k];
            index[k] = itmp;
            for (int i=j+1; i<n; ++i) {
                double pj = a[index[i]][j]/a[index[j]][j];

                a[index[i]][j] = pj;

                for (int l=j+1; l<n; ++l)
                    a[index[i]][l] -= pj*a[index[j]][l];
            }
        }
    }
}