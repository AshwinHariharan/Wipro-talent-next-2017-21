//Write a Java Program to accept 25 integer elements for an array then find the maximum number in the set and display it.

import java.util.Scanner;
public class Largest_Number 
{
    public static void main(String[] args) 
    {
        int n, max;
        Scanner s = new Scanner(System.in);
        System.out.print("Number of elements:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Elements of array:");
        for(int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }
        max = a[0];
        for(int i = 0; i < n; i++)
        {
            if(max < a[i])
            {
                max = a[i];
            }
        }
        System.out.println("Maximum value:"+max);
    }
}

//Design an algorithm to accept 10 integer elements for an array and then find the number of times the number with the maximum value occurs in the array. 

import java.util.Scanner;
public class Main {
    public void MaxRepeatingElement(int [] arrA){
        int maxCounter = 0;
        int element=0;
        for (int i = 0; i <arrA.length ; i++) {
            int counter =1;
            for (int j = i+1; j <arrA.length ; j++) {
                if(arrA[i]==arrA[j]){
                    counter++;
                }
            }
            if(maxCounter<counter){
                maxCounter=counter;
                element = arrA[i];
            }
        }
        System.out.println("Element repeating maximum no of times: " + element + ", maximum count: " + maxCounter);
    }

    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int arrA[] = new int[10];
    System.out.println("Elements of array:");
    for(int i = 0; i < 10; i++)
        {
            arrA[i] = s.nextInt();
        }
     Main m = new Main();
     m.MaxRepeatingElement(arrA);
    }
}

//Design an algorithm to calculate the factorial of a number N. The value of N is provided as an input by the user.
import java.util.Scanner;
class Main{
   public static void main(String args[]){
      Scanner scanner = new Scanner(System.in);
      System.out.println("Number:");
      int num = scanner.nextInt();
      int factorial = fact(num);
      System.out.println("Factorial: "+factorial);
   }
   static int fact(int n)
   {
       int output;
       if(n==1){
         return 1;
       }
       output = fact(n-1)* n;
       return output;
   }
}

// Design an algorithm to accept a given string from the user. The algorithm must then remove characters from the string which appear more than once. 

import java.util.*; 
  
class Main  
{ 
    static String removeDuplicate(char str[], int n) 
    { 
        int index = 0; 
        for (int i = 0; i < n; i++) 
        { 
            int j;
            for ( j = 0; j < i; j++)  
            { 
                if (str[i] == str[j]) 
                { 
                    break; 
                } 
            } 
            if (j == i)  
            { 
                str[index++] = str[i]; 
            } 
        } 
        return String.valueOf(Arrays.copyOf(str, index)); 
    } 
    
    public static void main(String[] args) 
    { 
		Scanner sc = new Scanner(System.in);
 		System.out.println("Enter a string"); 
 		String s = sc.nextLine(); 
        char str[] = s.toCharArray(); 
        int n = str.length; 
        System.out.println(removeDuplicate(str, n)); 
    } 
} 


// Design an algorithm to find the least perfect square, which is divisible by each of 21, 36 and 66.  