package javacodes;

/*
Write a program to check the given number is palindrome or not?
Descritpion : A Palindrome number is a number that remains the same when its digits are reversed. Like 16461, for example: we take 121 and reverse it, after revers it is same as original number
*/
import java.util.Scanner;

class Palindrome_or_not {

  public static void main(String args[])
  {
    Scanner x = new Scanner(System.in);
    
    String st=x.next();
    String w=""; // Creating new string to apply algo on!
    int i;
    for(i=0;i<st.length();i++)
      w=st.charAt(i)+w; //Reversing the String and Storing it.
    if(st.compareTo(w)==0) //Comparing the string to original string
      System.out.prinltn("Number is Pallindrome");
    else
      System.out.println("Number is Not Pallindrome");
  }
}
