package com.practicaPalindrome.dtos;

public class PalindromeResult {

    private String word;
    private boolean isPalindrome;

    public PalindromeResult(String word, boolean isPalindrome){
        this.word = word;
        this.isPalindrome = isPalindrome;
    }

    public String getWord(){
        return word;
    }

    public boolean isPalindrome(){
        return isPalindrome;
    }
}
