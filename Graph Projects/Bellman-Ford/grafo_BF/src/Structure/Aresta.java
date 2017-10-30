/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Structure;

/**
 *
 * @author humberto
 */
public class Aresta {

    private Vertice origem;
    private Vertice destino;
    private int peso;
    
    public Aresta( Vertice origem, Vertice destino ){
        this.origem = origem;
        this.destino = destino;
        this.peso = 1;
    }
    
    public Aresta( Vertice origem, Vertice destino, int peso ){
        this.origem = origem;
        this.destino = destino;
        this.peso = peso;
    }

    public Vertice origem() {
        return origem;
    }

    public void setarOrigem(Vertice origem) {
        this.origem = origem;
    }

    public Vertice destino() {
        return destino;
    }

    public void setarDestino(Vertice destino) {
        this.destino = destino;
    }

    public double peso() {
        return peso;
    }

    public void setarPeso(int peso) {
        this.peso = peso;
    }
    
}
