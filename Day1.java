/* Write a program to accept a number N and print whether it is positive, negative or zero:

public class Demo
{
    public static void main(String[] args) 
    {
        int number=109;
        if(number > 0)
        {
            System.out.println(number+" is a positive number");
        }
        else if(number < 0)
        {
            System.out.println(number+" is a negative number");
        }
        else
        {
            System.out.println(number+" is zero");
        }
    }
}

/* Write a program to accept two numbers and print the greater value of the two
import java.util.Scanner;

public class JavaProgram
{
    public static void main(String args[])
    {
        int a, b, big;
        Scanner scan = new Scanner(System.in);
		
        System.out.print("Enter Two Number : ");
        a = scan.nextInt();
        b = scan.nextInt();
		
        if(a>b)
        {
            big = a;
        }
        else
        {
            big = b;
        }
		
        System.out.print("Largest of Two Number is " +big);
    }
}


/* Write a program to accept a number N and print whether the number is EVEN or ODD

import java.util.Scanner;

public class EvenOdd {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = reader.nextInt();

        if(num % 2 == 0)
            System.out.println(num + " is even");
        else
            System.out.println(num + " is odd");
    }
}

/* Write a program to accept two numbers and print whether their sum is EVEN or ODD
import java.util.Scanner;

public class EvenOdd {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
	For(int i=0; i<2; i++){
        	System.out.print("Enter a number: ");
        	int num = reader.nextInt();
		if(num % 2 == 0)
            		System.out.println(num + " is even");
        	else
            		System.out.println(num + " is odd");
	}
}
}


/* Write a program to print all numbers from 1 to 100 i.e. 1 2 3 4 5 6 7 . . . 98 99 100
public class EvenOdd {

    public static void main(String[] args) {
	int i=1;
	while(i<101){
		System.out.println(i);
		i++;
	}
	}
}

/* Write a program to print alternate numbers starting from 1 to 99 i.e. 1 3 5 7 9 11 13 . . . 95 97 99
public class EvenOdd {

    public static void main(String[] args) {
	int i=1;
	while(i<100){
		System.out.println(i);
		i++;
	}
	}
}

/* Write a program to print alternate numbers starting from 0 to 100 i.e. 0 2 4 6 8 10 12 . . . 96 98 100
public class EvenOdd {

    public static void main(String[] args) {
	int i=0;
	while(i<101){
		System.out.println(i);
		i+=2;
	}
	}
}

/*Write a program to print all numbers backwards from 100 to 0 i.e. 100 99 98 97 96 . . . 4 3 2 1 0
public class EvenOdd {

    public static void main(String[] args) {
	int i=100;
	while(i>=0){
		System.out.println(i);
		i--;
	}
	}
}

/* Write a program to print numbers backwards from 100 to 1 by skipping 2 numbers i.e. 100 97 94 91 88 85 82 79. . . 22 19 16 13 10 7 4 1
public class EvenOdd {

    public static void main(String[] args) {
	int i=100;
	while(i>0){
		System.out.println(i);
		i-=3;
	}
	}
}

