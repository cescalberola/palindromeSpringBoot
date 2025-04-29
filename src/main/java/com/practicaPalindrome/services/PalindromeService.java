package com.practicaPalindrome.services;

import org.springframework.stereotype.Service;

@Service
public class PalindromeService {

    public boolean isPalindrome(String word){
        int init = 0;
        int fin = word.length() -1;

        while (init < fin){
            if(word.charAt(init) != word.charAt(fin)){
                return false;
            }
            init++;
            fin--;
        }
        return true;
    }
}
