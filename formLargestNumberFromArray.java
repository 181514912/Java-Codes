// Input:
// 
// 2
// 5
// 3 30 34 5 9
// 4
// 54 546 548 60

// Output:
//
// 9534330
// 6054854654


import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class formLargestNumberFromArray
{
    public static String A[];
    public static void main (String[] args)
    {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        for(int t=0;t<test;++t){
            int n = in.nextInt();
            A = new String[n];
            for(int i=0;i<n;++i)
                A[i] = in.next();
            Arrays.sort(A);
            // for(int i=0;i<n;++i)
            //     System.out.print(A[i]+" ");
            // System.out.println();
            
            int index = 0; 
            int i=1;
            for(;i<n;++i)
                if(A[i].charAt(0)!=A[index].charAt(0)){
                    if((i-index)>1)
                        rearrange(index,i-1);
                    index = i;
                }
            rearrange(index,i-1);
            for(i=n-1;i>=0;--i)
                System.out.print(A[i]);
            System.out.println();
        }
    }
    public static void rearrange(int start, int end){
        for(int i=start+1;i<=end;++i){
            // System.out.print("arranging "+A[i]+" >> ");
            int j=i-1;
            inner:for(;j>=start;--j)
                if(((A[j]+A[i]).compareTo(A[i]+A[j]))<=0)
                    break inner;
            // System.out.println("before "+A[j+1]);
            String key = A[i];
            for(int k=i;k>j+1;--k)
                A[k] = A[k-1];
            A[j+1] = key; 
        }
    }
}

