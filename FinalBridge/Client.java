package FinalBridge;

public class Client {
    public static void main(String[]args){
        ISistemaDeInscripcion colegio = new SistemaDeColegio(new Facebook());
        int[] estudiantes = {1,2,3,4,5};
        ((SistemaDeColegio) colegio).setNombre("Elite school");
        ((SistemaDeColegio) colegio).setCapacidad(123);
        ((SistemaDeColegio) colegio).setEstudiantes(estudiantes);
        ((SistemaDeColegio) colegio).setRequisitos("ci");
        colegio.newRedSocial();

        ISistemaDeInscripcion escuela = new SistemaDeEscuela(new WhatsApp());
        int[] estudiantes2 = {1,2,3,4,5};
        ((SistemaDeEscuela) escuela).setNombre("Highlanders");
        ((SistemaDeEscuela) escuela).setCapacidad(321);
        ((SistemaDeEscuela) escuela).setEstudiantes(estudiantes2);
        ((SistemaDeEscuela) escuela).setRequisitos("ci");
        escuela.newRedSocial();

        ISistemaDeInscripcion universidad = new SistemaDeUniversidad(new Twitter());
        int[] estudiantes3 = {1,2,3,4,5};
        ((SistemaDeUniversidad) universidad).setNombre("Utasawa");
        ((SistemaDeUniversidad) universidad).setCapacidad(111);
        ((SistemaDeUniversidad) universidad).setEstudiantes(estudiantes3);
        ((SistemaDeUniversidad) universidad).setRequisitos("ci");
        universidad.newRedSocial();

    }
}
