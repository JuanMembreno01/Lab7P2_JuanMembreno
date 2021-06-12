/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7p2_juanmembreño;

import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class playlist {
    ArrayList<canciones > m=new ArrayList();
    canciones a;
      private static final long SerialVersionUID=545L;

    public playlist() {
    }

    public playlist(canciones a) {
        this.a = a;
    }

    public canciones getA() {
        return a;
    }

    public void setA(canciones a) {
        this.a = a;
    }
    
    public ArrayList<canciones> getM() {
        return m;
    }

    public void setM(ArrayList<canciones> m) {
        this.m = m;
    }
    
      
}
