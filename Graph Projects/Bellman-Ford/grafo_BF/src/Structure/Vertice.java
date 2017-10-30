/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Structure;

/**
 *
 * @author humberto
 */
public class Vertice {
    private int vertice;
    private int d;
    
    public Vertice( int v ){
        this.vertice = v;
        this.d = 0;
    }

    public Vertice( int v, int d ){
        this.vertice = v;
        this.d = d;
    }

    
    public int id() {
        return vertice;
    }

    public void setarVertice(int vertice) {
        this.vertice = vertice;
    }
    
    public void setarD(int d){
        this.d = d;
    }
    
}
