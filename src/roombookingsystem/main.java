/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package roombookingsystem;

import com.formdev.flatlaf.FlatDarculaLaf;

/**
 *
 * @author rudihamilton
 */
public class main {
    public static void main(String[] args){
        FlatDarculaLaf.setup();
        
        
        
        
        RoomAndBookingGUI.main(args);
        LectureHall lectureHall1 = new LectureHall("LH34", 2, 2, 50, "Lecture Hall", "Yes", "Dynamic");
        LectureHall lectureHall2 = new LectureHall("LH39", 6, 1, 70, "Lecture Hall", "No", "Ribbon");
        LectureHall lectureHall3 = new LectureHall("LH20", 10, 3, 45, "Lecture Hall", "No", "Diaphgram");
        
        AppLib.lectureHalls.add(lectureHall1);
        AppLib.lectureHalls.add(lectureHall2);
        AppLib.lectureHalls.add(lectureHall3);
        
        LabRoom labRoom1 = new LabRoom("LB47", 40, 4, 30, "Lab Room", 30, "Windows");
        LabRoom labRoom2 = new LabRoom("LB67", 4, 1, 34, "Lab Room", 34, "Windows");
        LabRoom labRoom3 = new LabRoom("LB30", 10, 3, 25, "Lab Room", 25, "MacOS");
        
        AppLib.labRooms.add(labRoom1);
        AppLib.labRooms.add(labRoom2);
        AppLib.labRooms.add(labRoom3);
    }
}

