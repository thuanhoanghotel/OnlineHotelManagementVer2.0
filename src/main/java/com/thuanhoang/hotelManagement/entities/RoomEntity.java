package com.thuanhoang.hotelManagement.entities;

import javax.persistence.*;

@Entity
@Table(name = "room")
public class RoomEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String roomName;
    private String status;
    private int bookingId;

    @ManyToOne
    @JoinColumn(name = "roomTypeId")
    private RoomTypeEntity roomTypeEntity;

    @OneToOne(mappedBy = "roomEntity")
    private ReviewEntity reviewEntity;

    // note
    @OneToOne(mappedBy = "roomEntities")
    private BookingDetailEntity bookingDetailEntity;

    public RoomEntity(int id, String roomName, String status, int bookingId) {
        this.id = id;
        this.roomName = roomName;
        this.status = status;
        this.bookingId = bookingId;
    }

    public RoomEntity() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }
}
