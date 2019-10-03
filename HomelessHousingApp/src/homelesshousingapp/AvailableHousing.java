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
public class AvailableHousing extends Person {
    private String AddressLine1;
    private String AddressLine2;
    private String AddressLine3;
    private int NumRooms;
    private int Duration;

    public AvailableHousing(String fname, String lname, String contactNo,String AddressLine1, String AddressLine2, String AddressLine3, int NumRooms, int Duration) {
        super(fname, lname, contactNo);
        this.AddressLine1 = AddressLine1;
        this.AddressLine2 = AddressLine2;
        this.AddressLine3 = AddressLine3;
        this.NumRooms = NumRooms;
        this.Duration = Duration;
    }

    public String getAddressLine1() {
        return AddressLine1;
    }

    public void setAddressLine1(String AddressLine1) {
        this.AddressLine1 = AddressLine1;
    }

    public String getAddressLine2() {
        return AddressLine2;
    }

    public void setAddressLine2(String Addressline2) {
        this.AddressLine2 = Addressline2;
    }

    public String getAddressLine3() {
        return AddressLine3;
    }

    public void setAddressLine3(String AddressLine3) {
        this.AddressLine3 = AddressLine3;
    }

    public int getNumRooms() {
        return NumRooms;
    }

    public void setNumRooms(int NumRooms) {
        this.NumRooms = NumRooms;
    }

    public int getDuration() {
        return Duration;
    }

    public void setDuration(int Duration) {
        this.Duration = Duration;
    }
    public String toString(){
        return super.toString() + "\nAddress Line 1 : " + AddressLine1 + "\nAddress Line 2 : " + AddressLine2 + "\nAddress Line 3 : " + AddressLine3 + 
                "\nNumber of Rooms : " + NumRooms + "\nDuration (Days) : " + Duration;
    }//end printdetails
    

    
    
    
     
    
    
    
    
    
}
