//****************************************************************************************
//	Author: Breno Silva		Last Modified: 03/07/14		Problem 2
//
//	CSC*E224				Programming Assignment 3	Project 13.2
//
// Code By: Prof F. Ravanshad 
//****************************************************************************************

package edu.housatonic.www.assignment3.problem3;


public class InsertionSort
{
   private SortNode list;
    
   
   
 
   public InsertionSort() 
   {
      list = null;
   }

   
   //  Adds an integer to the linked list
   
   public void add(int value)
   {
      SortNode node = new SortNode(value);
      SortNode current = null;

      if (list == null)
         list = node;
      else
      {
         current = list;
         while (current.next != null)
            current = current.next;
         current.next = node;
      }    
   }

  
   //  Inserts SortNode in list in ascending order relative 
   //  to the other nodes in list.
  
   private void insert (SortNode node)
   {
      SortNode current;
      SortNode previous = null;
      boolean done = false;

      if (list == null)
         list = node;
      else
      {
         current = list;
         while (!done)
         {
            if (current.value > node.value)  // add before current
            {
               if (previous != null)
                  previous.next = node;
               else
                  list = node;

               node.next = current;
               done = true;
            }
            else
               if (current.next == null)   // add after current
               {
                  current.next = node;
                  done = true;
               }
               else // move to next
               {
                  previous = current;
                  current = current.next;
               }
         }
      }
   }

  
   //  Sorts the linked list using the insertion sort.
  
   public void sort()
   {
      SortNode current = list; 
      list = null;
      
      if (current == null)
         return;

      // add first node
      SortNode temp = current;
      current = current.next;
      temp.next = null;
      insert(temp);      
    
      // add suceeding nodes
      while (current != null)
      {
         temp = current;
         current = current.next;
         temp.next = null;
         insert(temp);
      }
   }
    
  
   //  Returns a listing of the contents of the linked list.
  
   public String toString()
   {
      String report = "";
      SortNode current = list;
        
      if (current != null)
      {
         report += String.valueOf(current.value) + " ";
         while (current.next != null)
         {
            current = current.next;
            report += String.valueOf(current.value) + " ";
         }
      }

      return report;
   }
    
   
   
   private class SortNode
   {
      public int value;
      public SortNode next;

      
      //  Sets up the node.
    
      public SortNode (int current)
      {
         value = current;
         next = null;
      }
   }
}

