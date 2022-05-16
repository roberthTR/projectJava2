package ejercicio06;

public class SumaMatriz {

    public static void main(String args[])
    {
        
        int [][] arregloA = {{1,2,3},{4,5,6},{7,8,9}};
        int [][] arregloB = {{9,8,7},{6,5,4},{3,2,1}};
        int [][] arregloC = new int [3][3];


        for(int filaA=0; filaA < arregloA.length;filaA++)
        {
            for( int columnaA=0;columnaA < arregloA[filaA].length;columnaA++)
            {
                System.out.printf("%2d",arregloA[filaA][columnaA]);
            }
            System.out.println();
        }
    
        System.out.printf("%n");

        for(int filaB=0; filaB < arregloB.length;filaB++)
        {
            for( int columnaB=0;columnaB < arregloB[filaB].length;columnaB++)
            {   
                System.out.printf("%2d",arregloB[filaB][columnaB]);
            }
            System.out.println();
        }
        
        System.out.println("");

        for(int i=0; i < 3;i++)
        {
            for( int j=0;j < 3;j++)
            {
                System.out.printf("%4d",arregloC[i][j]=(arregloA[i][j]+arregloB[i][j]));
            }
            System.out.println();
        }

    }
}