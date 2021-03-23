package com.example.PalindromeAPI.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.PalindromeAPI.model.InputString;

public interface StringRepository extends JpaRepository<InputString, String> {

	Optional<InputString> findById(String string);

}
