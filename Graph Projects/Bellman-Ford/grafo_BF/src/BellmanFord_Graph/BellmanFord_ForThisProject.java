/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BellmanFord_Graph;

/*
 * @author anderson
 */

import Structure.Aresta;
import Structure.Vertice;
import java.io.*;
import java.util.*;

public class BellmanFord_ForThisProject {

    Set<Integer> eu = new HashSet();
    Aresta a;
    ArrayList<Aresta> aresta, soma;
    int     d[],    //valor do vertice
            p[];    //pai do vertice
    
    int     n,      //qtd de vertices
            e,      //qtd de vertices
            s;      //a origem
    
    final int INFINITY = 999;


    void leitura(String local) throws FileNotFoundException {
        String linha, leu[];
        
        int item, v1, v2;

        aresta = new ArrayList<>();
        
        Scanner a = new Scanner(new File(local));
        while (a.hasNext()) {
            linha = a.nextLine();
            leu = linha.split(" ");

            v1 = Integer.parseInt(leu[0]);
            v2 = Integer.parseInt(leu[1]);

            Vertice ve1 = new Vertice(v1);
            Vertice ve2 = new Vertice(v2);
            
            
            eu.add(v1);
            eu.add(v2);
            
            Aresta ar = new Aresta(ve1,ve2,1);
            
            aresta.add(ar);
            
            
            // System.out.println(v1 + " " + v2);

        }

        n = eu.size(); //em relação ao karate.dat o menor

        //System.out.println("n=100 e valor arraylist = "+aresta.size());
        
        e = aresta.size();
        d = new int [n];
        p = new int [n];
                
    }

    void print() {
        for (int i = 0; i < n; i++) {
            if (d[i] != INFINITY) {
                System.out.println("de "+s+" chego em "+i+" com d[]="+d[i]+"  por ("+p[i]+","+i+")");
            }
        }
    }

    boolean cycle() {
        int j;
        for (j = 0; j < e; ++j) {
            if (d[aresta.get(j).origem().id()] + aresta.get(j).peso() < d[aresta.get(j).destino().id()]) {
                return false;
            }
        }
        return true;
    }

    
    void relax(int origem) {
        int i, j, a1, a2, a3;
        //inicializa
        for (i = 0; i < n; ++i) {
            d[i] = INFINITY;
            p[i] = -1;
        }

        s = origem;//seta a origem
        
        d[s] = 0;
        for (i = 0; i < n - 1; ++i) {
            //System.out.println("<-"+i);
            for (j = 0; j < e; ++j) { //here i am calculating the shortest path
                if (d[this.aresta.get(j).origem().id()] + this.aresta.get(j).peso() < d[this.aresta.get(j).destino().id()]) {
                    d[this.aresta.get(j).destino().id()] = (int) (this.d[aresta.get(j).origem().id()] + this.aresta.get(j).peso());
                    p[this.aresta.get(j).destino().id()] = this.aresta.get(j).origem().id();
                    //System.out.println("-> ("+this.aresta.get(j).origem().id()+","+this.aresta.get(j).destino().id()+")");
                }
                if (d[this.aresta.get(j).destino().id()] + this.aresta.get(j).peso() < d[this.aresta.get(j).origem().id()]) {
                    d[this.aresta.get(j).origem().id()] = (int) (this.d[aresta.get(j).destino().id()] + this.aresta.get(j).peso());
                    p[this.aresta.get(j).origem().id()] = this.aresta.get(j).destino().id();
                    //System.out.println("-> ("+this.aresta.get(j).origem().id()+","+this.aresta.get(j).destino().id()+")");
                }
                
            }
        }
        
        if (cycle()) {
            print();            
        } else {
            System.out.println(" There is a negative edge cycle ");
        }
    }

    void BF(String arq) throws FileNotFoundException {
        BellmanFord_ForThisProject r = new BellmanFord_ForThisProject();

        r.leitura(arq);
        System.out.println("qtd vertices:"+r.n);

        for (int i = 0; i < r.n; i++) {
            System.out.println("origem no vert"+i);
            r.relax(i);
        }
        
        //r.relax(1);
    }
}