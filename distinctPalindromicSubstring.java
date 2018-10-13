// Input:
// 
// 2
// abaaa
// geek
// 
// Output:
//
// 5
// 4

import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class distinctPalindromicSubstring
{
    public static void main (String[] args) {
	    Scanner in = new Scanner(System.in);
	    int test = in.nextInt();
	    for(int t=0;t<test;++t){
	        int ans = 0;
	        String str = in.next();
	        int indi = 0;
	        for(int i=str.length();i>0;--i){
	            String arr[] = new String[i];
	            ++indi;
	            for(int j=0;j<i;++j)
	                arr[j] = str.substring(j,j+indi);
                Arrays.sort(arr);
                String a = arr[0];
                for(int j=1;j<i;++j)
                    if(!arr[j].equals(a)){
                        if(isPalen(a))
                            ++ans;
                        a = arr[j];
                    }
                if(isPalen(a))
                    ++ans;
	        }
	        System.out.println(ans);
	    }
	}
	public static boolean isPalen(String str){
	    int len = str.length();
	    for(int i=0;i<len/2;++i)
	        if(str.charAt(i)!=str.charAt(len-1-i))
	            return false;
        return true;
	}
}
