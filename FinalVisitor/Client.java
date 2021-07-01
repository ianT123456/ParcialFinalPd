package FinalVisitor;

public class Client {
    public static void main(String[] args){
        LaPaz laPaz = new LaPaz("La Paz", 5, 1000, "0 gc", 200);
        Cochabamba cochabamba = new Cochabamba("Cochabamba", 3, 2000, "15 gc", 300);
        SantaCruz santaCruz = new SantaCruz("SantaCruz", 2, 3000, "30 gc", 400);
        Turista turista = new Turista("Tilin", 8000, 11111);
        Turista turista1 = new Turista("Senpai", 9000, 22222);
        laPaz.accept(turista);
        cochabamba.accept(turista);
        santaCruz.accept(turista);
    }
}
