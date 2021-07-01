package FinalProxy;

public class UsuarioRegistrado {
    private Integer userId;
    private String nombre;
    private String uPwd;
    private boolean correcto;

    public UsuarioRegistrado() {
    }

    public UsuarioRegistrado(Integer userId, String nombre, String userPwd, boolean correcto) {
        this.userId = userId;
        this.nombre = nombre;
        this.uPwd = userPwd;
        this.correcto = correcto;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getuPwd() {
        return uPwd;
    }

    public void setuPwd(String uPwd) {
        this.uPwd = uPwd;
    }

    public boolean isCorrecto() {
        return correcto;
    }

    public void setCorrecto(boolean correcto) {
        this.correcto = correcto;
    }

    public void showInfo(){
        System.out.println(" Datos del usuario...");
        if(correcto){
            System.out.println("Contraseña correcto");
            System.out.println("Usuario   : " + nombre);
            System.out.println("Contraseña: (" + uPwd + ")\n\n");
        }else{
            System.out.println("Credenciales invalidas o incorrectas");
            System.out.println("Ingrese los datos nuevamete\n\n");
        }
    }
}
