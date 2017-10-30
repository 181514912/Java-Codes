/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BellmanFord_Graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author anderson
 */
public class Main {
    
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BellmanFord_ForThisProject bf= new BellmanFord_ForThisProject();
        
        BufferedReader a = new BufferedReader (new InputStreamReader(System.in));
        String entrada, arquivo, comando[];
        int  grupos;
        
        System.out.println("Digite abaixo: comando <arquivo_arestas> <k>");
/*        entrada = a.readLine();
        
        comando = entrada.split(" ");
        
        arquivo = comando[1];
        grupos = Integer.parseInt(comando[2]);
        System.out.println(comando[0]);
        System.out.println(arquivo);
        System.out.println(grupos);
        */
        arquivo = "/home/anderson/NetBeansProjects/grafo_BF/src/arquivos/Entradas1/teste.dat";
        
        bf.BF(arquivo);
        
        
    }
    
}
