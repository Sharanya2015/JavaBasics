// Write A Program to input a string from the user and generate the anagrams of the source string. Print all the anagrams of the input string.

import java.util.*;
// Calling the library class (util)
class Anagram
{
    void makeAnagram ( char a[],int i )// Creating a makeAnagram function
    {
        int j;// Declaring the loop counter
        if( i == (a.length-1) )// Terminal Conditional
        {
            printArray(a);// Calling the printArray function to print the permutations generated
        }
        else// Conditional to generate the anagrams
        {
            for( j=i;j<a.length;j++ )
            {
                char ch = a[i];
                a[i] = a[j];
                a[j] = ch;
                makeAnagram(a,i+1);// Recursion statement
                char ch1 = a[i];
                a[i] = a[j];
                a[j] = ch1;
            }
        }
    }
    void printArray ( char arr[] )// Creating a printArray function
    {
        int i,l=arr.length;// Initializing the loop variables
        for( i=0;i<l;i++ )
        {
            System.out.print( arr[i] );// Printing the generated permutations
        }
        System.out.println();
    }
    void main ()// Creating a main function
    {
        Scanner sc = new Scanner ( System.in );
        // Creating an object of class Scanner 
        System.out.println(" Input the string(word) for which we are required to generate anagrams. ");
        String s = sc.next();
        int l=s.length(),i;
        char chr[] = new char [l];
        // Declaring and initializing the data members
        for( i=0;i<l;i++ )
        {
            chr[i] = s.charAt(i);// Character extraction
        }
        System.out.println(" The anagrams of the input string are: ");
        makeAnagram(chr,0);// Call ststement to generate the anagrams
    }
    // End of main
}
// End of code