import java.util.Date;

public abstract class Usuario {
    private String nombre,apellido,pass,cuil;
    private int edad;
    private Date fechaAlta;

    public String getApellido() {
        return apellido;
    }
    public String getNombre() {
        return nombre;
    }
    public int getEdad() {
        return edad;
    }
    public Date getFechaAlta() {
        return fechaAlta;
    }

    public String getCuil() {
        return cuil;
    }
    public void setCuil(String cuil) {
        this.cuil = cuil;
    }


    public Usuario(String nombre, String apellido, int edad, Date fechaAlta, String cuil, String pass){
        this.nombre= nombre;
        this.apellido= apellido;
        this.edad= edad;
        this.fechaAlta=fechaAlta;
        this.cuil=cuil;
        this.pass=pass;
    }
    public Usuario(String nombre,Date fechaAlta, String cuil, String pass){
        this.nombre= nombre;
        this.fechaAlta=fechaAlta;
        this.cuil=cuil;
        this.pass=pass;
    }
}
