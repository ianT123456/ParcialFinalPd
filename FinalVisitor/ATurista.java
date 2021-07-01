package FinalVisitor;

public abstract class ATurista {
    protected String name;
    protected int valor;
    protected int ci;

    public ATurista(String name, int valor, int ci) {
        this.name = name;
        this.valor = valor;
        this.ci = ci;
    }

    public abstract void visit(LaPaz laPaz);
    public abstract void visit(Cochabamba cochabamba);
    public abstract void visit(SantaCruz santaCruz);
}
