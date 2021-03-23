package com.example.PalindromeAPI.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.PalindromeAPI.dao.StringRepository;
import com.example.PalindromeAPI.model.InputString;

@Service
public class LongestPalindromeServiceImpl implements LongestPalindromeServiceInterface {

	private StringRepository repository;

	@Autowired
	public LongestPalindromeServiceImpl(StringRepository repository) {
		this.repository = repository;
	}

	public String saveString(InputString s) {

		String pal = s.getLongestPalindrome();
		System.out.println("longest palindrome: " + pal);

		LongestPalindrome lp = new LongestPalindrome();
		s.setLongestPalindrome(lp.getLongestPalindrome(s.getId()));

		repository.save(s);
		return "Input String saved";
	}

	public List<InputString> getAll() {

		return repository.findAll();
	}

	public String getString(String s) {

		Optional<InputString> res = repository.findById(s.toString());
		if (res.isPresent()) {
			InputString is = res.get();
			// System.out.println("optional palindrome: " + is.getLongestPalindrome());
			return "Longest Palindrome is: " + is.getLongestPalindrome();
		}
		return "No String found";
	}

}
