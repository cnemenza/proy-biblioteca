
package beans;


public class Empleado {
    
    private String id_empleado,nom_empleado,ape_empleado,dni_empleado,fechaing_empleado,
            status_empleado;

    public Empleado() {
    }

    public Empleado(String id_empleado, String nom_empleado, String ape_empleado, String dni_empleado, String fechaing_empleado, String status_empleado) {
        this.id_empleado = id_empleado;
        this.nom_empleado = nom_empleado;
        this.ape_empleado = ape_empleado;
        this.dni_empleado = dni_empleado;
        this.fechaing_empleado = fechaing_empleado;
        this.status_empleado = status_empleado;
    }

    public String getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(String id_empleado) {
        this.id_empleado = id_empleado;
    }

    public String getNom_empleado() {
        return nom_empleado;
    }

    public void setNom_empleado(String nom_empleado) {
        this.nom_empleado = nom_empleado;
    }

    public String getApe_empleado() {
        return ape_empleado;
    }

    public void setApe_empleado(String ape_empleado) {
        this.ape_empleado = ape_empleado;
    }

    public String getDni_empleado() {
        return dni_empleado;
    }

    public void setDni_empleado(String dni_empleado) {
        this.dni_empleado = dni_empleado;
    }

    public String getFechaing_empleado() {
        return fechaing_empleado;
    }

    public void setFechaing_empleado(String fechaing_empleado) {
        this.fechaing_empleado = fechaing_empleado;
    }

    public String getStatus_empleado() {
        return status_empleado;
    }

    public void setStatus_empleado(String status_empleado) {
        this.status_empleado = status_empleado;
    }

   
    
}
