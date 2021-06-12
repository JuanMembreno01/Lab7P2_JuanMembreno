/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7p2_juanmembreño;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class albumes implements Serializable {

    private String nombre;
    private String fechap;
    private String genromusical;
    private String formatepublicacion;
    private String aliasproductor;
    ArrayList<canciones> canciones = new ArrayList();
    private static final long SerialVersionUID = 779L;

    public albumes() {
    }

    public albumes(String nombre, String fechap, String genromusical, String formatepublicacion, String aliasproductor,canciones m) {
        this.nombre = nombre;
        this.fechap = fechap;
        this.genromusical = genromusical;
        this.formatepublicacion = formatepublicacion;
        this.aliasproductor = aliasproductor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechap() {
        return fechap;
    }

    public void setFechap(String fechap) {
        this.fechap = fechap;
    }

    public String getGenromusical() {
        return genromusical;
    }

    public void setGenromusical(String genromusical) {
        this.genromusical = genromusical;
    }

    public String getFormatepublicacion() {
        return formatepublicacion;
    }

    public void setFormatepublicacion(String formatepublicacion) {
        this.formatepublicacion = formatepublicacion;
    }

    public String getAliasproductor() {
        return aliasproductor;
    }

    public void setAliasproductor(String aliasproductor) {
        this.aliasproductor = aliasproductor;
    }

    public ArrayList<canciones> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<canciones> canciones) {
        this.canciones = canciones;
    }

    @Override
    public String toString() {
        return nombre;
      //  return "albumes{" + '}';
    }

}
