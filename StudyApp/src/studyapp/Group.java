/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studyapp;

/**
 *
 * @author youssif
 */
public class Group extends Study{
    //variables for Group projects class 
    protected String teamMates;    //team mates 
    protected String assesmentName;   //assesment name
    
    
    //constructor with paramaters with super class
    public Group(String teamMates, String assesmentName, String day, String time, double duration, String module){
        super(day, time, duration, module);
        this.teamMates = teamMates; 
        this.assesmentName = assesmentName;
    }
    
    //default constructor
    public Group(){
        super(); 
        teamMates = " ";
        assesmentName = " ";
    }
    
    //setters and getter for the Group session class 

    public String getTeamMates() {
        return teamMates;
    }

    public void setTeamMates(String teamMates) {
        this.teamMates = teamMates;
    }

    public String getAssesmentName() {
        return assesmentName;
    }

    public void setAssesmentName(String assesmentName) {
        this.assesmentName = assesmentName;
    }
    
    
    //get details method for Groups session class
    @Override
    public String getDetails(){
        return super.getDetails()+ "\nTeam mates : " + teamMates + "\nassesment Name : " + assesmentName; 
    }
    
    
    
}
