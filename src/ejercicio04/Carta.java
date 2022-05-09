package ejercicio04;

public class Carta {
    
private String cara;
private  String palo;

public Carta(String cara, String palo)
{
    this.cara = cara;
    this.palo = palo; 
}

    public String toString()

{
    return this.cara+"de"+this.palo;
}
    
}
