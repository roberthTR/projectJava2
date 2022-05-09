package ejercicio05;

public class InteresC
{
    private double capital;

    private double tasa;

    private double periodo;

    private Math math;

    //establecer atributo
    public void setCapital(double capital){
        this.capital= capital;
    }
    
    public void setTasa(double tasa){
        this.tasa= tasa;
    }
    
    public void setPeriodo(double periodo){
        this.periodo= periodo;
    }
    //obtener atributo
    public double getCapital(){
        return capital;
    }
    
    public double getTasa(){

        tasa = tasa/100;
        return tasa;
    }
    
    public double getPeriodo(){

        periodo = periodo/12;
        return  periodo;
    }

    public  double ImporAcumulado()
    {
        double importA;
        // Importe Acumulado
        importA = this.getCapital()*math.pow(1+this.getTasa(),this.getPeriodo());
        // Math. pow()  = base^exponente
        return importA;
    }
    
    //revisar y ejemplo Tasa y Periodo

    public double TP()
    {
        double tasaP;
        tasaP = Math.pow(1+this.getTasa(),this.getPeriodo());

        return tasaP;
    }

}
