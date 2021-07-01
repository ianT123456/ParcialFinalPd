package FinalAdapter;

public class Client {
    public static void main(String[]args){
        CuadraE caudraElectrica = new CuadraE();

        AdapterCuadraE cEA = new AdapterCuadraE(caudraElectrica);

        System.out.println("Tipo de cuadratrack : Electrico");
        cEA.llenarCombustible();
        cEA.estadoCombustible();
    }
}
