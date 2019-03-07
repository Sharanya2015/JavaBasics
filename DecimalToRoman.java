// Write A Program to take a Decimal number as input from the user and generate it's Roman equivalent following internationally accepted laws of notation. Print the result.

import java.util.*;
// Calling the library class (util)
class DecimalToRoman
{
    void main ()// Creating a main function
    {
        Scanner sc = new Scanner ( System.in );
        // Creating an object of class Scanner 
        System.out.println(" Input the subject number in decimal Notation, inside the range 1-1000. ");
        int num = sc.nextInt();
        String hund[] = {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
        String ten[] = {"","X","XX","XXX","XL","L","LX","LXX","LXXX","LC"};
        String unit[] = {"","I","II","III","IV","V","VI","VII","VIII","IX"};
        int copy = num;
        // Declaring and initializing the data members
        System.out.println();
        System.out.println();
        System.out.println(" The input Decimal number is: " + " " + copy);
        System.out.println();
        if( num > 1000 )
        {
            System.out.println(" The input number is beyond the scope of execution of this code. ");
            System.exit(-9999);
        }// Wrong input case and termination
        System.out.print(" The Roman equivalent of the input number is: " + " ");
        if( num == 1000 )
        {
            System.out.print(" M ");
        }
        else if( num >= 100 && num <= 999 )
        {
            System.out.print(hund[num/100]);
            System.out.print(ten[(num/10)%10]);
            System.out.print(unit[num%10]);
        }
        else if( num >= 10 && num <= 99 )
        {
            System.out.print(ten[num/10]);
            System.out.print(unit[num%10]);
        }
        else
        {
            System.out.print(unit[num]);
        }
        // Generating and printing the roman equivalence depending on some standard laws of equivalence
    }
    // End of main
}
// End of code