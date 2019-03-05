// Write A Program to input two octal numbers as source, taken from the user and find their sum. Print the result.

import java.util.*;
// Calling the library class (util)
class OctalSum
{
    void main ()// Creating a main function
    {
        Scanner sc = new Scanner ( System.in );
        // Creating an object of class Scanner
        System.out.println(" Input the two octal numbers. " );
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int no1 = octToDec(n1,0);
        int no2 = octToDec(n2,0);
        int sum = (no1+no2);
        int sum1 = decToOct(sum);
        // Declaring and initializing the source variables
        System.out.println(" The sum of the two octal numbers is : " + sum1 );
    }
    // End of main
    int octToDec ( int x,int k )// Creating a octToDec function
    {
        if( x==0 )// Terminal Conditional
        {
            return 0;
        }
        else// Iteration Conditional
        {
            return (int)(Math.pow(8,k)*(x%10)+octToDec(x/10,k+1));// Recursion ststement
        }
    }
    int decToOct ( int y )// Creating a decToOct function
    {
        String num="";
        int d=0;
        while( y>0 )// Iteration Conditional
        {
            d = y%8;
            num = num + Integer.toString(d);
            y = y/8;
        }
        return Integer.parseInt(num);// Returning the octal number for printing
    }
}
// End of code