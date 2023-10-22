/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studyapp;

/**
 *
 * @author youssif
 */
public class Personal extends Study {
    //variables for Personal session class 
    protected String studyTopic; 
    
    
    //constructor with paramaters with super class
    public Personal(String studyTopic,String day, String time, double duration, String module){
        super(day, time, duration, module);
        this.studyTopic = studyTopic;
       
    }
    
    //default construcotr
    public Personal(){
        super(); 
        studyTopic = " ";
    }
    
    //setters and getters for Personal class here 

    public String getStudyTopic() {
        return studyTopic;
    }

    public void setStudyTopic(String studyTopic) {
        this.studyTopic = studyTopic;
    }
    
    
    //get details method for the Personal session class here with Override
    @Override   
    public String getDetails(){
        return super.getDetails() + "\nStudy Topic : " + studyTopic;
    }
    
    
}
