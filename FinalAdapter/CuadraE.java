package FinalAdapter;

public class CuadraE {
    int carga;

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public int estadoElectricidad(){
        this.carga = (int) (Math.random()*(50+1));
        System.out.println("combustible en :" + carga);
        return carga;
    }

    public void cargar(){
        System.out.println("Par : " + carga);

    }
}