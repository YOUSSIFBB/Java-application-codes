/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studyapp;
import java.io.Serializable; //import serializable package of I/O load and save buttons

/**
 *
 * @author youssif
 * *date : 4/01/2023
 * Student number : x20252561
 */
public class Study implements Serializable{
    //protected varibales here
    protected String day;            //day is the week
    protected String time;           //time will be in either AM or PM manualy inserted by the user or in 24 hour timing e.g 16:30
    protected double duration;      // in minutes therefore double to ensure exact value
    protected String module;         //module name
    
   //constructor with paramaters
    public Study(String day, String time, double duration, String module){
        this.day = day; 
        this.time = time; 
        this.duration = duration; 
        this.module = module;
    }
    
    //default constructor
    public Study(){
        day = " ";
        time = " "; 
        duration = 0; 
        module = " ";
    }
    
    //setters and getter 

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }
    
    //get details method here 
    public String getDetails(){
        return "Day : "+ day + "\nTime : " + time + "\n Duration : " + duration + " minutes" + "\n Module : " + module;
    
    }
    
    
}
