package FinalVisitor;

public class SantaCruz extends ADepartamento {
    public SantaCruz(String name, int ndp, int nh, String clima, int dineroT) {
        super(name, ndp, nh, clima, dineroT);
    }

    @Override
    public void accept(ATurista turista) {
        turista.visit(this);
    }
}
