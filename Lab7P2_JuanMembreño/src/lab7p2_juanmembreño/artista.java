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
public class artista {
    private String nombre ;
    private String genero;
    private String nombredisquera;
    private String alias;

    public artista() {
    }

    public artista(String nombre, String genero, String nombredisquera, String alias) {
        this.nombre = nombre;
        this.genero = genero;
        this.nombredisquera = nombredisquera;
        this.alias = alias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNombredisquera() {
        return nombredisquera;
    }

    public void setNombredisquera(String nombredisquera) {
        this.nombredisquera = nombredisquera;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    @Override
    public String toString() {
        return "artista{" + "nombre=" + nombre + ", genero=" + genero + ", nombredisquera=" + nombredisquera + ", alias=" + alias + '}';
    }
    
}
