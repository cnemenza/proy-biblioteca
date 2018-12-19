
package beans;


public class Autor {
    private String id_autor,nom_autor,ape_autor,nacion_autor,nacimiento;

    public Autor() {
    }

    public Autor(String id_autor, String nom_autor, String ape_autor, String nacion_autor, String nacimiento) {
        this.id_autor = id_autor;
        this.nom_autor = nom_autor;
        this.ape_autor = ape_autor;
        this.nacion_autor = nacion_autor;
        this.nacimiento = nacimiento;
    }

    public String getId_autor() {
        return id_autor;
    }

    public void setId_autor(String id_autor) {
        this.id_autor = id_autor;
    }

    public String getNom_autor() {
        return nom_autor;
    }

    public void setNom_autor(String nom_autor) {
        this.nom_autor = nom_autor;
    }

    public String getApe_autor() {
        return ape_autor;
    }

    public void setApe_autor(String ape_autor) {
        this.ape_autor = ape_autor;
    }

    public String getNacion_autor() {
        return nacion_autor;
    }

    public void setNacion_autor(String nacion_autor) {
        this.nacion_autor = nacion_autor;
    }

    public String getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(String nacimiento) {
        this.nacimiento = nacimiento;
    }
    
    
}
