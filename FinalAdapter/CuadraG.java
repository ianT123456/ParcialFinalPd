package FinalAdapter;

public class CuadraG implements IEmpresaCuadra {
    int combustible = 40;
    @Override
    public int estadoCombustible() {
        return this.combustible;
    }

    @Override
    public void llenarCombustible() {
        this.combustible = (int) (Math.random()*(50+1));
        System.out.println("combustible en :" + estadoCombustible());
    }
}
