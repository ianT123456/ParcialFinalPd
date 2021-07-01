package FinalAdapter;

public class CuadraD implements IEmpresaCuadra {
    int combustible = 15;
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