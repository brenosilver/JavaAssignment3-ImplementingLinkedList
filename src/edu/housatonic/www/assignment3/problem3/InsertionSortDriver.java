//****************************************************************************************
//	Author: Breno Silva		Last Modified: 03/07/14		Problem 2
//
//	CSC*E224				Programming Assignment 3	Project 13.2
//
// Code By: Prof F. Ravanshad 
//****************************************************************************************

package edu.housatonic.www.assignment3.problem3;

import java.util.Random;

public class InsertionSortDriver
{
   public static final int MIN_NUMBERS = 10;  // min number of generated values
   public static final int RANGE = 20;        // range for number of generated values
   public static final int MAX_INT_VALUE = 100;

   
   //  Sorts a linked list of integers.
   
   public static void main (String args[]) 
   {
      Random gen = new Random();
      InsertionSort sorter = new InsertionSort();
        
      int numInts = gen.nextInt(RANGE) + MIN_NUMBERS;
        
      System.out.println("Generated " + numInts + " integers:");
        
      for (int i=0; i < numInts; i++)
         sorter.add(gen.nextInt(MAX_INT_VALUE));

      System.out.println(sorter);  // unsorted

      sorter.sort();

      System.out.println("Sorted:");
      System.out.println(sorter);
   }
}
