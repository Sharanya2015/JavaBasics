// Write A Program to generate and print a SPIRAL MATRIX of index n, where n is the size of the matrix that is to be accepted from the user. 

import java.util.*;
// Calling the library class (util)
class SpiralMatrix
{    
    void main()// Creating a main function
    {
        Scanner sc = new Scanner ( System.in );
        // Creating an object of class Scanner
        System.out.println(" Input the size of the spiral matrix to be generated. ");
        int size = sc.nextInt();
        // Taking the size of the square array input from the user
        System.out.println();
        System.out.println(" The spiral matrix generated is : ");
        System.out.println();
        int arr[][] = new int [size][size],row=0,col=size-1,master=1,fact=0,i,j,temp=0;
        // Declaring and initializing the variables
        while(master <= (size*size))// Conditional loop
        {
            fact = 1;
            if(row == col)
            {
                arr[row][row] = master;
                break;
            }// Terminal condition
            for( j=1;j<=2;j++)
            {
                for( i=row;i!=col;i+=fact)
                {
                    arr[row][i]=master++;
                }
                for ( i=row;i!=col;i+=fact)
                {
                    arr[i][col] = master++;
                }
                fact = -1;
                temp = row;
                row = col;
                col = temp;
            }
            row++;
            col--;
            // Filling up the array in spiral form
        }
        for ( i=0;i<size;i++)
        {
            for ( j=0;j<size;j++)
            {
                System.out.print(arr[i][j]+ "\t");
            }
            System.out.println();
        }// Printing the array
    }
    // End of main
}
// End of code
