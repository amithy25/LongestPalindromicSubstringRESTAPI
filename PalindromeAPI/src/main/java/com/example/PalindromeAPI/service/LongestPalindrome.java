package com.example.PalindromeAPI.service;

public class LongestPalindrome {

	int resStart = 0, resLength = 0;

	public String getLongestPalindrome(String s) {

		int len = s.length();

		if (len < 2) {
			return s;
		}

		for (int start = 0; start < len; start++) {

			expandString(s, start, start);
			expandString(s, start, start + 1);
		}

		return s.substring(resStart, resStart + resLength);
	}

	private void expandString(String s, int begin, int end) {

		while (begin >= 0 && end < s.length() && s.charAt(begin) == s.charAt(end)) {

			begin--;
			end++;
		}

		if (resLength < end - begin - 1) {
			resStart = begin + 1;
			resLength = end - begin - 1;
		}
	}
}
