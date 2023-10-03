import java.util.*;

class Linear_Search{
    public static int linearSearch(int arr[],int size,int target){
                
                for(int i=0;i<size;i++){
                    if(arr[i]==target)return i;
                }
                return -1;
                
    }
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the size of the array");
      int size=sc.nextInt();
      int arr[]=new int[size];
      System.out.println("Enter the elements");
      for(int i=0;i<size;i++){
        arr[i]=sc.nextInt();
      }
      System.out.println("Enter element to be searched");
      int target=sc.nextInt();
      System.out.println("The element found at "+linearSearch(arr,size,target));
    }
}