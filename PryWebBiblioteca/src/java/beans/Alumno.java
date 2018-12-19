
package beans;


public class Alumno {
    private String id_alumno,nom_alum,ape_alum,dir_alum,carrera_alum,edad_alum,
            cel_alum,dni_alum;

    public Alumno() {
    }

    public Alumno(String id_alumno, String nom_alum, String ape_alum, String dir_alum, String carrera_alum, String edad_alum, String cel_alum, String dni_alum) {
        this.id_alumno = id_alumno;
        this.nom_alum = nom_alum;
        this.ape_alum = ape_alum;
        this.dir_alum = dir_alum;
        this.carrera_alum = carrera_alum;
        this.edad_alum = edad_alum;
        this.cel_alum = cel_alum;
        this.dni_alum = dni_alum;
    }

    public String getId_alumno() {
        return id_alumno;
    }

    public void setId_alumno(String id_alumno) {
        this.id_alumno = id_alumno;
    }

    public String getNom_alum() {
        return nom_alum;
    }

    public void setNom_alum(String nom_alum) {
        this.nom_alum = nom_alum;
    }

    public String getApe_alum() {
        return ape_alum;
    }

    public void setApe_alum(String ape_alum) {
        this.ape_alum = ape_alum;
    }

    public String getDir_alum() {
        return dir_alum;
    }

    public void setDir_alum(String dir_alum) {
        this.dir_alum = dir_alum;
    }

    public String getCarrera_alum() {
        return carrera_alum;
    }

    public void setCarrera_alum(String carrera_alum) {
        this.carrera_alum = carrera_alum;
    }

    public String getEdad_alum() {
        return edad_alum;
    }

    public void setEdad_alum(String edad_alum) {
        this.edad_alum = edad_alum;
    }

    public String getCel_alum() {
        return cel_alum;
    }

    public void setCel_alum(String cel_alum) {
        this.cel_alum = cel_alum;
    }

    public String getDni_alum() {
        return dni_alum;
    }

    public void setDni_alum(String dni_alum) {
        this.dni_alum = dni_alum;
    }
    
    
}
