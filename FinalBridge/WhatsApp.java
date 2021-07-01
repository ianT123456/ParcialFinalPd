package FinalBridge;

public class WhatsApp implements IRedSocial{
    @Override
    public void RedSocial(ISistemaDeInscripcion sistemaInscripcion) {
        System.out.println("Integrando WhatsApp");
        sistemaInscripcion.showInfo();
    }
}
