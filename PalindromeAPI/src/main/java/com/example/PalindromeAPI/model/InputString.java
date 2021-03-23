package com.example.PalindromeAPI.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class InputString {

	@Id
	private String input;
	private String longestPalindrome;

	public InputString() {
		// TODO Auto-generated constructor stub
	}

	public InputString(String id, String longestPalindrome) {
		this.input = id;
		this.longestPalindrome = longestPalindrome;
	}

	public String getId() {
		return input;
	}

	public void setId(String id) {
		this.input = id;
	}

	public String getLongestPalindrome() {
		return longestPalindrome;
	}

	public void setLongestPalindrome(String longestPalindrome) {
		this.longestPalindrome = longestPalindrome;
	}

	@Override
	public String toString() {
		return "InputString [id=" + input + ", longestPalindrome=" + longestPalindrome + "]";
	}

}
