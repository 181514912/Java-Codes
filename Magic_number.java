/** Magic number program 1234 is a magic number, if we add all the number
*   seperatly 1+2+3+4 =10 again adding the result 1+0= 1 if single digit
*   number is 1 then given number is magic number else not
*/

import  java.io.*;
class Magic_number
{
	public static void main(String ar[])
{

	BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
	int n,v,t,d=0,s;
	System.out.println("Enter the number");
       n=Integer.parseInt(br.readLine());
		//implementing the Algorithm
for(v=n;v>9;v=s){
	for(t=v,s=0;t>0;t=t/10)	{
			d=t%10;
			s=s+d;	
}
}
if(v==1)
	{
		System.out.println("The entered number is magic number");
	}
else
	{
		System.out.println("The entered number is NOT  magic number");
	}
}
}
