

package beans;


public class Libro {
    
    private String id_libro,titulo,editorial,autor,autor_nom,genero_nom,genero,fecha,status,idioma,area,stock;

    public Libro() {
    }

    public Libro(String id_libro, String titulo, String editorial, String autor, String autor_nom, String genero_nom, String genero, String fecha, String status, String idioma, String area, String stock) {
        this.id_libro = id_libro;
        this.titulo = titulo;
        this.editorial = editorial;
        this.autor = autor;
        this.autor_nom = autor_nom;
        this.genero_nom = genero_nom;
        this.genero = genero;
        this.fecha = fecha;
        this.status = status;
        this.idioma = idioma;
        this.area = area;
        this.stock = stock;
    }

    public String getId_libro() {
        return id_libro;
    }

    public void setId_libro(String id_libro) {
        this.id_libro = id_libro;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAutor_nom() {
        return autor_nom;
    }

    public void setAutor_nom(String autor_nom) {
        this.autor_nom = autor_nom;
    }

    public String getGenero_nom() {
        return genero_nom;
    }

    public void setGenero_nom(String genero_nom) {
        this.genero_nom = genero_nom;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }
    
    

}