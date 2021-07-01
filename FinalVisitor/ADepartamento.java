package FinalVisitor;

public abstract class ADepartamento {
    protected String name;
    protected int ndp;
    protected int numeroHab;
    protected String clima;
    protected int dineroT;

    public ADepartamento(String name, int ndp, int nh, String clima, int dineroT) {
        this.name = name;
        this.ndp = ndp;
        this.numeroHab = nh;
        this.clima = clima;
        this.dineroT = dineroT;
    }

    public abstract void accept(ATurista turista);
}
