// Deklarasi depedensi
import java.util.*;

public class DigitalMax {
    
    public static void main(String[] agrs)
    {
        // Membuat scanner
        Scanner in=new Scanner(System.in);
        // Masukkan angka
        System.out.println("Enter a number :");
        // Mengambil inputan integer
        int n=in.nextInt();
        
        int temp=0,a;
        
        
        int[] arr={8,9,8,9,9,9,8,9,8,9};
        
        // Ketika n lebih besar dari 0
        while(n>0)
            
        {
            // A diberi nilai N mod 10
            a=n%10;
            
            // Temp diberi nilai temp dikali 10 ditambah arr index ke a
            temp=temp*10+arr[a];
            
            // N diberi nilai n dibagi 10
            n=n/10;
        }
        int ans=0;
        
        // Selama temp lebih besar dari 0
        while(temp>0)
        {
            // A sama dengan temp dibagi 10
            a=temp%10;
            // Ans sama dengan ans dikali 10 ditambah a
            ans=ans*10+a;
            // Temp dibagi 10
            temp=temp/10;
        }
        // Mengeluarkan output dengan hasil maksimal
        System.out.println("Maximum no:"+" "+ans);
    }
}
