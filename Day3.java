1)
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        int n, sum = 0;
        float average;
        Scanner s = new Scanner(System.in);
        System.out.print("no. of elements :");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("elements:");
        for(int i = 0; i < n ; i++)
        {
            a[i] = s.nextInt();
            sum = sum + a[i];
        }
        System.out.println("Sum:"+sum);
        average = (float)sum / n;
        System.out.println("Average:"+average);
    }
}


2)
class Main { 
    public static void main(String args[]){
    int array[] = new int[]{10, 11, 88, 2, 12, 120};
 
    int max = getMax(array);
    System.out.println("Maximum Value is: "+max);
 
    int min = getMin(array);
    System.out.println("Minimum Value is: "+min);
  }
 
   public static int getMax(int[] inputArray){ 
    int maxValue = inputArray[0]; 
    for(int i=1;i < inputArray.length;i++){ 
      if(inputArray[i] > maxValue){ 
         maxValue = inputArray[i]; 
      } 
    } 
    return maxValue; 
  }
 
  public static int getMin(int[] inputArray){ 
    int minValue = inputArray[0]; 
    for(int i=1;i<inputArray.length;i++){ 
      if(inputArray[i] < minValue){ 
        minValue = inputArray[i]; 
      } 
    } 
    return minValue; 
  } 
}


3)

import java.util.*;

public class Main{

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        int toFind = 3;
        int a[]= new int[10];
        for (int i=0; i<10; i++){
            a[i] = s.nextInt();
        }
        int t = s.nextInt();
        boolean found = false;

        for (int n=0; n<a.length; n++) {
            if (n == t) {
                found = true;
                break;
            }
        }

        if(found){
            System.out.print(t + " is found.");
            //System.out.print(n);
            
        }
        else{
            System.out.print(t + " is not found.");
            System.out.print(-1);}
    }
}

4)

public class Main {

    public static void main(String[] args) {

        char ch = 'a';
        int ascii = ch;
        // You can also cast char to int
        int castAscii = (int) ch;

        System.out.println("The ASCII value of " + ch + " is: " + ascii);
        System.out.println("The ASCII value of " + ch + " is: " + castAscii);
    }
}

5)

import java.util.*;
class Main{
    public static void main(String args[]) {
        Scanner s= new Scanner(System.in);
        int a[] = new int[5];
        for (int h=0; h<5; h++){
            a[h] = s.nextInt();
        }
        int smallest=a[0];
        int largest=a[0];
        for(int i=0;i<5;i++){
            if(a[i]<smallest){
                smallest=a[i]; }
            if(a[i]>largest){ 
                largest=a[i]; }}
        System.out.println(smallest+" "+largest); }}

6)

public class Main{  
    public static void main(String[] args) {      
          
        int [] arr = new int [] {5, 2, 8, 7, 1};   
        int temp = 0;  
        
        System.out.println("Elements: ");  
        for (int h = 0; h < arr.length; h++) {   
            System.out.print(arr[h] + " ");  
        }  
    
        for (int i = 0; i < arr.length; i++) {   
            for (int j = i+1; j < arr.length; j++) {   
               if(arr[i] > arr[j]) {  
                   temp = arr[i];  
                   arr[i] = arr[j];  
                   arr[j] = temp;  
               }   
            }  
        }   
        System.out.println("\n"+"in ascending order: ");  
        for (int l = 0; l < arr.length; l++) {   
            System.out.print(arr[l] + " ");  
        }  
    }  
}  

7)

class Main { 
    static int removeDuplicates(int arr[], int n) 
    { 
        if (n==0 || n==1) 
            return n; 
       
        int[] temp = new int[n]; 
          
        int j = 0; 
        for (int i=0; i<n-1; i++) 
            if (arr[i] != arr[i+1]) 
                temp[j++] = arr[i]; 
          
        temp[j++] = arr[n-1];    
          
        for (int i=0; i<j; i++) 
            arr[i] = temp[i]; 
       
        return j; 
    } 
      
    public static void main (String[] args)  
    { 
        int arr[] = {1, 2, 2, 3, 4, 4, 4, 5, 5}; 
        int n = arr.length; 
        n = removeDuplicates(arr, n); 
           for (int i=0; i<n; i++) 
           System.out.print(arr[i]+" "); 
    } 
} 

8)

public class Main {

    public static void main(String args[])
    {
    int a=args.length;
    int x,y,w,z,i;
    int arr[][] = new int[4][4];
    if(a<4){
            System.out.println("enter 4 values");}
    if(a==4){
        int k=0;
    for(i=0;i<2;i++)
    {
        for(int j=0;j<2;j++)
        {
            
        arr[i][j]=Integer.parseInt(args[k]);
        k++;
        }
        
    }
    System.out.println("The given array is:");
    for(i=0;i<2;i++)
    {
        for(int j=0;j<2;j++)
        {
        System.out.print(arr[i][j]+" ");
        }
        System.out.println();
        
    }
    System.out.println("The reverse of array is:");
    for(i=1;i>=0;i--)
    {
        for(int j=1;j>=0;j--)
        {
        System.out.print(arr[i][j]+" ");
        }
        System.out.println();
        
    }

    
    
    }  
}
}