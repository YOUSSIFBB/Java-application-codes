/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package greetingcardapp;


/**
 * Date: 24/10/2022
 * @author youssif
 */
public class Christmas extends Card {
    
    //vars 
    final protected String  greetingMessage[]= {"Dear, ","Greatings, ","My Dear, "}; //first array salutaion
    final protected String verse [] = {"We wish you a merry chrismas","we wish you a blesses and safe Christmas","Merry Christmas and a happy new year"}; //second array verse
    final protected String clossingMessage[]= {"Regards,","Best Regards,", "Best wishes,"}; //third array closing messege
    //vars for array selection - one for each array declared
    
    protected String printG, printV, printC; //variavles used to print the array
    
    //super class construcutor for intputs
    public Christmas(String recipient, String sender){
        super(recipient, sender);
    }
    
    @Override
    public void initialise(){  //initialise all array variables in this class ***Does not work Null error***
    /*
    String greetingMessage[] = {"Dear , ","Greatings , ","My Dear ,"}; //salutaion
    String clossingMessage[] = {", Regards",", Best regards", ", My regards"}; //closign verse
    String verse [] = {"I wish you a Merry Christmas", "I wish you a cozy and a Merry Christmas", "I wish you allw the best and Merry Christmas"};
    */
    
    }
    
    @Override
    public void salutation(){
        IndexRandom(); //choose random salutaion from the array (3)
        printG = greetingMessage[index] + "" + recipient + "\n";
    }
    
    @Override
    public void verse(){
        IndexRandom(); //choose random verse from the array (3)
        printV = verse[index] + "\n";
        
    }
    
    
    
    @Override
    public void closing(){
        IndexRandom();  //choose random closing message from the array (3)
        printC = clossingMessage[index] + "\n"+sender;
        
    }
    
  
    @Override
    public String getDetails(){   //combine the instansaited variables here
        output = printG + printV + printC;
        return output;
    }

    
    
    
    
 
    
    
    
    
    
    
    
    
    
    
    
    
   
    
    
    
}
