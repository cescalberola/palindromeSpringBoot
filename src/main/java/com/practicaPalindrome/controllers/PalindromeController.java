package com.practicaPalindrome.controllers;

import com.practicaPalindrome.dtos.PalindromeResult;
import com.practicaPalindrome.services.PalindromeService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/palindromo")
public class PalindromeController {

    private final PalindromeService palindromeService;

    public PalindromeController(PalindromeService palindromeService) {
        this.palindromeService = palindromeService;
    }

    // Versión 1: Devuelve texto plano
    @GetMapping("/texto/{word}")
    public String verifyPalindromePlain(@PathVariable String word) {
        boolean isPalindrome = palindromeService.isPalindrome(word);
        if (isPalindrome) {
            return "La palabra \"" + word + "\" es un palíndromo.";
        } else {
            return "La palabra \"" + word + "\" NO es un palíndromo.";
        }
    }

    // Versión 2: Devuelve JSON con el DTO
    @GetMapping("/json/{word}")
    public PalindromeResult verifyPalindromeJson(@PathVariable String word) {
        boolean isPalindrome = palindromeService.isPalindrome(word);
        return new PalindromeResult(word, isPalindrome);
    }
}
