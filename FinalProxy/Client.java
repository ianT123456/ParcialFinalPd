package FinalProxy;

public class Client {
    public static void main (String[] args){
        ProxyDeAlmacenamiento proxy =  new ProxyDeAlmacenamiento();

        proxy.guardar(new UsuarioRegistrado(23,"Tilin","111111", false));
        proxy.guardar(new UsuarioRegistrado(23,"Onichan","222222", true));
        proxy.guardar(new UsuarioRegistrado(4, "Senpai","333333",true));

    }
}