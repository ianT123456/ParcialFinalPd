package FinalProxy;

public class ProxyDeAlmacenamiento implements ICluster{
    private int id;
    private Servidor1 server_1 = new Servidor1("192111111111","s1");
    private Servidor1 server_2 = new Servidor1("192222222222","s2");

    public ProxyDeAlmacenamiento() {
    }

    public ProxyDeAlmacenamiento(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public void guardar(UsuarioRegistrado user) {
        id = user.getUserId();
        if(user.isCorrecto()){
            if(isPrime(id)){
                System.out.println("Guardando en s1");
                server_1.guardar(user);
            }else{
                System.out.println("Guardando en s2");
                server_2.guardar(user);
            }
        }else{
            user.showInfo();
        }
    }

    public boolean isPrime(Integer num){
        if(num%2 == 0){
            return false;
        }else if(num < 2){
            return false;
        } else{
            for(int i = 3; i * i < num ; i++){
                i++;
                if (num % i == 0){
                    return false;
                }
            }
        }
        return true;
    }
}
