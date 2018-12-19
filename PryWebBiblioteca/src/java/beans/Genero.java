
package beans;

public class Genero {
    
    private String id_genero,nom_genero;
    
     public Genero() {
    }
    

    public Genero(String id_genero, String nom_genero) {
        this.id_genero = id_genero;
        this.nom_genero = nom_genero;
    }

    public String getId_genero() {
        return id_genero;
    }

    public void setId_genero(String id_genero) {
        this.id_genero = id_genero;
    }

    public String getNom_genero() {
        return nom_genero;
    }

    public void setNom_genero(String nom_genero) {
        this.nom_genero = nom_genero;
    }

   
    
    
}
