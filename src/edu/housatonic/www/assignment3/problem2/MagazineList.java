//****************************************************************************************
//	Author: Breno Silva		Last Modified: 03/07/14		Problem 2
//
//	CSC*E224				Programming Assignment 3	Project 13.2
//****************************************************************************************

package edu.housatonic.www.assignment3.problem2;

public class MagazineList {
	
	private MagazineNode list;
	
	// Constructor
	public MagazineList(){
		list = null;
	}
	
	//Add magazines to the list
	public void add(Magazine mag){
		
		MagazineNode node = new MagazineNode(mag);
		MagazineNode current;
		
		if(list == null)
			list = node;
		else{
			current = list;
			while(current.next != null)
				current = current.next;
			current.next = node;
		}
	}
	
	// Insert Method
	// Insert an item at their correct alphabetic position in the list
	// Code by Prof. Frank Ravanshad
	public void insert(Magazine mag){
		MagazineNode new_node = new MagazineNode(mag);
		MagazineNode current;
		MagazineNode previous = null;
		boolean done = false;
		
		if(list == null)
			list = new_node;
		else{
			current = list;
			
			while(!done){
				 int compareResult = current.magazine.compareTo(mag);
				 
				 if (compareResult == 0)  // duplicate
					 return;
				 
				if(compareResult > 0){
					if(previous != null)
						previous.next = new_node;
					else
						list = new_node;
					
					new_node.next = current;
					done = true;
				}
				
				else
					if(current.next == null){
						current.next = new_node;
						done = true;
					}
					else{
						previous = current;
						current = current.next;
					}
			}
		}
	}
	
	public void midTerm(){
		MagazineNode current;
		
		list.next.next.next = list.next;
		list.next = list.next.next;
		list.next.next.next = null;
	}
	
	public void midTerm2(){
		
		list = list.next;
	}
	
	public void midTerm3(){
		int count = 0;
		MagazineNode current = list;
		
		try{
			while(true){
				System.out.println(current.magazine);
				current = current.next;
				count++;
			}
		}
		
		catch(NullPointerException e){
			System.out.println(e.getMessage());
			System.out.println("Number of Nodes in the list: " + count);
		}
		
	//	return result;
	}
	
	
	// Delete an items with an specific title
	//public MagazineNode delete(String key){
	public MagazineNode delete(Magazine key){
		MagazineNode current = list;           
		MagazineNode previous = list;
		
		if(isEmpty())
			return null;
		
		else{
		//while(current.magazine.getTitle() != key){
			while(current.magazine.compareTo(key) != 0){
	    	  
				if(current.next == null)
					return null;                 
				else{
					previous = current;
					current = current.next;
				}
			}    

			if(current == list)
				list = list.next;
			else
				previous.next = current.next;
	
			return current;
		}
	}
	
	
	// toString method
	public String toString(){
		String result = "";
		MagazineNode current = list;
		
		while(current != null){
			result += current.magazine +"\n";
			current = current.next;
		}
		
		return result;
	}
	
	// Check if list is empty
	public boolean isEmpty()          // true if no links
    { return list==null; }
	
	
}
