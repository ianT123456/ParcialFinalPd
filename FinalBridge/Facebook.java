package FinalBridge;

public class Facebook implements IRedSocial{
    @Override
    public void RedSocial(ISistemaDeInscripcion sistemaInscripcion) {
        System.out.println("Integrando Facebook");
        sistemaInscripcion.showInfo();
    }
}
