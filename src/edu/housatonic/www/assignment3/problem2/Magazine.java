//****************************************************************************************
//	Author: Breno Silva		Last Modified: 03/07/14		Problem 2
//
//	CSC*E224				Programming Assignment 3	Project 13.2
//****************************************************************************************

package edu.housatonic.www.assignment3.problem2;

public class Magazine implements Comparable<Magazine>{
	private String title;
	
	
	public Magazine(String newTitle){
		this.title = newTitle;
	}
	
	public String toString(){
		return this.title;
	}

	// Return Negative: if obj 1 < obj 2,
	// 0 if equals,
	// Positive: if obj 1 > obj 2
	@Override
	public int compareTo(Magazine magzine) {
		int foo = this.title.compareToIgnoreCase(magzine.title);
		return foo;
	}

	public String getTitle() {
		return title;
	}

}
