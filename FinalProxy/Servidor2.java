package FinalProxy;

import java.util.ArrayList;
import java.util.List;

public class Servidor2 implements ICluster {
    private String ip;
    private String Host;
    private List<UsuarioRegistrado> listaU2;

    public Servidor2() {
    }

    public Servidor2(String ip, String host_name) {
        this.ip = ip;
        this.Host = host_name;
        this.listaU2 = new ArrayList<>();
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getHost() {
        return Host;
    }

    public void setHost(String host) {
        this.Host = host;
    }

    public List<UsuarioRegistrado> getListaU2() {
        return listaU2;
    }

    public void setListaU2(List<UsuarioRegistrado> listaU2) {
        this.listaU2 = listaU2;
    }

    @Override
    public void guardar(UsuarioRegistrado user) {
        System.out.println("Usuario registrado....");
        listaU2.add(user);
        user.showInfo();
    }
}
