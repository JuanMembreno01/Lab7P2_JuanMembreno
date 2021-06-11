/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7p2_juanmembreño;

/**
 *
 * @author usuario
 */
public class canciones {

    private String nombre;
    private String duracion;
    private String nombrecompositor;
    private String nombredistribuidor;
    private String exclusiva;
    private String nombreproductor;
    private String nombreartistainvitado;

    public canciones() {
    }

    public canciones(String nombre, String duracion, String nombrecompositor, String nombredistribuidor, String exclusiva, String nombreproductor, String nombreartistainvitado) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.nombrecompositor = nombrecompositor;
        this.nombredistribuidor = nombredistribuidor;
        this.exclusiva = exclusiva;
        this.nombreproductor = nombreproductor;
        this.nombreartistainvitado = nombreartistainvitado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getNombrecompositor() {
        return nombrecompositor;
    }

    public void setNombrecompositor(String nombrecompositor) {
        this.nombrecompositor = nombrecompositor;
    }

    public String getNombredistribuidor() {
        return nombredistribuidor;
    }

    public void setNombredistribuidor(String nombredistribuidor) {
        this.nombredistribuidor = nombredistribuidor;
    }

    public String getExclusiva() {
        return exclusiva;
    }

    public void setExclusiva(String exclusiva) {
        this.exclusiva = exclusiva;
    }

    public String getNombreproductor() {
        return nombreproductor;
    }

    public void setNombreproductor(String nombreproductor) {
        this.nombreproductor = nombreproductor;
    }

    public String getNombreartistainvitado() {
        return nombreartistainvitado;
    }

    public void setNombreartistainvitado(String nombreartistainvitado) {
        this.nombreartistainvitado = nombreartistainvitado;
    }

    @Override
    public String toString() {
        return "canciones{" + "nombre=" + nombre + ", duracion=" + duracion + ", nombrecompositor=" + nombrecompositor + ", nombredistribuidor=" + nombredistribuidor + ", exclusiva=" + exclusiva + ", nombreproductor=" + nombreproductor + ", nombreartistainvitado=" + nombreartistainvitado + '}';
    }

}
