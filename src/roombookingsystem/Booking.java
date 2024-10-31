/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package roombookingsystem;


/**
 *
 * @author rudihamilton
 */
public class Booking {
    private String BookingID;
    private String Date;
    private String Time;
    private String ContactPerson;
    private String ContactEmail;
    private String PhoneNumber;
    private Room room;

    
    public Booking(String BookingID, String Date, String Time, String ContactPerson, String ContactEmail, String PhoneNumber, Room room){
        this.BookingID = BookingID;
        this.Date = Date;
        this.Time = Time;
        this.ContactPerson = ContactPerson;
        this.ContactEmail = ContactEmail;
        this.PhoneNumber = PhoneNumber;
        this.room = room;
    }
    public String BookingIDGet(){
        return BookingID;
    }
    public void BookingIDSet(String BookingID){
        this.BookingID = BookingID;
    }
    public String DateGet(){
        return Date;
    }
    public void DateSet(String Date){
        this.Date = Date;
    }
    public String TimeGet(){
        return Time;
    }
    public void TimeSet(String Time){
        this.Time = Time;
    }
    public String ContactPersonGet(){
        return ContactPerson;
    }
    public void ContactPersonSet(String ContactPerson){
        this.ContactPerson = ContactPerson;
    }
    public String ContactEmailGet(){
        return ContactEmail;
    }
    public void ContactEmailSet(String ContactEmail){
        this.ContactEmail = ContactEmail;
    }
    public String PhoneNumberGet(){
        return PhoneNumber;
    }
    public void PhoneNumberSet(String PhoneNumber){
        this.PhoneNumber = PhoneNumber;
    }
    public Room RoomGet(){
        return room;
    }
    public void RoomSet(Room room){
        this.room = room;
    }
}
