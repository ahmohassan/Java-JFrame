package com.company;


import java.util.Scanner;


class Main {

    // driver program
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("1. Odd magic square  \nSelect: ");
        int SelectMagic = keyboard.nextInt();

        switch (SelectMagic){
            case 1:
                System.out.print("enter number of odd of n:") ;
                int n =keyboard.nextInt();
                if(n>0 && n%2 != 0  ){
                    OddOrder.MagicSquareOdd(n);
                }else {
                    System.out.println("please enter positive number of odd of n:");
                }
                break;
            default:
                System.out.println("Please check number options you have");
        }


    }
}
//Odd magic square
class OddOrder{
    static void MagicSquareOdd(int n)
    {
        int[][] MagicOddNumbes = new int[n][n];

        // Initialize position for 1
        int i = n / 2;
        int j = n - 1;

        // One by one put all values in magic square
        for (int num = 1; num <= n * n;) {
            if (i == -1 && j == n) // 3rd condition
            {
                j = n - 2;
                i = 0;
            }
            else {

                if (j == n)
                    j = 0;


                if (i < 0)
                    i = n - 1;
            }

            // 2nd condition
            if (MagicOddNumbes[i][j] != 0) {
                j -= 2;
                i++;
                continue;
            }
            else
                // set number
                MagicOddNumbes[i][j] = num++;

            // 1st condition
            j++;
            i--;
        }

        // print magic square
        System.out.println("The Magic Square for " + n
                + ":");
        System.out.println("Sum of each row or column "
                + n * (n * n + 1) / 2 + ":");
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++)
                System.out.print(MagicOddNumbes[i][j] + " ");
            System.out.println();
        }
    }
}


