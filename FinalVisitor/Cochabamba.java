package FinalVisitor;

public class Cochabamba extends ADepartamento {
    public Cochabamba(String name, int ndp, int nh, String clima, int dineroT) {
        super(name, ndp, nh, clima, dineroT);
    }

    @Override
    public void accept(ATurista turista) {
        turista.visit(this);
    }
}
