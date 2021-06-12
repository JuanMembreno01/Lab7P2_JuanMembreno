/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7p2_juanmembreño;

import javax.swing.JProgressBar;
import javax.swing.JSpinner;

/**
 *
 * @author usuario
 */
public class hilo extends  Thread {

    private JProgressBar barrareproduccion;
    private albumes album;
    private canciones c;

    private boolean avanzar;
    private boolean vive;

    public hilo() {
    }

    public hilo(JProgressBar barrareproduccion, albumes album) {
        this.barrareproduccion = barrareproduccion;
        //this.album = album;
        //this.tiempo = tiempo;
        avanzar = true;
        vive = true;
    }

    public JProgressBar getBarrareproduccion() {
        return barrareproduccion;
    }

    public void setBarrareproduccion(JProgressBar barrareproduccion) {
        this.barrareproduccion = barrareproduccion;
    }

    public boolean isAvanzar() {
        return avanzar;
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }

    public void run() {
        while (vive) {
            if (avanzar) {
                
               // int m=Integer.parseInt(c.getDuracion());
               for(int i=0;i<album.getCanciones().size();i++){
                    int m = Integer.parseInt(album.getCanciones().get(0).getDuracion());
                    barrareproduccion.setValue(m);
                    barrareproduccion.setString(album.canciones.get(0).getNombre());
               }
            }
            try {
                Thread.sleep(30);
            } catch (InterruptedException ex) {

            }
        }

    }

}
