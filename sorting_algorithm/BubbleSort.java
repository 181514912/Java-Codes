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
public class BubbleSort extends Iterasi{
    int temp;
    
    public void bubbleAsc(int [] arai){
        //System.arraycopy(arai, 0, bub, 0, arai.length);
        int jumData = arai.length;
        for (int i=0;i<jumData-1;i++)
        {
            for (int j=i;j<jumData;j++)
            {
                if (arai[i]>arai[j])
                {
                    temp=arai[i];
                    arai[i]=arai[j];
                    arai[j]=temp;
                    System.out.print((i+1)+"."+(j+1)+") ");
                    iterasi(arai);
                }
            }
        }
        System.out.println("Hasil Sorting Ascending");
        iterasi(arai);
        System.out.println("--------------------");
    }
    
    public void bubbleDsc(int [] arai){
        //System.arraycopy(arai, 0, bub, 0, arai.length);
        int jumData = arai.length;
        for (int i=0;i<jumData-1;i++)
        {
            for (int j=i;j<jumData;j++)
            {
                if (arai[i]<arai[j])
                {
                    temp=arai[i];
                    arai[i]=arai[j];
                    arai[j]=temp;
                    System.out.print((i+1)+"."+(j+1)+") ");
                    iterasi(arai);
                }
            }
        }
        System.out.println("Hasil Sorting Descending");
        iterasi(arai);
        System.out.println("--------------------");
    }
    
    
}
