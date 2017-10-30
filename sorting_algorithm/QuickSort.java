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
public class QuickSort extends Iterasi {
    
    public void quickAsc(int [] arr){
        int low=0;
        int high=arr.length-1;
        Quick(arr, low, high);
        System.out.println("Hasil Sorting Ascending");
        iterasi(arr);
        System.out.println("--------------------");
    }
    
    public void quickDsc(int [] arr){
        int low=0;
        int high=arr.length-1;
        Quick1(arr, low, high);
        System.out.println("Hasil Sorting Descending");
        iterasi(arr);
        System.out.println("--------------------");
    }
    
    
    public void Quick (int [] arr, int low, int high){
        if (arr == null || arr.length == 0)
            return;
        if (low >= high)
            return;
        //pick 
        int middle = low + (high - low) / 2;
        int pivot = arr[middle];
 
	//make left < pivot and right > pivot
	int i = low, j = high;
	while (i <= j) {
            while (arr[i] < pivot) {
		i++;
            }
 
            while (arr[j] > pivot) {
		j--;
            }
 
            if (i <= j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
                i++;
		j--;
                iterasi(arr);
            }
	}
 
	//recursively sort two sub parts
	if (low < j)
            Quick(arr, low, j);
 
	if (high > i)
            Quick(arr, i, high);
    }
    
    public void Quick1 (int [] arr, int low, int high){
        if (arr == null || arr.length == 0)
            return;
        if (low >= high)
            return;
        //pick 
        int middle = low + (high - low) / 2;
        int pivot = arr[middle];
 
	//make left < pivot and right > pivot
	int i = low, j = high;
	while (i <= j) {
            while (arr[i] < pivot) {
		i++;
            }
 
            while (arr[j] > pivot) {
		j--;
            }
 
            if (i <= j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
                i++;
		j--;
                iterasi(arr);
            }
	}
 
	//recursively sort two sub parts
	if (low < j)
            Quick1(arr, low, j);
 
	if (high > i)
            Quick1(arr, i, high);
    }
}
