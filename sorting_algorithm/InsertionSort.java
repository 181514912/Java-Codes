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
public class InsertionSort extends Iterasi{
    int tukar, i;
    
    public void insertionAsc(int [] data)
    {
        int jml=data.length;
        for (int step=1;step<=jml-1;step++)
        {
            tukar=data[step];
            for(i=step;i>=1&&data[i-1]>tukar;i--)
            {
                data[i]=data[i-1];
            }
            data[i]=tukar;
            iterasi(data);
        }
        System.out.println("Hasil Sorting Ascending");
        iterasi(data);
        System.out.println("--------------------");
    }
    
    public void insertionDsc(int [] data)
    {
        int jml=data.length;
        for (int step=1;step<=jml-1;step++)
        {
            tukar=data[step];
            for(i=step;i>=1&&data[i-1]<tukar;i--)
            {
                data[i]=data[i-1];
                
            }
            data[i]=tukar;
            iterasi(data);
            
        }
        System.out.println("Hasil Sorting Descending");
        iterasi(data);
        System.out.println("--------------------");
    }
    
}
