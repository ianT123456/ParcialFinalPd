package FinalBridge;

public class Twitter implements IRedSocial{
    @Override
    public void RedSocial(ISistemaDeInscripcion sistemaInscripcion) {
        System.out.println("Integrando Twitter");
        sistemaInscripcion.showInfo();
    }
}
