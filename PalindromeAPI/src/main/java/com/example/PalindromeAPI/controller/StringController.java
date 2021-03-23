package com.example.PalindromeAPI.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.PalindromeAPI.model.InputString;
import com.example.PalindromeAPI.service.LongestPalindromeServiceImpl;

import io.swagger.annotations.ApiOperation;

@RestController
public class StringController {

	private LongestPalindromeServiceImpl service;

	@Autowired
	public StringController(LongestPalindromeServiceImpl service) {
		this.service = service;
	}

	@ApiOperation(value = "Save the input String to the database.", response = String.class)
	@PostMapping("/saveString")
	public String saveString(@RequestBody InputString s) {

		service.saveString(s);
		return "Input String saved";
	}

	@ApiOperation(value = "Get all the input strings and their longest palindromic substrings from local storage", response = InputString.class)
	@GetMapping("/getAllStrings")
	public List<InputString> getAll() {

		return service.getAll();
	}

	@ApiOperation(value = "get longest substring of input string", response = String.class)
	@GetMapping("/getLongestPalindrome/{str}")
	public String longestPalindrome(@PathVariable String str) {
		return service.getString(str);
	}
}
