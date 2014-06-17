//****************************************************************************************
//	Author: Breno Silva		Last Modified: 03/04/14		Problem 1
//
//	CSC*E224				Programming Assignment 3	Project 13.1
//****************************************************************************************

package edu.housatonic.www.assignment3.problem1;

public class DvdNode {
	
	public Dvd dvd;
	public DvdNode next;
	public int info;
	
	public DvdNode(Dvd dvd_obj){
		dvd = dvd_obj;
		next = null;
	}

}
