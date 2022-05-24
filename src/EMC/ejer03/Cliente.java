package EMC.ejer03;

public class Cliente {

    public String nombres;

    public String apepat;

    public String apemat;

    public int dni;

    public Cliente(String nombres, String apepat, String apemat, int dni) {
        this.nombres = nombres;
        this.apepat = apepat;
        this.apemat = apemat;
        this.dni = dni;
    }

    public String getNombres() {
        return this.nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApepat() {
        return this.apepat;
    }

    public void setApepat(String apepat) {
        this.apepat = apepat;
    }

    public String getApemat() {
        return this.apemat;
    }

    public void setApemat(String apemat) {
        this.apemat = apemat;
    }

    public int getDni() {
        return this.dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    
    
}
