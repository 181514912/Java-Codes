// Deklarasi depedensi

import java.util.*;

public class DigitalMax {
    
    public static void main(String[] agrs)
    {
        Scanner in =new Scanner(System.in);
        
        //User will enter a number
        System.out.println("Enter a number :");
        
        int n=in.nextInt();
        
        //set 'temp', 'a' counter to 0
        int temp=0,a;
        
        //initializing the array
        int[] arr={8,9,8,9,9,9,8,9,8,9};
        
        //if user enters a positive figure
        while(n>0)
            
        {
            //remainder of 'a'
        	a=n%10;
            
        	//get array value accordingly of it's index
            temp=temp*10+arr[a];
            
            n=n/10;
        }
        
        //declaring answer variable
        int ans=0;
        
        while(temp>0)
        {
        	//calculating remainder of a
            a=temp%10;
            
            //calculating answer
            ans=ans*10+a;
            
            temp=temp/10;
        }
        //answer prompt
        System.out.println("Maximum no:"+" "+ans);
    }
}