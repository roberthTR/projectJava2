package EMC.ejer01;

public class Main {

    public Main() {
    }

    public static void main(String[] args) {
        Matricula matricula = new Matricula("Roberth Torres", 2019160036);
        System.out.println("Estudiante: " + matricula .getEstudiante());
        System.out.println("Codigo: " + matricula .getCod());
        System.out.println();
        matricula.agregarCurso(new Curso("Matemática", "Jose Luis"));
        System.out.println("Curso 1: "+matricula.mostrarCurso().getNumCurso());
        System.out.println("Docente: "+matricula.mostrarCurso().getDocente());
        System.out.println();
        matricula.agregarCurso(new Curso("Lenguaje", "Dina Flores"));
        System.out.println("Curso 2: "+matricula.mostrarCurso().getNumCurso());
        System.out.println("Docente: "+matricula.mostrarCurso().getDocente());
        System.out.println();
        matricula.agregarCurso(new Curso("Ingles", "Miguel Angel"));
        System.out.println("Curso 3: "+matricula.mostrarCurso().getNumCurso());
        System.out.println("Docente: "+matricula.mostrarCurso().getDocente());
      
    }
    
}


