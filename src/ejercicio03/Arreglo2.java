package ejercicio03;

public class Arreglo2 {
    
    private int [] arreglo;

    private int elemento;

    public Arreglo2(int size){

        arreglo = new int[ size];
        elemento = 0;
    }

    public void setArreglo(int valor)
    {
        this.arreglo[this.elemento] = valor;
        this.elemento++;
    }

    public void getArreglo()
    {

        for (int i=0;i<this.elemento;i++)
        {
            System.out.println(this.arreglo[i]);
        }
   }

   public static void  main(String args[])
   {
       Arreglo2 arreglo2 = new Arreglo2(30);

       arreglo2.setArreglo(6);
       arreglo2.setArreglo(8);
       arreglo2.setArreglo(12);
       arreglo2.setArreglo(16);
       arreglo2.setArreglo(11);
       arreglo2.setArreglo(20);
       arreglo2.setArreglo(22);
      
       arreglo2.getArreglo();
      
   }



}
