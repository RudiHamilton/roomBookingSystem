/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package roombookingsystem;

/**
 *
 * @author rudihamilton
 */
public class LabRoom extends Room{
    private String LabRoom;
    private int NoOfPCs;
    private String OperatingSystem;
    
    public LabRoom(String RoomID, int RoomNumber, int Floor, int Capacity, String LabRoom, int NoOfPCs, String OperatingSystem){
        super(RoomID, RoomNumber, Floor, Capacity);
        this.LabRoom = LabRoom;
        this.NoOfPCs = NoOfPCs;
        this.OperatingSystem = OperatingSystem;
    }
    public int NoOfPCsGet(){
        return NoOfPCs;
    }
    public void NoOfPCsSet(int NoOfPCs){
        this.NoOfPCs = NoOfPCs;
    }
    public String OperatingSystemGet(){
        return OperatingSystem;
    }
    public void OperatingSystemSet(String OperatingSystem){
        this.OperatingSystem = OperatingSystem;
    }
    public String LabRoom(){
        return LabRoom;
    }
    public void LabRoom(String LabRoom){
        this.LabRoom = LabRoom;
    }
}
