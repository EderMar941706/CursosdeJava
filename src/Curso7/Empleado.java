package Curso7;

public class Empleado extends Persona{
    private String empeadoId;
    private String title;

    public Empleado(){
        super("Eder");
        System.out.println("El empleado es el contructor");
               
    }

    public String getEmpeadoId() {
        return empeadoId;
    }

    public void setEmpeadoId(String empeadoId) {
        this.empeadoId = empeadoId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
