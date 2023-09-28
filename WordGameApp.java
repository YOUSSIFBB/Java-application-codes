/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.wordgameapp;

/**
 *
 * @author youssif
 */
import javax.swing.*;
public class WordGameApp {

    public static void main(String[] args) {
        //var
        char guess; 
        String word; 
        String secretWord; 

        JOptionPane.showMessageDialog(null, "Welcome to the word game");

        WordGame myWordGame = new WordGame();

        secretWord = myWordGame.getSecretWord();
        word = myWordGame.getSecretWord();


        //loops here
        for(int i = 0; i < 10; i++){  // the user can guess 10 letters at a time

            guess = (JOptionPane.showInputDialog(null, "Enter a letter for the missing word")).charAt(0); //get the first character, index 0


            //set method here 
            myWordGame.setGuess(guess); //send the information to the intangible class
            //get methods here
            myWordGame.compute();

            

            word = myWordGame.getWord();   //get the word
            //myWordGame.getSecretWord();
            //myWordGame.getMsg();
            //myWordGame.getNumGuess();



            JOptionPane.showMessageDialog(null, word);  //print message to the user

            if(word.equals(secretWord)){  // this loop here is used to terminate the loop if the user guesses the word correctly, limit number of turns is 10 as stated above
                i = 10;

            }


        }//for loop ends here ----------------------------------------------

        if(secretWord.equals(word)){
            JOptionPane.showMessageDialog(null, "Congrats !!");

        }else{
            JOptionPane.showMessageDialog(null, "Sorry you lost");
            JOptionPane.showMessageDialog(null, "the secret word was " + secretWord);
        }

    
        
    }
}
