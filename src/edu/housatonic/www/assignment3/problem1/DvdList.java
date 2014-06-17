//****************************************************************************************
//	Author: Breno Silva		Last Modified: 03/04/14		Problem 1
//
//	CSC*E224				Programming Assignment 3	Project 13.1
//****************************************************************************************

package edu.housatonic.www.assignment3.problem1;

public class DvdList {
	
	DvdNode list;
	
	// Constructor
	public DvdList(){
		list = null;
	}
	
	//Add dvds to the list
	public void add(Dvd dvd_obj){
		
		DvdNode node = new DvdNode(dvd_obj);
		DvdNode current;
		
		if(list == null)
			list = node;
		else{
			current = list;
			while(current.next != null)
				current = current.next;
			current.next = node;
		}
	}
	
	public int countIT(DvdNode temp){
		int count = 0;
		int sum = 0;
		
		while(temp != null){
			count ++;
			temp = temp.next;
		}
		
		return count;
	}
	
	public String changeHead(){
		
		
		return"";
	}
	
	// toString method
	public String toString(){
		String result = "";
		DvdNode current = list;
		
		while(current.next != null){
			result += current.dvd +"\n";
			current = current.next;
		}
		
		return result;
	}
	
	
}
