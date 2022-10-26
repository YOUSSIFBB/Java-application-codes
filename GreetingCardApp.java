/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package greetingcardapp;
import javax.swing.JOptionPane;

/**
 * Date 24/10/2022
 * @author youssif
 */

public class GreetingCardApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        
        //variable for user selection
        int select; 
         
        JOptionPane.showMessageDialog(null, "Welcome to the Greeting cards App");
        select = Integer.parseInt(JOptionPane.showInputDialog(null, "Select which Card you would like to create"+ "\n 1.Christmas" + "\n2. Wedding" + "\n3. Birthday"));
        
        //if stament here
        if(select == 1){
            //christmas objects and methods here

            String recipient = JOptionPane.showInputDialog(null,"Message to");
            String sender = JOptionPane.showInputDialog(null,"Message from");
            Card myCard; 
            myCard = new Christmas(recipient, sender);   


            myCard.Create(recipient, sender);   
            JOptionPane.showMessageDialog(null, myCard.getDetails());
        
        }else if(select == 2){    
            
            //Wedding objects and methods here
            String recipient = JOptionPane.showInputDialog(null,"Message to");
            String sender = JOptionPane.showInputDialog(null,"Message from");
            
            Card myCard; 
            myCard = new Wedding(recipient,sender); 
            
            myCard.Create(recipient, sender);
            JOptionPane.showMessageDialog(null,myCard.getDetails());
        
        }else if(select == 3){
            
            //birthday methods and overloaded construcots here
            
            String recipient = JOptionPane.showInputDialog(null,"Message to");
            String sender = JOptionPane.showInputDialog(null,"Message from");
            
            Card myCard; 
            myCard = new Birthday(recipient,sender);
            
            myCard.Create(recipient, sender);
            
            JOptionPane.showMessageDialog(null, myCard.getDetails());
            
            
        }else{
            
            JOptionPane.showMessageDialog(null, "Sorry Invalid selection!");
        }
        
        
        
        
        
        
    }
    
}
