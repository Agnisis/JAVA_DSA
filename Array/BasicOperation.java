// make one array dynamic of size n 
// search (by element /by index) (traversing)
// reverse
// rotate
// slicing
// sum of all elements
// find even/odd index/values -> store to another array
// delete element by index/value
// sorting array using collection
// print duplicate elements
// size of the array
// find frequency of each element
// copy one array elements to another
// swap elements of adjacent ones in array 

import java .util.*;
class BasicOperation{


    public static void leftRotate(int arr[],int n,int k){
        // 1 2 3 4 5 
        // k=2 steps
        // 3 4 5 1 2
        // swaping
            reversePrint(arr, n,0,k-1);
            reversePrint(arr, n,k,n-1);
            reversePrint(arr, n, 0, n-1);
        
    }

    public static void rightRotate(int arr[],int n,int k){

        reversePrint(arr, n, 0, n-k-1);
        reversePrint(arr, n, n-k, n-1);
        reversePrint(arr, n, 0, n-1);
    }
    
    public static void reversePrint(int arr[],int n,int start,int end){
        //reverse function 
        
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
       
    } 

    //print array
    public static void printArray(int arr[],int n){
        
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){

       // size of array
        System.out.println("Enter the size");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]= new int[n];

        System.out.print("Enter the elements \n");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Printing the original array");
        printArray(arr, n);
        //reversePrint(arr,n,0,n-1);
        //printArray(arr, n);
        System.out.println();
        leftRotate(arr, n, 2);
        printArray(arr, n);
        System.out.println();
        rightRotate(arr, n, 2);
        printArray(arr, n);


        



    }
 
}


