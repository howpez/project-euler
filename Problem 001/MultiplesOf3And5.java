/*************************************************************************
 *  Compilation:  javac MultiplesOf3And5
 *  Execution:    java MultiplesOf3And5
 *
 *  Author: Howard Lopez
 * 
 *  A simple Java program to answer Project Euler (http://projecteuler.net) problem 1:
 * 
 *    If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
 *    Find the sum of all the multiples of 3 or 5 below 1000.
 * 
 *  Note: Suggestions to improve code always welcome
 *
 *************************************************************************/

public class MultiplesOf3And5
{
    public static void main(String[] args)
    {
        // m1 and m2 are the numbers whose multiples below max we need add
        int sum = 0;
        int m1 = 3;
        int m2 = 5;
        int max = 1000;
        
        // if a number % (m1 or m2) is equal to 0, we know it's a multiple of m1 or m2, and can add it to sum
        for (int i = 1 ; i < max ; i++)
        {
            if (i % m1 == 0 || i % m2 == 0)
                sum += i;
        }
        
        // answer is now stored in sum
        System.out.println("The sum of multiples of " + m1 + " and " + m2 + " under " + max + " is: " + sum);
        
    }
    
}