package EMC.ejer01;

public class Curso {
    private String numCurso;
    private String docente;
    
    public Curso(String numCurso, String docente) {
        this.numCurso = numCurso;
        this.docente = docente;
    }

    public String getNumCurso() {
        return this.numCurso;
    }

    public void setNumCurso(String numCurso) {
        this.numCurso = numCurso;
    }

    public String getDocente() {
        return this.docente;
    }

    public void setDocente(String docente) {
        this.docente = docente;
    }

    
}