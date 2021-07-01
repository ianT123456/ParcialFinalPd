package FinalVisitor;

import java.util.Random;

public class Turista extends ATurista {
    public Turista(String name, int valor, int ci) {
        super(name, valor, ci);
    }

    @Override
    public void visit(LaPaz laPaz) {
        Random random = new Random();
        System.out.println("Visitando " + laPaz.name);
        int montoneg = random.nextInt(valor /2);
        System.out.println("El monto de dinero que gastare es de " + montoneg + "bs");
        valor -=montoneg;
        System.out.println("Saldo restante: " + valor);
    }

    @Override
    public void visit(Cochabamba cochabamba) {
        System.out.println("Visitando " + cochabamba.name);
        System.out.println("El monto de dinero que gastare es de " + 10*cochabamba.numeroHab/100 + "bs");
        valor -=10*cochabamba.numeroHab/100;
        System.out.println("Saldo restante: " + valor);
    }

    @Override
    public void visit(SantaCruz santaCruz) {
        System.out.println("Visitando " + santaCruz.name);
        System.out.println("El monto de dinero que gastare es de " + santaCruz.ndp /2 + "bs");
        valor -=santaCruz.ndp /2;
        System.out.println("Saldo restante: " + valor);
    }


}
