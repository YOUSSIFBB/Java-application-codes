/*
* File name : CoinToss.java
* Date: 6/05/2022
* @author: Youssef Alij
* Student number : x20252561
*/
public class CoinToss {//class

    //variables
    private int coin [] = new int [2]; // 1D array size 2 because we are fliping twice
    private int points; 

    //constructor
    public CoinToss(){
        points = 0;  
    }

    //the first comput method here called flip(), generates the heads and tails using the math.random method
    public void flip(){
        for(int i = 0; i < coin.length; i++){ //this for loop condition checks the arrays length
            coin[i] = (int)(Math.random()*2); // generates a random number bettween the range of 0 and 1
        }
    }


    //the second compute method here calculates the points for the user    
    public void calculatePoints(){                                  //use coin[0] to acces the first index and coin [1] for the second index
        //points system here , 0 for Heads , 1 for Tails                  
        if((coin[0] == 0) && (coin[1] == 0)){                     //first and second toss is heads  +50
            points += 50;
        }else if((coin[0] == 1) && (coin[1] == 1)){               //first and second toss is tails -50
            points -= 50; 
        }else{                                                       // if first and second is mixed , heads and tails +20
            points += 20;
        }
        
    }

    //Accessors - get methods are placed here - one for every output 
    public int[] getCoin(){
        return coin;
    }

    public int getPoints(){
        return points;
    }

 

   
}//class
