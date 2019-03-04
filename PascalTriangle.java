//2) WAP to generate a PASCAL's TRIANGLE till the number of rows as input by the user.

import java.util.*; 
// Calling the library function (util)
class PascalTriangle 
{ 
    int ROW; 
    int max = 0; // Declaring the data members
    void main() 
    { 
        Scanner sc = new Scanner ( System.in );
        // Creating an object of class Scanner
        System.out.println( " Input the number of rows in the pascal's triangle. " );
        ROW = sc.nextInt();
        int pascal[][]  = new int[ROW +1][];
        pascal[1] = new int[1 + 2];
        pascal[1][1] = 1;
        for (int i = 2; i <= ROW; i++) 
        {
            pascal[i] = new int[i + 2];
            for (int j = 1; j < pascal[i].length - 1; j++) 
            {
                pascal[i][j] = pascal[i-1][j-1] + pascal[i-1][j];
                String str = Integer.toString(pascal[i][j]);// Converting from Integer to String
                int len = str.length();
                if (len > max)
                   {
                       max = len;
                   }
            }
        }
        for (int i = 1; i <= ROW; i++) 
        {                
            for (int k = ROW; k > i; k--)
               {
                   System.out.format("%-" + max + "s", " ");
               }
            for (int j = 1; j < pascal[i].length - 1; j++)                      
               {
                   System.out.format("%-" + (max + max) + "s",  pascal[i][j]);
               }
            System.out.println();
        }
        // Generating the rows and columns of the triangle
    }
}
// End of code