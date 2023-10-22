/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studyapp;


/**
 *
 * @author youssif
 * date : 4/01/2023
 * Student number : x20252561
 */
public class StudyApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        StudyGUI myGUI = new StudyGUI(); 
        myGUI.setVisible(true);
        
        //calling the auto load function from the GUI class 
        myGUI.AutoLoad();
        
    }//main class 
    
}
