/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7p2_juanmembreño;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class administraalbumes {
     private ArrayList<albumes> listaalbumes= new ArrayList();
    private File archivo = null;
    
    public administraalbumes(String path) {
        archivo = new File(path);
    }

    public ArrayList<albumes> getListaalbumes() {
        return listaalbumes;
    }

    public void setListaalbumes(ArrayList<albumes> listaalbumes) {
        this.listaalbumes = listaalbumes;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    public void setalbumes(albumes a){
        listaalbumes.add(a);
    }
    
    
    public void cargarArchivo() {
        try {            
            listaalbumes = new ArrayList();
            albumes temp;
            if (archivo.exists()) {
                FileInputStream entrada
                    = new FileInputStream(archivo);
                ObjectInputStream objeto
                    = new ObjectInputStream(entrada);
                try {
                    while ((temp = (albumes) objeto.readObject()) != null) {
                        listaalbumes.add(temp);
                    }
                } catch (EOFException e) {
                    //encontro el final del archivo
                }
                objeto.close();
                entrada.close();
            }            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (albumes t : listaalbumes) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception ex) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }
    }

}
