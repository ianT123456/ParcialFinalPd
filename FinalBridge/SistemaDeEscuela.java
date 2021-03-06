package FinalBridge;

public class SistemaDeEscuela implements ISistemaDeInscripcion {
    private IRedSocial redSocial;
    private String nombre;
    private int capacidad;
    private int estudiantes[];
    private String requisitos;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int[] getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(int[] estudiantes) {
        this.estudiantes = estudiantes;
    }

    public String getRequisitos() {
        return requisitos;
    }

    public void setRequisitos(String requisitos) {
        this.requisitos = requisitos;
    }

    public SistemaDeEscuela(IRedSocial redSocial){
        this.redSocial=redSocial;
    }

    @Override
    public void newRedSocial() {
        System.out.println("Agregar");
        redSocial.RedSocial(this);
    }
    @Override
    public void showInfo(){
        System.out.println("nombre: "+ nombre);
        System.out.println("capacidad: "+ capacidad);
        System.out.println("estudiantes: "+ estudiantes.length);
        System.out.println("requisitos: "+ requisitos);
    }
}
