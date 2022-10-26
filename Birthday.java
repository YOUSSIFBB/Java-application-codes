/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package greetingcardapp;

/**
 *
 * @author youssif
 */
public class Birthday extends Card{
    
    final protected String bGreating [] = {"To, ","Dear, ","To the greatest, "};
    final protected String bVerse [] = {"I wish you a happy birthday","Hope all your birthday wishes come true","I wish you all the best, happy birthday"};
    final protected String bClosing [] = {"from, ","your friend, ","Kind wishes, "};
 
    protected String printG, printV, printC;
    
    public Birthday (String recipient, String sender){  //contrucotr with super class vars 
        super(recipient, sender);
    
    }
    
    
    @Override
    public void initialise(){
        IndexRandom();
    }
    @Override
    public void salutation(){
        IndexRandom();
        printG = bGreating[index]+ ""+ recipient + "\n";
    }
    @Override
    public void verse(){
        IndexRandom();
        printV =  bVerse[index] + "\n";
    }
    @Override
    public void closing(){
        IndexRandom();
        printC = bClosing[index] + "\n" + sender;
    }
    @Override
    public String getDetails(){
        
        output = printG + printV + printC;
        return output;
    
    }
    
    
    
    
    
    
    
    
    
}
