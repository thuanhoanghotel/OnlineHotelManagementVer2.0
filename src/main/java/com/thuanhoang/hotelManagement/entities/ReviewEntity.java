package com.thuanhoang.hotelManagement.entities;

import javax.persistence.*;

@Entity
@Table(name = "review")
public class ReviewEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String content;
    private int roomId;
    private int rate;

    @OneToOne
    @JoinColumn(name = "roomId1")
    private RoomEntity roomEntity;

    public ReviewEntity(int id, String content, int roomId, int rate) {
        this.id = id;
        this.content = content;
        this.roomId = roomId;
        this.rate = rate;
    }

    public ReviewEntity() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }
}
