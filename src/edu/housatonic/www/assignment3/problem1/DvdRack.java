//****************************************************************************************
//	Author: Breno Silva		Last Modified: 03/04/14		Problem 1
//
//	CSC*E224				Programming Assignment 3	Project 13.1
//****************************************************************************************

package edu.housatonic.www.assignment3.problem1;

public class DvdRack {


	public static void main(String[] args) {
		DvdList rack = new DvdList();
		
		rack.add(new Dvd("GroundHog Day"));
		rack.add(new Dvd("Ghost Busters"));
		rack.add(new Dvd("Contact"));
		rack.add(new Dvd("The Prestige"));
		rack.add(new Dvd("The Departed"));
		
		System.out.println(rack);
		System.out.println("____________");
		System.out.println(rack.countIT(rack.list));

	}

}
