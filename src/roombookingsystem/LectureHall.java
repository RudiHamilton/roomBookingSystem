/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package roombookingsystem;

/**
 *
 * @author rudihamilton
 */
public class LectureHall extends Room{
    private String MicrophoneType;
    private String TieredSeating;
    private String LectureHall;
    
    public LectureHall(String RoomID, int RoomNumber, int Floor, int Capacity, String LectureHall, String MicrophoneType, String TieredSeating){
        super(RoomID, RoomNumber, Floor, Capacity);
        this.LectureHall = LectureHall;
        this.MicrophoneType = MicrophoneType;
        this.TieredSeating = TieredSeating;
    }
    public String MicrophoneTypeGet(){
        return MicrophoneType;
    }
    public void MicrophoneTypeSet(String MicrophoneType){
        this.MicrophoneType = MicrophoneType;
    }
    public String TieredSeatingGet(){
        return TieredSeating;
    }
    public void TieredSeatingSet(String TieredSeating){
        this.TieredSeating = TieredSeating;
    }
    public String LectureHallGet(){
        return LectureHall;
    }
    public void LectureHallSet(String LectureHall){
        this.LectureHall = LectureHall;
    }
}
