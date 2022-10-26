/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package greetingcardapp;

/**
 *
 * @author youssif
 */
public class Wedding extends Card{
    
    final protected String wGreating[] = {"My Dear, ","Dear, ","To The Best person in the world, "};
    final protected String wVerse [] = {"Heres to a long and a happy marriage","Wishing you all the love and happiness","Wishing you the best today and beyond"};
    final protected String wClosing [] = {"Your Friend, ","Your Buddy","Your Best Friend, "};
    
    protected String printG, printV, printC; 
    //constructor super class 
    
    public Wedding(String recipient, String sender){
        super(recipient, sender);
    
    }
    
    
    //methods from abstarct class here 
    
    @Override
    public void initialise(){
        IndexRandom();
    }
    
    @Override
    public void salutation(){
        IndexRandom();
        printG = wGreating[index] + ""+ recipient + "\n";
    }
    @Override
    public void verse(){
        IndexRandom();   
        printV = wVerse[index] + "\n";
    }
    
    @Override
    public void closing(){
        IndexRandom();    
        printC = wClosing[index] + "\n" + sender;
    }
    
    @Override
    public String getDetails(){
        output = printG + printV + printC;
        return output;
    
    }
    
    
    
    
    
}
