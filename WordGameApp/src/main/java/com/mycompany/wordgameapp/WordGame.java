/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.wordgameapp;

/**
 *
 * @author youssif
 */
public class WordGame {
    private char guess; 
    private String word; 
    private String secretWord; 
    private int numGuess; 
    private String msg;
    private StringBuffer strBuff;



    public WordGame(){
        guess = ' ';
        word = " ";
        secretWord = "house";
        strBuff = new StringBuffer("*****");
        numGuess = 1;
        msg = " ";
        

    }

    public void setGuess(char guess) {
        this.guess = guess;
    }




    public String getWord() {
        return word;
    }

    public String getSecretWord() {
        return secretWord; 
    }

    public void compute(){
        for(int i = 0; i < secretWord.length(); i++){
            if(guess == secretWord.charAt(i)){
                strBuff.setCharAt(i, guess);
            } // if 
        
        }// for loop
        word = strBuff.toString();
    
    }
    
    


}
