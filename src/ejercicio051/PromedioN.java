package ejercicio051;

public class PromedioN {

    private double pta;
        // Promedio de tareas academicas
    
    private double emc;
        // Examen de medio curso
    
    private double efc;
        // Examen final de curso

    //constructor
    public PromedioN(double pta, double emc, double efc){

        this.pta = pta;
        this.emc = emc;
        this.efc = efc;
    }
    
    /*public void setPTA(double pta)
    {
        this.pta = pta;
    }
    
    public void setEMC(double emc)
    {
        this.emc = emc;
    }
    
    public void setEFC(double efc)
    {
        this.efc = efc;
    }*/

    public double getPTA()
    {
        return pta;
    }
    
    public double getEMC()
    {
        return emc;
    }
    
    public double getEFC()
    {
        return efc;
    }
    
    public double Promedio()
    {
        double pf;
        //Promedio Final
        pf = (getPTA()+getEMC()+getEFC())/3;

        return pf;
    }

    



    
    
}
