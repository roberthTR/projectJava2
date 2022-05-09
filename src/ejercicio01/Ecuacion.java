package ejercicio01;

public class Ecuacion {

    private double a;

    private double b;

    private double c;

    public void setA (double a)
    {
        this.a = a;
    }
    
    public void setB (double b)
    {
        this.b = b;
    }
    
    public void setC (double c)
    {
        this.c = c;
    }

    public double getA ()
    {
        return a;
    }
    
    public double getB ()
    {
        return b;
    }
    
    public double getC ()
    {
        return c;
    }
    
    public double getDiscriminante()
    {
        double discriminante;
        discriminante = Math.pow(this.getB(),2)- 4*this.getA()*this.getC();

        return discriminante;
    }




}