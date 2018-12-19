    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

/**
 *
 * @author Alumno-CT
 */
public class Prestamo {
     private String id_prestamo,id_alumno,id_empleado,id_libro,fecha_prestamo,fecha_devolucion,fecha_devuelto;

    public Prestamo() {
    }

    public Prestamo(String id_prestamo, String id_alumno, String id_empleado, String id_libro, String fecha_prestamo, String fecha_devolucion, String fecha_devuelto) {
        this.id_prestamo = id_prestamo;
        this.id_alumno = id_alumno;
        this.id_empleado = id_empleado;
        this.id_libro = id_libro;
        this.fecha_prestamo = fecha_prestamo;
        this.fecha_devolucion = fecha_devolucion;
        this.fecha_devuelto = fecha_devuelto;
    }

    public String getId_prestamo() {
        return id_prestamo;
    }

    public void setId_prestamo(String id_prestamo) {
        this.id_prestamo = id_prestamo;
    }

    public String getId_alumno() {
        return id_alumno;
    }

    public void setId_alumno(String id_alumno) {
        this.id_alumno = id_alumno;
    }

    public String getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(String id_empleado) {
        this.id_empleado = id_empleado;
    }

    public String getId_libro() {
        return id_libro;
    }

    public void setId_libro(String id_libro) {
        this.id_libro = id_libro;
    }

    public String getFecha_prestamo() {
        return fecha_prestamo;
    }

    public void setFecha_prestamo(String fecha_prestamo) {
        this.fecha_prestamo = fecha_prestamo;
    }

    public String getFecha_devolucion() {
        return fecha_devolucion;
    }

    public void setFecha_devolucion(String fecha_devolucion) {
        this.fecha_devolucion = fecha_devolucion;
    }

    public String getFecha_devuelto() {
        return fecha_devuelto;
    }

    public void setFecha_devuelto(String fecha_devuelto) {
        this.fecha_devuelto = fecha_devuelto;
    }
     
     
    
}
