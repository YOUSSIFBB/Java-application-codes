/*
* File name : CoinTossApp.java
* Date: 6/05/2022
* @author: Youssef Alij
* Student number : x20252561
* Reference: https://www.geeksforgeeks.org/arrays-in-java/ 
* Reference: https://www.w3schools.in/java/examples/coin-toss 
* (****Please note these websites were used only for the initial palnning and approch for this application, i fully developed this code by myself*****)
*/
import javax.swing.JOptionPane;   //JOPtionPane package to accept user input
public class CoinTossApp {  //class decleration
    public static void main (String args []){ //PSV main()

        //variables 
        int coin [] = new int [2]; //decaring and creating a one dimetional array with a size of 2
        int points;

        //print welcome message to the user
        JOptionPane.showMessageDialog(null, "Welcome to the coin Toss game !");
        JOptionPane.showMessageDialog(null, "Press ok to start");

        //declare and create object for instaible class
        CoinToss myCoinToss = new CoinToss(); 

        // we use a do..while loop here to execute the code
        do {
            //call the method that generates the coin toss 
            myCoinToss.flip();

            //call the points method 
            myCoinToss.calculatePoints();

            //get the coins back, place it in a the new variable called coins
            coin = myCoinToss.getCoin();

            //convert
            for(int j = 0; j < coin.length; j++){  //this loop here prints the result from the instaible that is returned, myCoinToss.getCoins();
            
                if(coin[j] == 0){ //if statments here convert the values 0 and 1 to string, 0 for heads and 1 for tails
                    JOptionPane.showMessageDialog(null, "Heads");  // if coin == 0 print heads
                }else if (coin[j] == 1){
                    JOptionPane.showMessageDialog(null, "Tails");  // if coin ==1 print tails
                }
            
                //JOptionPane.showMessageDialog(null, coin[j]); //this here prints the values 0 and 1 
            }

             //display points to the user
             JOptionPane.showMessageDialog(null, "Points : " + myCoinToss.getPoints());

        }while(myCoinToss.getPoints() < 100);   //By using the while loop, we use a boolean codition to terminate the code once the score reaches 100 or above
        

   
    }//PSV main();
  
}//class
