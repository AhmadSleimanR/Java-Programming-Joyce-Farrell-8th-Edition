/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passarray;

public class PassArray
{
public static void main(String[] args)
{
    final int NUM_ELEMENTS = 4;
    int[] someNums = {5, 10, 15, 20};
    int x;
    System.out.print("At start of main: ");
    for(x = 0; x < NUM_ELEMENTS; ++x)
    System.out.print(" " + someNums[x]);
    System.out.println();
    methodGetsArray(someNums);
    System.out.print("At end of main: ");
    for(x = 0; x < NUM_ELEMENTS; ++x)
    System.out.print(" " + someNums[x]);
    System.out.println();
}

public static void methodGetsArray(int[] arr)
{
    int x;
    System.out.print("At start of method arr holds: ");
    for(x = 0; x < arr.length; ++x)
    System.out.print(" " + arr[x]);
    System.out.println();
    for(x = 0; x < arr.length; ++x)
    arr[x] = 888;
    System.out.print(" and at end of method arr holds: ");
    for(x = 0; x < arr.length; ++x)
    System.out.print(" " + arr[x]);
    System.out.println();
    }
}