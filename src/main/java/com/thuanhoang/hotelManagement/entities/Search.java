/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thuanhoang.hotelManagement.entities;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author Admin
 */
public class Search {
    private Date timeIn;
    private Date timeOut;
    private int numOfAdult;
    private int numOfChildren;
    private int numOfRoom;

    public Search() {
    }

    public Search(Date timeIn, Date timeOut, int numOfAdult, int numOfChildren, int numOfRoom) {
        this.timeIn = timeIn;
        this.timeOut = timeOut;
        this.numOfAdult = numOfAdult;
        this.numOfChildren = numOfChildren;
        this.numOfRoom = numOfRoom;
    }

    public Date getTimeIn() {
        return timeIn;
    }

    public void setTimeIn(Date timeIn) {
        this.timeIn = timeIn;
    }

    public Date getTimeOut() {
        return timeOut;
    }

    public void setTimeOut(Date timeOut) {
        this.timeOut = timeOut;
    }

    public int getNumOfAdult() {
        return numOfAdult;
    }

    public void setNumOfAdult(int numOfAdult) {
        this.numOfAdult = numOfAdult;
    }

    public int getNumOfChildren() {
        return numOfChildren;
    }

    public void setNumOfChildren(int numOfChildren) {
        this.numOfChildren = numOfChildren;
    }

    public int getNumOfRoom() {
        return numOfRoom;
    }

    public void setNumOfRoom(int numOfRoom) {
        this.numOfRoom = numOfRoom;
    }
    
    
}
