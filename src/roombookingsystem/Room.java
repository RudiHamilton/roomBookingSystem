/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package roombookingsystem;


/**
 *
 * @author rudihamilton
 */
public class Room {
    private String RoomID;
    private int RoomNumber;
    private int Floor;
    private int Capacity;
    
    public Room(String RoomID, int RoomNumber, int Floor, int Capacity){
    this.RoomID = RoomID;
    this.RoomNumber = RoomNumber;
    this.Floor = Floor;
    this.Capacity = Capacity;
    }
    public String RoomIDGet(){
        return RoomID;
    }
    public void RoomIDSet(String RoomID){
        this.RoomID = RoomID;
    }
    public int RoomNumberGet(){
        return RoomNumber;
    }
    public void RoomNumberSet(int RoomNumber){
        this.RoomNumber = RoomNumber;
    }
    public int FloorGet(){
        return Floor;
    }
    public void FloorSet(int Floor){
        this.Floor = Floor;
    }
    public int CapacityGet(){
        return Capacity;
    }
    public void CapacitySet(int Capacity){
        this.Capacity = Capacity;
    }
}
