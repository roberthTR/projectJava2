package ejercicio03;

public class Arreglo {
    
    private int[] valor;

    public Arreglo(int size)
    {
        valor = new int[size];
    }

    public void setValor(int indice, int valores)
    {
        this.valor[indice] = valores;
    }

    public int getValor(int indice)
    {
        return this.valor[indice];
    }
    public static void main(String args[])
    {
        Arreglo arreglo = new Arreglo(9);

        

        arreglo.setValor( 0, 30);
        arreglo.setValor( 1, 45);
        arreglo.setValor( 2, 56);
        arreglo.setValor( 3, 69);
        arreglo.setValor( 4, 72);
        arreglo.setValor( 5, 30);
        
        for(int i=0; 1<5;i++){

           System.out.println( arreglo.getValor(i));
        }
    }
}
