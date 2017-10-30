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
public class SelectionSort extends Iterasi{
    int simpan, temp;
    
    public void selectionAsc(int [] arai)
    {
        int banyak=arai.length;
        for (int i=0;i<banyak;i++)
        {
            simpan=i;
            for(int j=i+1;j<banyak;j++)
            {
                if (arai[j]<arai[simpan])
                {
                    simpan=j;
                }
            }
            temp=arai[i];
            arai[i]=arai[simpan];
            arai[simpan]=temp;
            System.out.print((i+1)+". ");
            iterasi(arai);
        }
        
        System.out.println("Hasil Sorting Ascending");
        iterasi(arai);
        System.out.println("--------------------");
    }
    
    public void selectionDsc(int [] arai)
    {
        int banyak=arai.length;
        for (int i=0;i<banyak;i++)
        {
            simpan=i;
            for(int j=i+1;j<banyak;j++)
            {
                if (arai[j]>arai[simpan])
                {
                    simpan=j;
                }
            }
            temp=arai[i];
            arai[i]=arai[simpan];
            arai[simpan]=temp;
            System.out.print((i+1)+". ");
            iterasi(arai);
        }
        
        System.out.println("Hasil Sorting Descending");
        iterasi(arai);
        System.out.println("--------------------");
    }
}
