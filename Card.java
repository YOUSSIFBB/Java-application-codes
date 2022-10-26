/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package greetingcardapp;
import java.util.Random;    //random package for array index cycle

/**
 * Date 24/10/2022
 * @author youssif
 */
public abstract class Card {
    
    
    //vars used for inputs only 
    protected String recipient; 
    protected String sender;
    
    //out put message
    protected String output;
    protected int index; //select the random index from the array
    
    
    //construcotr
    public Card(){
        recipient = " ";
        sender = " ";
        output = " ";
    }
    
    //variables to be inherited by subclasses
    public Card(String recipient, String sender){  //overloaded constructor- Method
        this.recipient = recipient; 
        this.sender = sender;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

  
    
     
    //abstract methods to be overridden in sub classes
    public abstract void initialise();  //verses and closing
    public abstract void salutation();   //message to the receipeint (salutation)
    public abstract void verse(); // bosy senetnce (verse)
    public abstract void closing(); //ends the sentence
    public abstract String getDetails();
    
    
    
    //template method final(Design pattern)
    public final void Create(String recipient, String sender){
        initialise(); 
        salutation(); 
        verse(); 
        closing();
        getDetails();
    }
    
    
    //template method final so subclasses cant override (Design pattern using void Random util package) 
    public final void IndexRandom(){   //provide link here
        Random ran = new Random();
        index = ran.nextInt(3); //cycle through the array -- we have three cycles
    }
    
    
    
    
    
    
}
