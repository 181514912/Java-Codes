// Input:
// 
// 2
// ((()
// )()())
//
// Output:
//
// 2
// 4

import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

 class longestValidParanthesis
{
    public static void main (String[] args)
    {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        for(int t=0;t<test;++t){
            String str = in.next();
            Stack<Character> stack = new Stack<>();
            Stack<Integer> index = new Stack<>();
            int n = str.length();
            int A[] = new int[n];
            for(int i=0;i<n;++i){
                char ch = str.charAt(i);
                if(ch=='('){
                    stack.push('(');
                    index.push(i);
                }
                else{
                    if(!stack.isEmpty() && stack.peek()=='('){
                        stack.pop();
                        A[i] = 1;
                        A[index.pop()] = 1;
                    }
                    else{
                        stack.push(')');
                        index.push(i);
                    }   
                }
            }
            int max = 0;
            int count = 0;
            for(int i=0;i<n;++i)
                if(A[i]==0){
                    max = Math.max(max, count);
                    count =0;
                }
                else
                    ++count;
            max = Math.max(max, count);
            System.out.println(max);
        }
    }
}
