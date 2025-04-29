package com.practicaPalindrome.controllers;

import com.practicaPalindrome.services.PalindromeService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/palindromo")
public class PalindromeController {

    private final PalindromeService palindromeService;

    public PalindromeController(PalindromeService palindromeService){
        this.palindromeService = palindromeService;
    }

    @GetMapping("/{word}")
    public String verifyPalindrome(@PathVariable String word){
        boolean isPalindrome = palindromeService.isPalindrome(word);
        if (isPalindrome) {
            return "La palabra \"" + word + "\" es un palíndromo.";
        } else {
            return "La palabra \"" + word + "\" NO es un palíndromo.";
        }
    }
}
