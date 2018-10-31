//program for array rotation in java

import java.util.*;
public class Array_Rotate {

    static void leftRotate(int arr[], int arr1[]){
        for (int i=0;i<arr1[1];i++){
            leftRotate1by1(arr,arr1);
        }
    }
    static void leftRotate1by1(int arr[],int arr1[]) {
        int i, temp;
        temp = arr[0];
        for (i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[i] =temp;
    }

    static void printArray(int arr[], int n){
        for (int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();		// number of test cases
        int arr1[] = new int[2];
        for (int i=0;i<t;i++) {
             arr1[0] = sc.nextInt();
             arr1[1]=sc.nextInt();
            int arr[] = new int[arr1[0]];
            for (int j = 0; j < arr.length; j++) {
                arr[j]=sc.nextInt();	// array input 
            }
            Array_Rotate.leftRotate(arr,arr1);
            Array_Rotate.printArray(arr, arr1[0]);
        }
    }
}

