// Java program for implementation of Insertion Sort 
class InsertionSort 
{ 
    /*Function to sort array using insertion sort*/
    void sort ( int A[]) {
     int n=A.length;
        
     for( int i = 0 ;i < n ; i++ ) {
    /*storing current element whose left side is checked for its 
             correct position .*/

      int temp = A[ i ];    
      int j = i;

       /* check whether the adjacent element in left side is greater or
            less than the current element. */

          while(  j > 0  && temp < A[j-1]) {

           // moving the left side element to one position forward.
                A[j] = A[j-1];   
                j= j - 1;

           }
         // moving current element to its  correct position.
           A[ j ] = temp;       
     }  
}
  
    /* A utility function to print array of size n*/
    static void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i] + " "); 
  
        System.out.println(); 
    } 
  
    // Driver method 
    public static void main(String args[]) 
    {         
        int arr[] = {12, 11, 13, 5, 6}; 
  
        InsertionSort ob = new InsertionSort();         
        ob.sort(arr); 
          
        printArray(arr); 
    } 
}
