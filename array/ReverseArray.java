/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.jay.array;

/**
 *
 * @author JAY PATEL
 */
public class ReverseArray {

    
    static void print(int arr[],int n)
    {
//        int temp;
//        for(int i=0;i<n;i++)
//        {
//           System.out.print(arr[i] + " "); 
//        }
//        System.out.println();
        for(int i:arr)
        {
          System.out.print(i + " ");    
        }
         System.out.println(); 
    }
    
    static void reverse(int arr[],int low,int high)
    {
        int temp=arr[low];
        if(low>=high)
        {
            return;
        }
        
        
        arr[low]=arr[high];
        arr[high]=temp;
        reverse(arr, low+1, high-1);
                
        
    }
    public static void main(String args[])
{
    
    int arr[]={2,4,6,8,10};
    int n=arr.length;
    System.out.println("Old array is");
    print(arr, n);
     System.out.println("After reversing");
     reverse(arr,0,n-1);
     print(arr,n); 
     
    
}

}
