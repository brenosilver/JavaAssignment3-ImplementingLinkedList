//****************************************************************************************
//	Author: Breno Silva		Last Modified: 03/07/14		Problem 2
//
//	CSC*E224				Programming Assignment 3	Project 13.2
//****************************************************************************************

package edu.housatonic.www.assignment3.problem2;

public class MagazineRack {


	public static void main(String[] args) {
		MagazineList rack = new MagazineList();
		

		rack.insert(new Magazine("The New York Times"));
		rack.insert(new Magazine("National Geographic"));
		rack.insert(new Magazine("People"));
		/*rack.insert(new Magazine("Time"));
		rack.insert(new Magazine("Us Weekly"));
		rack.insert(new Magazine("Reader's Digest"));
		rack.insert(new Magazine("Cosmopolitan"));
		rack.insert(new Magazine("Glamour"));
		rack.insert(new Magazine("Rolling Stone"));*/

		/*rack.delete(new Magazine("Reader's Digest"));
		rack.delete(new Magazine("The New York Times"));
		rack.delete(new Magazine("Rolling Stone"));*/
		
		
		//System.out.println(rack);
		
		rack.midTerm3();
		//System.out.println(rack);

	}

}
