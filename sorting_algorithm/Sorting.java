/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

/**
 *
 * @author Ghifari
 */
public class Sorting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BubbleSort buble = new BubbleSort();
        SelectionSort selection = new SelectionSort();
        InsertionSort insertion = new InsertionSort();
        QuickSort quick = new QuickSort();
        daftarArai x = new daftarArai();
        
        System.out.println("Sorting dengan Empat Algoritma");
        System.out.print("Data Arai = ");
        x.printArai(x.araii());
        System.out.println("");
        
        System.out.println("----Bubble Sort----");
        System.out.println("Ascending");
        buble.bubbleAsc(x.araii());
        System.out.println("\nDescending");
        buble.bubbleDsc(x.araii());
        
        System.out.println(""); 
        System.out.println("----Selection Sort----");
        System.out.println("Ascending");
        selection.selectionAsc(x.araii());
        System.out.println("Descending");
        selection.selectionDsc(x.araii());
        
        System.out.println(""); 
        System.out.println("----Insertion Sort----");
        System.out.println("Ascending");
        insertion.insertionAsc(x.araii());
        System.out.println("Descending");
        insertion.insertionDsc(x.araii());
        
        System.out.println(""); 
        System.out.println("----Quick Sort----");
        System.out.println("Ascending");
        quick.quickAsc(x.araii());
        System.out.println("Descending");
        quick.quickDsc(x.araii());
    }
    
}

class daftarArai extends Iterasi{
    public int[] araii (){
        int [] x={12,25,5,9,2,4,17};
        return x;
    }
    
    void printArai(int [] arai){
        iterasi(arai);
    }
}