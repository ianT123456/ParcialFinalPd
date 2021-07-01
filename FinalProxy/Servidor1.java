package FinalProxy;

import java.util.ArrayList;
import java.util.List;

public class Servidor1 implements ICluster {
    private String ip;
    private String Host;
    private List<UsuarioRegistrado> listaU1;

    public Servidor1() {
    }

    public Servidor1(String ip, String host_name) {
        this.ip = ip;
        this.Host = host_name;
        this.listaU1 = new ArrayList<>();
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

    public List<UsuarioRegistrado> getListaU1() {
        return listaU1;
    }

    public void setListaU1(List<UsuarioRegistrado> listaU1) {
        this.listaU1 = listaU1;
    }

    @Override
    public void guardar(UsuarioRegistrado user) {
        System.out.println("Usuario registrado..");
        listaU1.add(user);
        user.showInfo();
    }
}
