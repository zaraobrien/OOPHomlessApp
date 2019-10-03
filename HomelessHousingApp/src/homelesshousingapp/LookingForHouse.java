/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homelesshousingapp;

/**
 *
 * @author x17138752
 */
public class LookingForHouse extends Person{
    
    private int NumPeople;
    private String gender;
    private String dob;
    private int ID;

    public LookingForHouse(String fname, String lname, String contactNo,int NumPeople, String gender, String dob,int ID) {
        super(fname, lname, contactNo);
        this.NumPeople = NumPeople;
        this.gender = gender;
        this.dob = dob;
        this.ID = ID;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getNumPeople() {
        return NumPeople;
    }

    public void setNumPeople(int NumPeople) {
        this.NumPeople = NumPeople;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }
    
    public String toString(){
        return super.toString() + "\nNumber of People : " + NumPeople + "\nGender : " + gender + "\nDOB : " + dob + "\nID : " + ID;
    }//end printdetails
    
    

 
}
