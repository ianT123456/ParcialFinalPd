package FinalAdapter;

public class AdapterCuadraE implements IEmpresaCuadra {
    private CuadraE adapterE;

    public AdapterCuadraE(CuadraE adapterE){
        this.adapterE =adapterE;
    }

    @Override
    public int estadoCombustible() {
        return this.adapterE.estadoElectricidad();
    }

    @Override
    public void llenarCombustible() {
        this.adapterE.setCarga(10);
        this.adapterE.cargar();
    }
}
