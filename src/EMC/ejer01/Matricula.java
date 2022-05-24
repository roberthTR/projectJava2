package EMC.ejer01;

public class Matricula {
    private String estudiante;
    private int cod;
    
    private Curso curso;
  
    public Matricula(String estudiante, int cod) {
        this.estudiante = estudiante;
        this.cod = cod;
    }

    public String getEstudiante() {
        return this.estudiante;
    }

    public int getCod() {
        return this.cod;
    }

    public void agregarCurso(Curso curso) {
        this.curso = curso;
    }

    public Curso mostrarCurso() {
        return this.curso;
    }

    
}

